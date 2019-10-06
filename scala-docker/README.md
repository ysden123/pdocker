# scala-docker
Scala docker starter

# Build

## Create jar

```shell script
sbt assembly
```
## Create container
```shell script
docker build -t scala-docker-starter .
```

# How to run

```shell script
docker run -t --name scala-docker-starter scala-docker-starter
```

or 

```shell script
docker-compose up
```
