FROM centos:6

# Create app directory
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

# Install the repository
RUN yum -y update; yum clean all
RUN yum -y install epel-release wget telnet;



# Install Java JRE 1.8.162
ADD jre-8u162-linux-x64.rpm /tmp
RUN cd /tmp && \
    rpm -Uvh /tmp/jre-8u162-linux-x64.rpm && \
    alternatives --install /usr/bin/java java /usr/java/jre1.8.0_162/bin/java 2000000


RUN sed -i '$ a export JAVA_HOME=/usr/java/latest' /etc/profile

# Install Kafka 1.0.0
RUN cd ~ && \
 wget http://www-us.apache.org/dist/kafka/1.0.0/kafka_2.12-1.0.0.tgz && \
 tar -xvf kafka_2.12-1.0.0.tgz && \
 mv kafka_2.12-1.0.0 /opt && \
 cd /opt/kafka_2.12-1.0.0 && \
 sed -i 's/export KAFKA_HEAP_OPTS="-Xmx1G -Xms1G"/export KAFKA_HEAP_OPTS="-Xmx256M -Xms128M"/' bin/kafka-server-start.sh
 # && \
 # Set Docker container IP in server.config file of Kafka
 #sed -i 's/#listeners=PLAINTEXT:\/\/:9092/listeners=PLAINTEXT:\/\/'$(/sbin/ifconfig eth0 | grep 'inet addr:' | cut -d: -f2 | awk '{ print $1}')':9092/' /opt/kafka_2.12-1.0.0/config/server.properties && \
 #sed -i 's/#advertised.listeners=PLAINTEXT:\/\/your.host.name:9092/advertised.listeners=PLAINTEXT:\/\/'$(/sbin/ifconfig eth0 | grep 'inet addr:' | cut -d: -f2 | awk '{ print $1}')':9092/' /opt/kafka_2.12-1.0.0/config/server.properties

EXPOSE 9092 2181

CMD /opt/kafka_2.12-1.0.0/bin/zookeeper-server-start.sh -daemon /opt/kafka_2.12-1.0.0/config/zookeeper.properties && /opt/kafka_2.12-1.0.0/bin/kafka-server-start.sh -daemon /opt/kafka_2.12-1.0.0/config/server.properties && /bin/bash