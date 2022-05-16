# Learn Automation Testing with Java and Selenium

## Your First Steps towards Great Automation Tester

* [Course Overview](#course-overview)
  - [Course Steps](#step-list)
  - [Expectations](#expectations)
* [Installing Eclipse, Maven and Java](#installing-tools)
* [Running Examples](#running-examples)
* [About in28Minutes](#about-in28minutes)
  - [Our Beliefs](#our-beliefs)
  - [Our Approach](#our-approach)
  - [Find Us](#useful-links)
  - [Other Courses](#other-courses)

## Course Checklist

## Getting Started
- Eclipse - https://courses.in28minutes.com/p/eclipse-tutorial-for-beginners
- Maven - https://courses.in28minutes.com/p/maven-tutorial-for-beginners-in-5-steps
- JUnit - https://courses.in28minutes.com/p/junit-tutorial-for-beginners
- Mockito - https://courses.in28minutes.com/p/mockito-for-beginner-in-5-steps

## Installing Tools
- Installation Video : https://www.youtube.com/playlist?list=PLBBog2r6uMCSmMVTW_QmDLyASBvovyAO3
- GIT Repository For Installation : https://github.com/in28minutes/getting-started-in-5-steps
- PDF : https://github.com/in28minutes/SpringIn28Minutes/blob/master/InstallationGuide-JavaEclipseAndMaven_v2.pdf

## Running Examples
- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one).
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the right project
- Choose the Spring Boot Application file (search for file with @SpringBootApplication)
- Right Click on the file and Run as Java Application
- You are all Set
- For help : use our installation guide - https://www.youtube.com/playlist?list=PLBBog2r6uMCSmMVTW_QmDLyASBvovyAO3

### References

#### Selenium Standalone

- Manual Installation - https://github.com/lmc-eu/steward/wiki/Selenium-server-&-browser-drivers
- Automated Installation - https://www.npmjs.com/package/selenium-standalone
- URL - http://localhost:4444/wd/hub

##### Installation and Launch

- Step I : Install NPM
- Step II : Install selenium-standalone
Terminal or Command Prompt
```
# In Windows, Run CMD as Administrator

npm install selenium-standalone@latest -g
# If need use sudo npm install selenium-standalone@latest -g

selenium-standalone install
# if needed use sudo 
```
- Step III : Launch Selenium Standalone
```
selenium-standalone start
```

> By default, google chrome, firefox and phantomjs are available when installed on the host system
```
# install a single driver within the default list (chrome, ie, edge, firefox) 
selenium-standalone install --singleDriverInstall=chrome
```

Reference 
- More Options - https://www.npmjs.com/package/selenium-standalone#command-line-interface

#### Selenium Grid
- URL -http://localhost:4444/grid/console

##### Installation and Launch
- Follow Step I and II of Selenium Standalone
- Step III

```
selenium-standalone start -- -role hub
selenium-standalone start -- -role node -hub http://localhost:4444/grid/register
selenium-standalone start -- -role node -hub http://localhost:4444/grid/register -port 5556

selenium-standalone start -- -role node -hub http://localhost:4444/grid/register -browser browserName=firefox

selenium-andalone start -- -role node -hub http://localhost:4444/grid/register -port 5556 -browser browserName=chrome,maxInstances=2
```

#### Code Snippets

##### Maven Dependencies

###### JUnit

```xml
  <dependencies>
  
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.13.0</version>
      <scope>test</scope>
    </dependency>

  
    <!-- https://github.com/bonigarcia/webdrivermanager -->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>2.2.4</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>1.0.13</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
  
  </dependencies>
```
###### Test NG

```xml
  <dependencies>

    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.13.0</version>
      <scope>test</scope>
    </dependency>

    <!-- https://github.com/bonigarcia/webdrivermanager -->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>2.2.4</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>1.0.13</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>6.14.3</version>
      <scope>test</scope>
    </dependency>

  </dependencies>

```

###### Other Dependencies

```xml
    <dependency>
      <groupId>org.assertj</groupId>
      <artifactId>assertj-core</artifactId>
      <version>3.10.0</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>com.opencsv</groupId>
      <artifactId>opencsv</artifactId>
      <version>3.4</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.apache.poi</groupId>
      <artifactId>poi</artifactId>
      <version>3.6</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.apache.poi</groupId>
      <artifactId>poi-ooxml</artifactId>
      <version>3.6</version>
      <scope>test</scope>
    </dependency>

```


##### Java Code

###### Chrome Driver

```java
  ChromeDriverManager.getInstance().setup();
  driver = new ChromeDriver();
```

###### Firefox Driver

```java
  FirefoxDriverManager.getInstance().setup();
  driver = new FirefoxDriver();
```

###### Excel Data Reader
```java
package com.in28minutes.datadriventests;

import java.io.File;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadUtil {
  public static String[][] readExcelInto2DArray(String excelFilePath, String sheetName, int totalCols) {

    File file = new File(excelFilePath);

    String[][] tabArray = null;

    try {
      OPCPackage opcPackage = OPCPackage.open(file.getAbsolutePath());

      Workbook wb = WorkbookFactory.create(opcPackage);

      Sheet sheet = wb.getSheet(sheetName);

      int totalRows = sheet.getLastRowNum() + 1;

      tabArray = new String[totalRows][totalCols];

      for (int i = 0; i < totalRows; i++) {
        for (int j = 0; j < totalCols; j++) {
          Cell cell = sheet.getRow(i).getCell(j);
          System.out.println(cell + " " + i + " " + j);

          if (cell == null)
            continue;

          switch (cell.getCellType()) {
          case Cell.CELL_TYPE_BOOLEAN:
            tabArray[i][j] = String.valueOf(cell.getBooleanCellValue());
            break;
          case Cell.CELL_TYPE_NUMERIC:
            tabArray[i][j] = String.valueOf(cell.getNumericCellValue());
            break;
          case Cell.CELL_TYPE_STRING:
            tabArray[i][j] = cell.getStringCellValue();
            break;
          default:
            tabArray[i][j] = "";
            break;
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }

    return tabArray;
  }

}

```


##### TestNG (testng.xml)

```
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="First Suite" verbose="1">
</suite>
```

##### AbstractChromeWebDriverTest

```java
package com.in28minutes.webdriver.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractChromeWebDriverTest {

  protected WebDriver driver;

  public AbstractChromeWebDriverTest() {
    super();
  }

  @BeforeTest
  public void beforeTest() {
    //Download the web driver executable
    WebDriverManager.chromedriver().setup();
    
    //Create a instance of your web driver - chrome
    driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
    driver.quit();
  }
  
  public void sleep(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
```

#### Resources

##### Plugins
- Eclipse Plugin for TestNg - http://beust.com/eclipse

##### Selenium IDE
- Selenium IDE will no longer work from Firefox 55
   - https://seleniumhq.wordpress.com/2017/08/09/firefox-55-and-selenium-ide/
- A new version of Selenium IDE for Selenium 3 is being built
   - https://seleniumhq.wordpress.com/2018/08/06/selenium-ide-tng/

##### Troubleshooting
- Troubleshooting Guide - https://github.com/in28minutes/in28minutes-initiatives/tree/master/The-in28Minutes-TroubleshootingGuide-And-FAQ
- Troubleshooting Guide for Maven Issues - https://github.com/in28minutes/in28minutes-initiatives/tree/master/The-in28Minutes-TroubleshootingGuide-And-FAQ#error---you-are-not-using-a-jdk

##### Browsers
- WebDriver Specification - https://www.w3.org/TR/webdriver/
- Firefox version 47.0+ Geckodriver is needed to interact with Firefox - Similar to Chrome.
- https://ftp.mozilla.org/pub/firefox/releases/61.0.1/
- https://ftp.mozilla.org/pub/firefox/releases/54.0.1/

## Overview

### Introduction

Writing your first automation test is a lot of fun.

Java is one of the most popular programming languages. Java offers both object oriented and functional programming features. Selenium can be used for screen scraping and automating repeated tasks on browser.

In this course, you will learn the basics of programming with Java and Automation Testing with Selenium. 

We take an hands-on approach using Eclipse as an IDE to illustrate more than 200 Java Coding Exercises, Puzzles and Code Examples. We will also write more than 100 Selenium automation tests with Java for a wide variety of scenarios.

In more than 350 Steps, we explore the most important Java Programming Features and Selenium Automation Testing Scenarios
- Basics of Java Programming - Expressions, Variables and Printing Output
- Using Selenium IDE and Katalon Studio to Record and Replay Automation Testing Scenarios
- Exporting Automation Tests and Setting up new Maven Project for JUnit and TestNG 
- TestNG vs JUnit
- TestNG Advanced Features - XML Suite, Test Reports, Running Tests with Parameters defined in XML and Running Tests in Parallel
- Basics of HTML, CSS and XPath
- Selenium Locators - By Id, By Name, By Link Text, By Partial Link Text, By Class, CSS Selectors and XPath Expressions
- Setting and Reading values from Form Elements - Text, TextArea, CheckBox , Radio Button, Select Box and Multi Select Box
- Advanced Selenium Automation Testing Scenarios - Playing with Windows, Modal Windows (Sleep, Implicit Wait and Explicit Waits), Alert Boxes, Window Handles and New Browser Window Launches, Frames, Taking Screenshots, Executing JavaScript Code, Actions Interface to control mouse and keyboard
- Set up Automation Testing Frameworks - Tables
- Important Interfaces - WebDriver
- Introduction to Cross Browser Automation Testing, Headless Testing and Setting up a Basic Cross Browser Automation Testing Framework
- Writing Data Driven Testing with Data Providers, CSV and Excel Spreadsheets
- Implementing Page Object Model for a Complex Test Scenario
- Scaling up with Selenium Standalone and Grid
- Java Operators - Java Assignment Operator, Relational and Logical Operators, Short Circuit Operators
- Java Conditionals and If Statement
- Methods - Parameters, Arguments and Return Values
- An Overview Of Java Platform - java, javac, bytecode, JVM and Platform Independence - JDK vs JRE vs JVM
- Object Oriented Programming - Class, Object, State and Behavior
- Basics of OOPS - Encapsulation, Abstraction, Inheritance and Polymorphism
- Basics about Java Data Types - Casting, Operators and More
- Java Built in Classes - BigDecimal, String, Java Wrapper Classes
- Conditionals with Java - If Else Statement, Nested If Else, Java Switch Statement, Java Ternary Operator
- Loops - For Loop, While Loop in Java, Do While Loop, Break and Continue
- Java Array and ArrayList - Java String Arrays, Arrays of Objects, Primitive Data Types, toString and Exceptions
- Java Collections - List Interface(ArrayList, LinkedList and Vector), Set Interface (HashSet, LinkedHashSet and TreeSet), Queue Interface (PriorityQueue) and Map Interface (HashMap, HashTable, LinkedHashMap and TreeMap() - Compare, Contrast and Choose
- Generics - Why do we need Generics? Restrictions with extends and Generic Methods, WildCards - Upper Bound and Lower Bound.
- Introduction to Exception Handling - Your Thought Process during Exception Handling. try, catch and finally. Exception Hierarchy - Checked Exceptions vs Unchecked Exceptions. Throwing an Exception. Creating and Throwing a Custom Exception - CurrenciesDoNotMatchException. Try with Resources - New Feature in Java 7.

You will be using Eclipse and Brackets as the IDE. You will be using Maven, npm (Dependency Management), TestNG (XML Test Suite, Parallel, Multiple Browsers), JUnit, Selenium IDE, Katalon Studio, Selenium Standalone and Selenium Grid. We will help you set up each one of these.

- Tools : Maven, JUnit, TestNG (XML Test Suite, Groups, Listeners, Parallel, Multiple Browsers), Selenium IDE, Katalon Studio, Brackets
- Concepts : HTML, DOM, XPath, Selenium Architecture, Reporting (HTML), Parallel Execution (Data Driven Tests, Browsers, Test Ng, Grid), Debugging (Screenshots/logs), Page Object Model, Data Driven(Excel), Keyword Driven, Record and Replay, Selenium Grid, Cross Browser Testing, DRY
- Basics : Selenium Web Driver, Locating Web Elements(link text, name, id, xpath, css), Different Elements(select, radio, web tables, drag and drop, javascript alerts, windows, popups, iframes, switching windows), Wait (Explicit/Implicit), JavaScript Executor Action Class, Mouse movement, Keyboard with Selenium)
- Tips : Selenium Web Driver is an Interface, Headless Testing(PhantomJS, Chrome)

### What You will learn
- You will learn how to think as a Java Programmer
- You will learn how to start your journey as a Java Programmer
- You will learn the basics of Eclipse IDE and JShell
- You will learn to develop awesome object oriented programs with Java
- You will learn to use Selenium IDE and Katalon Studio to Record and Replay Automation Testing Scenarios
- You will learn to setup new automation projects with Selenium, Web Driver, JUnit and TestNG Frameworks
- You will learn some of the TestNG Advanced Features - XML Suite, Test Reports, Test Parameters and Parallel Execution
- You will learn the basics of HTML, CSS and XPath
- You will understand all Selenium Locators - By Id, By Name, By Link Text, By Partial Link Text, By Class, CSS Selectors and XPath Expressions
- You will learn to play with Form Elements - Text, TextArea, CheckBox , Radio Button, Select Box and Multi Select Box
- You will learn to write automation test for wide range of scenarios - Playing with Windows, Modal Windows (Sleep, Implicit Wait and Explicit Waits), Alert Boxes, Window Handles and New Browser Window Launches, Frames, Taking Screenshots, Executing JavaScript Code, Actions Interface to control mouse and keyboard
- You will learn to Set up Automation Testing Frameworks for Form Elements, Tables and Cross Browser Testing
- You will learn to write Data Driven Tests with Data Providers, CSV and Excel Spreadsheets
- You will learn to implement Page Object Model for a Complex Automation Test Scenario
- You will learn to parallelize and scale up Automation Tests with Selenium Standalone and Grid


### Requirements
- You should have the ability to learn while having fun!
- Connectivity to Internet to download various tools needed.
- We will help you install Selenium IDE, Katalon Studio, Brackets, Java, NodeJs and Eclipse.
- We will help you download all needed dependencies using Maven and NPM

## Step Wise Details

### 00 - Overview

- 00 - 00 Introduction to Automation Testing with Java and Selenium
- 00 - 01 Automation Testing with Java and Selenium - Course Guide.pdf
- 00 - 02 How To Make Best use of the Course Guide?
- 00 - 03 Installing Java and Eclipse

### 01 - Getting Started with Selenium, JUnit and TestNG
 
 - Step 01 - Getting Started with Selenium - An Overview
 - Step 02 - Installing Selenium IDE
 - Step 03 - Recording and Replaying Google Search with Selenium IDE
 - Step 04 - Exercise - Recording Facebook Login
 - Step 05 - Advanced Features in Selenium IDE
 - Step 06 - Alternative for Selenium IDE - Katalon Studio
 - Step 07 - Installing and Recording Tests with Katalon Studio
 - Step 08 - Advanced Features of Katalon Studio
 - Step 09 - Export Unit Tests and Set up new Maven Project
 - Step 10 - Adding Maven Dependencies for JUnit, Web Driver Manager and Web Driver
 - Step 11 - Fixing Driver Error with ChromeDriverManager
 - Step 12 - Exercise - Run Facebook JUnit Test
 - Step 13 - Running a Selenium Automation Test - What is happening in Background
 - Step 14 - Install TestNG Plugin and Create New Project with TestNG
 - Step 15 - Export and Run TestNG Test for Google and Facebook
 - Step 16 - Comparing TestNG and JUnit Tests and Course Overview

### 02 - TestNG vs JUnit

 - Step 01 - Introduction to TestNG vs JUnit
 - Step 02 - Creating a Unit Test for SimpleClass
 - Step 03 - Adding Asserts to Unit Test
 - Step 04 - Exercise - Write more unit test Scenarios
 - Step 05 - Writing Selenium JUnit Automation Test for Google - Part 1
 - Step 06 - Writing Selenium JUnit Automation Test for Google - Part 2
 - Step 07 - Exploring WebDriver Interface
 - Step 08 - Writing Selenium JUnit Automation Test for Google - Part 3
 - Step 09 - Reducing Duplication with @Before and @After JUnit Annotations
 - Step 10 - Time for TestNG - Convert Unit Test to TestNG
 - Step 11 - TestNG Advanced Features - XML Suite and Test Reports
 - Step 12 - TestNG Advanced Features - Running Tests with Parameters defined in XML
 - Step 13 - TestNG Advanced Features - Running Tests in Parallel

### 03 - Getting Started with HTML, CSS and XPath

 - Step 01 - Why should you learn HTML and CSS
 - Step 02 - How does Web Work - Request, Response, HTML and Browser
 - Step 03 - Installing Web Editor - Brackets
 - Step 04 - First HTML File - Tags, HTML, Head and Body
 - Step 05 - Basic HTML Tags - Paragraph, Div, Heading - H1 to H6
 - Step 06 - Formatting Tags - Bold, Italicized and Quotes
 - Step 07 - Using Tags without closing tag - BR and HR
 - Step 08 - W3C Standards for HTML
 - Step 09 - Creating List of elements with UL LI and OL
 - Step 10 - Organizing Your Data Using Tables
 - Step 11 - Organizing Your Data Using Tables - Exercise Solutions
 - Step 12 - HTML Attributes and Links - Absolute and Relative
 - Step 13 - Image Tag in HTML - Local and Internet Links
 - Step 14 - Introduction to Live Preview Feature in Brackets
 - Step 15 - Nesting of Divs and Understanding align Attribute
 - Step 16 - Getting Data from User using Forms - Text and TextArea
 - Step 17 - Attributes on Text Elements - Size, maxlength, value
 - Step 18 - Choosing among multiple options using Radio Buttons
 - Step 19 - Choosing among multiple options using Select Box
 - Step 20 - Choosing Yes or No with Check Box
 - Step 21 - Submitting a Form and Understanding GET and POST
 - Step 22 - Introduction to Frames
 - Step 23 - Miscellaneous - Password Fields, File Input and Multi Select Box
 - Step 24 - Introduction to CSS
 - Step 25 - CSS for input, select and text area
 - Step 26 - CSS attributes with color, background color
 - Step 27 - Grouping Form Elements with fieldset
 - Step 28 - Styling Fieldsets with CSS
 - Step 29 - Exercise - Styling Lists
 - Step 30 - Using an External CSS File
 - Step 31 - Understanding Class in CSS
 - Step 32 - Making best use of Class in CSS and Multiple Classes
 - Step 33 - Using id with CSS
 - Step 34 - Understanding CSS Selectors and Testing using $$ function
 - Step 35 - CSS Selectors - Identifying Input Element
 - Step 36 - Introduction to XPath Expressions - Absolute and Relative
 - Step 37 - Using id and class in XPath Expressions
 - Step 38 - Using XPath on the Forms Page
 - Step 39 - A Review of XPath Expressions and CSS Selectors

### 04 - Setting up First Web Application

 - Step 01 - Setting up First Web Application
 - Step 02 - Refactoring Shortcuts To Learn
 - Step 03 - My Favorite Shortcuts - Ctrl + 1 and Ctrl + Space

### 05 - Selenium Automation - Locators

 - Step 01 - Introduction to the Section
 - Step 02 - Setting up New Project with TestNG
 - Step 03 01 - Selenium Locators - Locate Elements By Id and WebElement Interface
 - Step 03 02 - Exercise - Selenium Locators - Locate Elements By Id
 - Step 04 - Selenium Locators - Locate Elements By Name - Part 1
 - Step 05 - Selenium Locators - Locate Elements By Name - Part 2
 - Step 06 - Abstracting @BeforeTest and @AfterTest to common super class AbstractChromeWebDriverTest
 - Step 07 - Debugging Errors - Element Not Found Exception
 - Step 08 - Selenium Locators - Locate Elements By Tag Name
 - Step 09 - Finding Multiple Matching Elements with findElements
 - Step 10 - Finding Multiple Matching input Elements
 - Step 11 - Slowing Tests using sleep for visualizing
 - Step 12 - Automation Test for Entering UserId and Password and Logging in from Login Page
 - Step 13 - Exercise - Create Automation Test fo Login Static Page
 - Step 14 - Selenium Locators - Locate Elements By Link Text
 - Step 15 - Selenium Locators - Locate Elements By Partial Link Text
 - Step 16 - Selenium Locators - Locate Elements By Class
 - Step 17 - Exercise - Selenium Locators - Locate Elements By Class
 - Step 18 - Selenium Locators - Locate Table Element
 - Step 19 - Exercise - Selenium Locators - Locate and Click Table Element
 - Step 20 - Understanding CSS Selectors for Table Data - td
 - Step 21 - Using XPath Expressions to Locate Table Elements
 - Step 22 - Choosing among multiple Selenium Locator Options
 - Step 23 - Improving Performance By Caching WebElements
 - Step 24 - Conclusion

### 06 - Selenium Automation - Playing with Form Elements
 - Step 01 - Introduction to Section
 - Step 02 - Reading and Setting values into Text Elements using Selenium Web Driver Interface
 - Step 03 - Reading and Setting values into TextArea Elements using Selenium Web Driver Interface
 - Step 04 - Reading value of CheckBox in Automation Tests
 - Step 05 - Setting value of CheckBox in Automation Tests
 - Step 06 - Creating Framework Utility Method for CheckBox in Automation Tests
 - Step 07 - Reading value of Radio Button in Automation Tests
 - Step 08 - Setting value of Radio Button in Automation Tests
 - Step 09 - Reading value of Select Box
 - Step 10 - Reading value of Multi Select Box
 - Step 11 - Setting value of Select Box in Automation Test
 - Step 12 - Conclusion

### 07 - Selenium Automation - Advanced Testing Scenarios

 - Step 01 - Introduction and Setting up New Project with TestNG and Selenium
 - Step 02 - Reading CSS Styles
 - Step 03 - Exercise - Reading CSS Styles
 - Step 04 - Checking if an element is enabled using isEnabled and Exploring WebDriver Interface
 - Step 05 - More methods in WebDriver Interface - getAttribute, getLocation and getSize
 - Step 06 - Accessing Window Information using WebDriver manage window method
 - Step 07 - Window Navigation in Selenium Automation Test with WebDriver navigate method
 - Step 08 - Automation Testing Modal Windows using Sleep
 - Step 09 - Automation Testing Modal Windows with Implicit Wait
 - Step 10 01 - Automation Testing Modal Windows with Explicit Waits
 - Step 10 02 - Automation Testing Modal Windows with Explicit Waits - Events
 - Step 11 - Testing Alert Boxes with Selenium
 - Step 12 - Window Handles and Basics of Testing New Browser Window Launch
 - Step 13 - Finding the Handle of Newly Launched Window
 - Step 14 - Switching to Newly Launched Window
 - Step 15 - Writing Automation Tests for Frames
 - Step 16 - Taking Screenshot during Automation Test
 - Step 17 - Executing JavaScript Code in Selenium Test
 - Step 18 - Reviewing WebDriver Interface
 - Step 20 - Writing Automation Tests for Tables
 - Step 21 - Designing a basic framework for Tables
 - Step 22 - Using Actions Interface for Basic Actions with Keyboard and Mouse
 - Step 23 - More Actions Interface - Drag, Drop, Hold and Release

### 08 - Introduction to Cross Browser Automation Testing

 - Step 01 - Introduction to Cross Browser Automation Testing
 - Step 02 - Setting up a New Project and Running Tests in Chrome and Firefox
 - Step 03 - Running Automation Tests in Other Browser - Safari, Internet Explorer and Edge
 - Step 04 - Running Headless Automation Test with PhanthomJS
 - Step 05 - Running Automation Tests with Chrome and Firefox Browsers in Headless mode
 - Step 06 - Designing Cross Browser Automation Test Framework - Part 1
 - Step 07 - Designing Cross Browser Automation Test Framework - Part 2

### 09 - Data Driven Testing with Data Providers, CSV and Excel Spreadsheets

 - Step 01 - Section Overview
 - Step 02 - Understanding Prerequisites and Login Test Scenario
 - Step 03 - Setting up a new Project with Hardcoded Login Scenario
 - Step 04 - Writing Automation Test for Unsuccessful Login
 - Step 05 - Data Driving Unsuccessful Login Automation Test with DataProvider
 - Step 06 - Adding Passwords to DataProvider
 - Step 07 - Adding Expected Test Result to Data Provider
 - Step 08 - Reading Test Data From CSV File
 - Step 09 - Connecting Test Data Provider to CSV File
 - Step 10 - Setting up Excel File with Google Spreadsheets
 - Step 11 - Reading Test Data From Excel using POI and ExcelReadUtil
 - Step 12 - Understanding ExcelReadUtil
 - Step 13 - Connecting Test Data Provider to Excel File

### 10 - Implementing Page Object Model for Update Todo Scenario

 - Step 01 - Introduction - Objectives and Prerequisites
 - Step 02 - Setting up a New Project and Creating an outline for the Update Todo Test
 - Step 03 - Writing First Version of Update Todo Automation Test
 - Step 04 - First Working Version of Update todo Test and a Discussion on Maintainability
 - Step 05 - Introduction to Page Object Model
 - Step 06 - Creating Your first Page Object
 - Step 07 - Updating the Automation Test to use Login Page Object
 - Step 08 - Creating Action Methods in Login Page Object
 - Step 09 - Creating Todo Page Object
 - Step 10 - Creating List Todo Page Object

### 11 - Scaling up with Selenium Standalone and Grid

 - Step 01 - Selenium Standalone and Grid - An Introduction
 - Step 02 - Intallation Step I - NPM using Node JS
 - Step 03 - Intallation Steps II and III - Installing and Launching Selenium Standalone Server
 - Step 04 - Setting up an Automation Project and Creating a Simple Test
 - Step 05 - Creating a New Test to run using Selenium Standalone Server
 - Step 06 - Introduction to Selenium Grid - Hub and Nodes
 - Step 07 - Setting up Selenium Grid with a Hub and 2 Nodes
 - Step 08 - Setting up different browser capabilities for the Nodes in the Selenium Grid

### 12 - Thank You

- 99 00 Introduction to Automation Testing with Java and Selenium - Congratulations
