experiment=$1
LIMIT=$2
IFS=$'\n'
docker stop $(docker ps -a -q)
# Remove old containers
docker rm $(docker ps -a -q)
# Remove previous docker images
# docker rmi $(docker images -a -q)


# Build a new docker image
docker image build -t tudelft/exrunner $(pwd)

# After building the the image, we will run the container
docker run -dit --name exrunner-container  \
--mount type=bind,source="$(pwd)/$experiment/consoleLog",target=/reproduction/$experiment/consoleLog \
--mount type=bind,source="$(pwd)/$experiment/logs",target=/reproduction/$experiment/logs \
--mount type=bind,source="$(pwd)/$experiment/results",target=/reproduction/$experiment/results \
--mount type=bind,source="$(pwd)/crashes",target=/reproduction/crashes \
--mount type=bind,source="$(pwd)/bins",target=/reproduction/bins \
tudelft/exrunner
# And execute main.sh in the running container
 docker exec -it exrunner-container bash -c "cd $experiment; bash main.sh $LIMIT"
