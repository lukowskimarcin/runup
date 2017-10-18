FROM jboss/wildfly
#USER jboss  RUN /opt/jboss/wildfly/bin/add-user.sh admin adminadmin --silent  
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "--debug"]
COPY /maven/runup.war /opt/jboss/wildfly/standalone/deployments/
