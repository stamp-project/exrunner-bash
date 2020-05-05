import sys,os
import csv

######## Methods
def appeared_in_other_format(project_package,splited_line):
    result =  False
    for part in splited_line:
        if ''.join([i for i in project_package if not i.isdigit()]) == ''.join([i for i in part if not i.isdigit()]):
            result = True
    return result



def write_on_csv(output_dir,case,frame_level,classes,methods):

    title_order = [
                   "case",
                   "frame_level",
                   "# of classes",
                   "# of methods"
                   ]
    if not os.path.exists(output_dir):
        with open(output_dir, "w") as  g:
            writer = csv.writer(g)
            writer.writerow(title_order)
    
    row = [case,frame_level,len(classes),len(methods)]
    with open(output_dir, "a") as  g:
            writer = csv.writer(g)
            writer.writerow(row)

    print case+"-"+str(frame_level)+"-> methods: "+str(methods)+"classes: "+str(classes)
########


dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path, "crash-reproduction-new-fitness")

output_dir = os.path.join(dir_path, "classes_and_methods.csv")

with open(os.path.join(root_path, "inputs.csv"), 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        application=row["application"]
        case=row["case"]
        package=row["package"]
        crash_path=os.path.join(dir_path,"crashes",application,case,case+".log")
        print "crash: "+case+"--> "+crash_path
        frame_level=1

        log_file = open(crash_path, "r")
        exceptionType_line_passed=False
        classes=set()
        methods=set()
        for line in log_file:
            if not exceptionType_line_passed:
                exceptionType_line_passed=True
                continue

            if "at" not in line:
                continue

            print str(frame_level)+" -> "+line

            splited_line = line.split('.')
            if len(splited_line) > 1 and (package in splited_line or appeared_in_other_format(package,splited_line)):
                method_name=line.split('at ')[1].split("(")[0]
                class_name=".".join(method_name.split('.')[:-1])
                classes.add(class_name)
                methods.add(method_name)
                write_on_csv(output_dir,case,frame_level,classes,methods)
            frame_level+=1
            
