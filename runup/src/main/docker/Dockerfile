################################################################
# Dockerfile to build Wildfly 9.0.1 container image for Jelastic
# Based on Centos 7
################################################################

#Jelastic Centos7 base image is used fo building
FROM jelasticdocker/jelastic-centos7-base:latest
MAINTAINER Jelastic,Inc
ENV WILDFLY_VERSION 10.1.0.Final
ENV ADMIN_USER jelastic
ENV ADMIN_PASSWORD jelastic

# Upgrading system
RUN yum -y upgrade
RUN yum -y install wget
RUN yum -y install sudo
RUN yum -y install systemctl

#Installing OpenJDK8
#RUN yum -y install java-1.8.0-openjdk-devel tar && yum -y update;

# Downloading & Config Java 8
RUN wget --no-cookies --no-check-certificate --header "Cookie: oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u144-b01/090f390dda5b47b9b721c7dfaa008135/jdk-8u144-linux-x64.rpm" -O /tmp/jdk-8-linux-x64.rpm
RUN yum -y install /tmp/jdk-8-linux-x64.rpm
RUN alternatives --install /usr/bin/java jar /usr/java/latest/bin/java 200000
RUN alternatives --install /usr/bin/javaws javaws /usr/java/latest/bin/javaws 200000
RUN alternatives --install /usr/bin/javac javac /usr/java/latest/bin/javac 200000

# Instalcja R i RStudio
RUN sudo yum install epel-release
RUN sudo yum update
RUN sudo yum install R -y

#RUN adduser miki
#RUN passwd miki
#RUN usermod -aG wheel miki
#RUN su miki

RUN wget "https://download2.rstudio.org/rstudio-server-rhel-1.0.153-x86_64.rpm"
RUN sudo yum install --nogpgcheck rstudio-server-rhel-1.0.153-x86_64.rpm -y

RUN sudo rstudio-server verify-installation
#RUN sudo rstudio-server start
 
#RUN sudo firewall-cmd --permanent --zone=public --add-port=8787/tcp
#RUN sudo firewall-cmd --reload
#RUN sudo systemctl status rstudio-server.service
#RUN sudo systemctl enable rstudio-server.service

#Downloading and unpacking the Wildfly application server
RUN cd /opt && curl -O https://download.jboss.org/wildfly/$WILDFLY_VERSION/wildfly-$WILDFLY_VERSION.tar.gz \
	&& $(which tar) xf wildfly-$WILDFLY_VERSION.tar.gz \
	&& rm wildfly-$WILDFLY_VERSION.tar.gz
#Creating symbolic lynk for easier access to server directory
RUN ln -s /opt/wildfly-$WILDFLY_VERSION /opt/wildfly

#Instalacja dodatkowych paczek R
#RUN sudo yum groupinstall "Development Tools" -y
#RUN sudo -i R
#RUN install.packages('txtplot')
#RUN q()


EXPOSE 80 443 8080 8743 9990 9993 8009 4848 4949 8787

#Setting the entrypoint
ENTRYPOINT ["/bin/bash"]


#spring boot jar
#VOLUME /tmp
#ADD /maven/sfg-thymeleaf-course-0.0.1-SNAPSHOT.jar sfg-thymeleaf-course.jar
#RUN sh -c 'touch /sfg-thymeleaf-course.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/sfg-thymeleaf-course.jar"]