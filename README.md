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
