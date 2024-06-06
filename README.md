# ABN AMRO application

This application is used to create the basic test automation framework for abn amro bank.

# Test coverage

## Covered:

- Login features
- Home page verifications
 
 ### Features
 
 - Run the tests in different browsers
 - Take the failure screenshots
 - Save the test reports
 
## Not covered / not in scope:

 - Login page label verifications
 - Login text field validations
 - Home page text verifications
    
## Initial Setup:

Make sure that the following tools are installed

1. Java 11
2. Maven 3.6.1
3. IntelliJ 
4. Firefox
5. Geckodriver

Note: Change the application URL at "abn-amro-master\src\main\java\nl\abn\pageobjects\LoginPage.java"

## IDE Plugins and Settings:

1. Install 'Cucumber for Java' and 'Gherkin' plugins
2. Set the language level as 8 at File > Project structure > Modules 
3. Set project byte code version as 11 at Preferences > Java compiler

## Framework details:

1. Test scenarios are written by using the BDD framework 'Cucumber' for better understanding of the scenarios. 
2. Selenium is used as an automation framework for the UI actions and verifications. 
3. Currently tests run in the default browser 'Firefox', if the scenarios/features are executed separately instead of using unners.

### Additional details:

1. 'Cucumber features' contain all the functional test scenarios,
    src > test > resources > nl.abn
2. All the scenario implementations are available at the Step definitions,
   src > main > java > stepdefs
3. A runner class is used to run all the test scenarios,
   src > test > java > nl.abn
4. All UI actions and activities are available at page objects package,
   tests > src > main > java > nl.abn > pageobjects
5. Login user details are maintained in the User domain 
    
## Ways to run the tests

Clone the project from github and do 'mvn clean install' from the project root.

1. In order to run the tests, Go to src > test > java > nl.abn and run either of the runner (or)
2. In order to run all the tests, Go to tests > test > java > resources > features and run all the features

## Compatibility test

Tests can be run either at Firefox or at Chrome  or at IE. Use the ChromeRunner or FirefoxRunner or IERunner based on your wish.
By default its running at firefox if you run the features all together from resources package.

## Test Report

When the tests are executed via 'runner', the test report will be generated with the test results (pass/fail) 
and stored in the 'target/cucumber/index.html'

## Screenshots

When there is a test failure, screenshots will be taken and placed under 'target/cucumber'

## Movie of running the test scenarios

Attached the movie of successful test run 'VideoOfTheTests.mov'


## Observation or Bug

NA