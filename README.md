# Spring.Coming
Spring 4.X try

##	Project instruction
1.	spring-1
	XMLConfig spring helloWorld.
2.	spring-2
	JavaConfig spring greeting(REST 1st try).
3.	spring-3
	JavaConfig spring greeting using maven & gradle dependency. 
	At last, run application in tomcat(REST 2nd try).
4.	spring-4
	Service--Consuming

#	Build

	##	pkg:

	src/main/java/java_pkg&source

	pom.xml

	build.gradle

	##	custom config
	src/main/resources/application.properties

	server.port: 9000

	management.port: 9001

	management.address: 127.0.0.1

##	Maven

	mvn install

	mvn clean package

	...

##	Gradle

	gradle build

	gradle clean build

	...