====================================
TruNarrative - Automation Framework
by Raj Singh
====================================

This project contains the automated test script for the user journey
described in the technical test document. The script is written in Java
to cover the automation User Interface testing.


------
Tools:
------

Built using the following tools:
    - Java 1.8.0_211
    - Maven 3.6.1
    - IntelliJ Community Edition 2018.3
    - JUnit 4.11
    - Cucumber 1.2.5
    - Selenium WebDriver 3.14.0
    - ChromeDriver 76.0.3809.126
    - Log4J 1.2.17
    - Serenity 1.2.
    - OS Windows 10


-------------------------
Installation/How to Run:
-------------------------

Note: This framework will work fully on a Windows machine.
Ensure you create a directory in C:/ called workspace in order for the logging to work.

Install Java and Apache Maven onto your machine.
Ensure your environment variables have Java Home (jdk) and Maven Home on the System Variable path.
Unzip the file to C:/workspace and double click on the RunTests.bat file.
Alternatively, navigate to the unzipped file in the command window and type:
mvn clean integration-test verify


--------------
View the logs:
--------------

log4j is configured to DEBUG and will print the log statements to a file.
The log4j configuration file can be found in:
src -> main -> resources -> log4j.properties

The resulting log file that is created after execution is found in:
logs -> logging.log

Logging will only be generated when the framework is ran within IntelliJ IDE.


-----------------
View the reports:
-----------------

After the tests have executed, the "verify" command, in the batch file, will aggregate the results
into a HTML report. This report can be found in the following location after execution:
target -> site -> serenity -> index.html