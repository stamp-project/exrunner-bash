# ExRunner-bash

Exrunner-bash contains multiple python and bash scripts to evaluate the newly developed features of botsing.

This project contains the following fixed directories:

1- `/bins/` Contains the bytecodes of software under test in JCrashPack.

2- `/crashes/` Contains the stack trace logs in JCrashPack.

3- `/lib/` Contains the botsing-reproduction jar file.

4- `/model-generation/` this directory contains the scripts generating the models for model seeding.

The other directories which start with `crash-reproduction` are for running botsing with different features. Each of these directories contains the input CSV file (`input.csv`), and bash/python scripts needed for running the tool. For instance, `crash-reproduction-model-seeding` is for running botsing model seeding. 

The rational behind having multiple directories is that it makes the experiment easier to be executed on multiple servers. 



For running botsing, first, we need to choose the right directory. Then, we should update the input CSV file (For generating input CSV file use input generator). Finally, we can start botsing execution by running `main.sh`. 

Each `crash-reproduction-*` directory contains two other bash files: `observer.sh` and `parsing.sh`. The former observes the botsing executions and kill them if they get stuck for `X` minutes. The latter parses the valuable information from the execution log and save it in `results/results.csv`.

The execution logs of botsing is saved in `logs/` directory. Also, the important information about each execution is saved in `results/results.csv`.

Moreover, each `crash-reproduction-*` directory has a `python/` directory. This directory contains small python scripts that utilize the main bash scripts.