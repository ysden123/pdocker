# kafka-docker
Kafka Docker

## How to build
1. Download RPM with JRE and put under /StulSoft/kafka-docker from[Oracle Java Downloads](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
1. Update Dockerfile if new version will be used
1. Login to your docker
1. cd /StulSoft/kafka-docker
1. Run: ```docker build -t kafka-server .```

## How to run
### Create container
Do it one time only.

Run with login to the machine:
```
 docker run -it -v /win_share/.bashrc:/root/.bashrc -v /StulSoft:/StulSoft -p 9092:9092 -p 2181:2181 --name kafka-server kafka-server
```
Run as daemon:
```
docker run -td -v /win_share/.bashrc:/root/.bashrc -v /StulSoft:/StulSoft -p 9092:9092 -p 2181:2181 --name kafka-server kafka-server
```
### Start created container
Run command
```
docker start kafka-server
docker exec -it kafka-server bash
```
### Running on duplicated session
1. Duplicate open Putty session
1. Login
1. Run command
```
docker exec -it kafka-server bash
```