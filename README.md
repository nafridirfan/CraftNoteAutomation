# CraftNoteAutomation
CraftNote Assessment - Mobile Automation using Appium and Saucelabs. 

### Pre-Requisites: 

1. Java
2. Maven
3. Node.js
3. Appium (All details regarding installing Appium, starting the server etc are here: http://appium.io/docs/en/about-appium/getting-started/)
4. IDE or Terminal
5. Appium Desktop Client (optional)
6. **Saucelabs configuration to view the Virtual Device Emulator (Saucelabs is used here, because I do not want to depend on any Physical device as part of this     assessment. I tested everything in my Local using iPhone 11 Emulator on Xcode, but since this is an Assessment I did not want to have any dependancy. Hence using Saucelabs we can test both on iOS and Android** 

### How to Run and view Results on Saucelabs?

1. Check if the Server is configured to Saucelabs in PreConditionSteps

```URL url = new URL(SAUCELABS_SERVER);```

2. Go to Project Directory and run

``` mvn install```

3. Login to your Saucelabs Account here 

```https://accounts.saucelabs.com/am/XUI/#login/```

4. Go to 

``` Automated --> Test Results ``` . Please note that since the tests are running on virtual cloud, it takes a couple of minutes for us to view the results. Please give it sometime. 

### How to Run and View results on Appium?

1. Check if the Server is configured to Appium in PreConditionSteps

```URL url = new URL(APPIUM_SERVER);```

2. Please run the Appium server either using the Appium Desktop Client or in Terminal using the below command: 

```appium &```

3. Go to Project Directory and run

``` mvn install```

4. Depending on the Devices connected (if any) or if the Emulators are enabled, we see the automated test in the resultant device. 


### Project Structure

1. All the Automation code resides on 
``` src/test/java```
2. There are 2 packages as part of this
- ```basePackage```
- ```testPackage```
3. basepackage contains classes that are mostly used to setup the precondition steps before running the test cases, element locators and all the String literals
- ```PreConditonSteps.java is used to set all the desired capabilities to run the tests on iOS and Android```
- ```CommonFields.java is used to declare all the String variables used. Since setting up the desrired capabilities everytime might be cumbersome, we can use this class to edit any changes```
- ``` LoginPageElements.java is used to store all the Element Locators of Login page. Please note that usually all the Elemet Locators are in a different package. ```
4. testPackage contains all the test cases. Following the best practices for creating a test automation framework, the naming will be as below:
```module_name+Tests+Package``` (example: ```attendanceModuleTestsPackage```

### Footnote
**``` This Assessment in done keeping in mind that the reviewers of this Assessment have very little manual work to do. Hence I wanted to use Saucelabs to view the results in Emulator and the logs at the same time. Also, the same project can be extended for future test cases with very little changes. ```**
