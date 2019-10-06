FROM centos:6

# Create app directory
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

# Install the repository
RUN yum -y update; yum clean all
RUN yum -y install epel-release wget telnet;

# Install Java JRE 1.8.152
ADD jre-8u152-linux-x64.rpm /tmp
RUN cd /tmp && \
    rpm -Uvh /tmp/jre-8u152-linux-x64.rpm && \
    alternatives --install /usr/bin/java java /usr/java/jre1.8.0_152/bin/java 2000000


RUN sed -i '$ a export JAVA_HOME=/usr/java/latest' /etc/profile

CMD /bin/bash