# Automation Testing with Java and Selenium

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
