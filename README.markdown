Apache CXF, Spring, JPA, & Hibernate Example Project
====================================================

This project demonstrates how Apache CXF (using JAXB), Spring, and Hibernate as a JPA 2.0 provider can be used to create simple persistence web services.

The main project is seperated into 3 sub-projects:

* *contract* - Service and domain object definitions.
* *service* - Service implementation including JPA/Hibernate persistence that builds to a single .war file. The meat of the example code lives here.
* *client* - Sample client which uses a running persistence service and outputs to the console.

Building
--------

In order to build and run the project you will need to download and install [Gradle](http://gradle.org) then run "gradle build".  This will build and produce distributions for all three subj-projects.

Executing "gradle jettyRun" will start a Jetty web application server locally on port 8080 and deploy the service project to http://localhost:8080/service/.

The "gradle eclipse" command will produce eclipse projects for all three sub-projects including proper classpaths with dependencies.

License
-------

[Creative Commons Attribution 3.0 Unported License](http://creativecommons.org/licenses/by/3.0/)

