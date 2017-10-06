#https://hub.docker.com/r/centos/wildfly/
FROM centos/wildfly

# Upgrading system
RUN yum -y upgrade
RUN yum -y install wget

# Install R studio


#FROM centos
#ENV JAVA_VERSION 8u144
#ENV BUILD_VERSION b01
# Upgrading system
#RUN yum -y upgrade
#RUN yum -y install wget
# Downloading & Config Java 8
#RUN wget --no-cookies --no-check-certificate --header "Cookie: oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u144-b01/090f390dda5b47b9b721c7dfaa008135/jdk-8u144-linux-x64.rpm" -O /tmp/jdk-8-linux-x64.rpm
#RUN yum -y install /tmp/jdk-8-linux-x64.rpm
#RUN alternatives --install /usr/bin/java jar /usr/java/latest/bin/java 200000
#RUN alternatives --install /usr/bin/javaws javaws /usr/java/latest/bin/javaws 200000
#RUN alternatives --install /usr/bin/javac javac /usr/java/latest/bin/javac 200000

#Download R Studio
EXPOSE 8080

#spring boot jar
#VOLUME /tmp
#ADD /maven/sfg-thymeleaf-course-0.0.1-SNAPSHOT.jar sfg-thymeleaf-course.jar
#RUN sh -c 'touch /sfg-thymeleaf-course.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/sfg-thymeleaf-course.jar"]