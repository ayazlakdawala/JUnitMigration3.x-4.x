Unit Testing Frameworks Demo
=========================

This repository consists of 3 demo projects and 1 source project which demonstrate functional differences and unit testing capabilities of **_JUnit 3, JUnit 4 and Spock_**.

Prerequisites:
-------------------

* Download and install **_Maven_** from [http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html]
* Install Groovy plugin in your preferred IDE.

Steps to follow:
---------------------
1. Clone the project.
2. Maven build **_JUnitUpgradeSource_** project so that it is available in maven's local repository.
3. **_JUnitUpgradeSource_** jar is referred as one of the dependency in all the 3 demo projects. It provides the source code which will be tested by 3 Unit testing frameworks.
4. Run the unit tests for each demo project.

Presentation:
-----------------------

Kindly refer to the **_TechiNar Series-Unit Testing Frameworks Demo.pptx_** which covers in-depth information for all the aspects covered in these projects.

Unit Testing functionalities covered in the demo projects:
-----------------------------------------------------------------------------

1.JUnit3.xDemo
-----------------------------
1.  Test suite creation
2.  Testing exceptions
3.  Testing exception with exception messages
4.  One time setup and tear down
5.  Setup and tear down per test

2.JUnit4.xDemo
---------------------------
1.  Test suite creation
2.  Testing exceptions
3.  Testing exception with exception messages
4.  One time setup and tear down
5.  Setup and tear down per test
6.  Integration with **_Spring_**
7.  Integration with **_Powermockito_**
  * Mocking DAOs
  * Mocking private method calls
8.  Parameterized testing with 3rd party **_JUnitParamsRunner_**
9. Parameterized testing with in built **_Parameterized_** runner class

3.SpockDemo
-------------------------
1.  One time setup
2.  Integration with **_Powermockito_**
  * Mocking private methods
3.  Mocking using Spock's in built mocking api 

