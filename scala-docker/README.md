# scala-docker
Scala docker starter

# Build

## Create jar

```shell script
sbt assembly
```
## Create container
```shell script
docker build -t ysden123/scala-docker-starter .
```

# How to run

```shell script
docker run -t --name ysden123/scala-docker-starter scala-docker-starter
```

or 

```shell script
docker-compose up
```
