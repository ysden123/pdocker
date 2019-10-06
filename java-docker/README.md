# java-docker
Java docker

## How to build
1. Download RPM with JRE and put under /StulSoft/kafka-docker from[Oracle Java Downloads](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
1. Update Dockerfile if new version will be used
1. Login to your docker
1. cd /StulSoft/java-docker
1. Run: ```docker build -t java-docker .```

## How to run
### Create container
Do it one time only.

Run with login to the machine:
```
docker run -it -v /win_share/.bashrc:/root/.bashrc -v /StulSoft:/StulSoft --name java-docker java-docker
```
Run as daemon:
```
docker run -td -v /win_share/.bashrc:/root/.bashrc -v /StulSoft:/StulSoft --name java-docker java-docker
```
### Start created container
Run command
```
docker start java-docker
docker exec -it java-docker bash
```
### Running on duplicated session
1. Duplicate open Putty session
1. Login
1. Run command
```
docker exec -it java-docker bash
```