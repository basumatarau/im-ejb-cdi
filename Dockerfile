FROM glassfish

COPY ear/target/ear-0.0.1-SNAPSHOT.ear $GLASSFISH_HOME/glassfish/domains/domain1/autodeploy/


