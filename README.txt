Simple Spring Boot Calculator App
=================================

Structure:
- pom.xml
- src/main/java/com/example/simpleapp/SimpleAppApplication.java
- src/main/java/com/example/simpleapp/CalculatorController.java
- src/main/resources/static/index.html

How to run:
1. Install JDK 11+ and Maven.
2. In the project root (where pom.xml is), run:
     mvn spring-boot:run
   or build jar:
     mvn package
   then run:
     java -jar target/simple-spring-boot-app-0.0.1-SNAPSHOT.jar
3. Open http://localhost:8080/ in your browser.

API:
GET /calculate?a=<num>&b=<num>&op=<op>
op can be +, -, *, /, %

Notes:
- This is a minimal example to get you started. Let me know if you want a Maven multi-module project, Dockerfile, or tests added.
