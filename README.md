# chapter1-SimpleSpringApplication
With basic understanding of the Spring Framework, we can create a Simple Spring Application example

Welcome to the chapter1-SimpleSpringApplication wiki!

With basic understanding of the Spring Framework, we can create a simple Spring application example. We will write a simple Spring application that will print greeting message to user. 

# External JARs 
* spring-aop-4.1.4.RELEASE 
* spring-aspects-4.1.4.RELEASE 
* spring-beans-4.1.4.RELEASE 
* spring-context-4.1.4.RELEASE
* spring-context-support-4.1.4.RELEASE 
* spring-core-4.1.4.RELEASE 
* spring-expression-4.1.4.RELEASE 
* commons-logging-1.2 

# beans.xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans 
		http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/context 
		http://www.springframework.org/schema/context/spring-context-4.1.xsd">

	<context:component-scan base-package="org.springframework.chapter1.service" />

</beans>

# Output
Welcome to Chapter-1 of book Learning Spring Application Development
