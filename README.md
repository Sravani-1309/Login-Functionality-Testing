# Login Functionality Testing Project

## Project Description

The Login Functionality Testing Project is a beginner-level QA Automation project developed to test and validate the login functionality of a web application using both Manual Testing and Automation Testing techniques.

The project was implemented using Selenium WebDriver with Java and TestNG. The main objective of the project is to verify whether the login module behaves correctly for both positive and negative scenarios such as valid login, invalid login, and empty input validations.

The project also includes manual testing activities such as test case preparation and bug reporting documentation.

---

# Application Under Test

Website Used:
https://www.saucedemo.com/

The SauceDemo application was used as a practice testing platform for validating login workflows and automation concepts.

---

# Objectives of the Project

* To understand the software testing process
* To perform manual testing on login functionality
* To automate login scenarios using Selenium WebDriver
* To validate application behavior using assertions
* To learn Maven dependency management
* To understand TestNG annotations and execution flow
* To practice positive and negative testing scenarios

---

# Tools & Technologies Used

| Tool / Technology  | Purpose                              |
| ------------------ | ------------------------------------ |
| Java               | Programming Language                 |
| Selenium WebDriver | Browser Automation                   |
| TestNG             | Test Execution Framework             |
| Maven              | Dependency Management Tool           |
| VS Code            | Development Environment              |
| Excel              | Test Case & Bug Report Documentation |
| Chrome Browser     | Browser Testing                      |

---

# Project Features

* Automated browser launch and execution
* Valid login functionality testing
* Invalid login validation testing
* Empty username validation testing
* Assertion-based result validation
* Implicit wait implementation
* Test execution using Maven
* Manual test case preparation
* Sample bug report documentation

---

# Manual Testing Activities

The following manual testing activities were performed during the project:

## Test Case Preparation

Prepared manual test cases for:

* Valid Login
* Invalid Login
* Empty Username
* Empty Password
* Empty Credentials

## Validation Testing

Validated:

* Login success scenarios
* Error messages
* Required field validations
* Password field behavior

## Bug Reporting

Created sample bug reports including:

* Validation-related issues
* UI observations
* Session handling observations

---

# Automation Testing Activities

The following automation testing activities were implemented:

## Selenium WebDriver Setup

Configured Selenium WebDriver using Maven dependencies.

## Browser Automation

Automated browser actions such as:

* Opening browser
* Navigating to application
* Entering credentials
* Clicking buttons
* Capturing validation messages

## Assertions

Implemented TestNG assertions for validating:

* Successful login
* Error messages
* Page title verification

## Synchronization

Implemented implicit waits for handling dynamic loading.

---

# Test Scenarios Covered

## Positive Scenario

### Valid Login Test

* Enter valid username and password
* Verify successful login

---

## Negative Scenarios

### Invalid Password Test

* Enter incorrect password
* Verify error message

### Empty Username Test

* Leave username field empty
* Verify validation message

---

# Folder Structure

# Folder Structure

```text
LoginTestingProject
│
├── src
│   └── test
│       └── java
│           └── tests
│               └── LoginTest.java
│
├── pom.xml
├── Testing_Documentation.xlsx
├── README.md
├── .gitignore
    └── target
```


---

# Maven Dependencies Used

The following dependencies were used in the project:

* Selenium Java
* TestNG

Dependencies were managed using Maven through the pom.xml file.

---

# How To Run The Project

## Step 1

Clone the repository.

## Step 2

Open the project in VS Code.

## Step 3

Install Maven dependencies.

## Step 4

Run the following command in terminal:

mvn test

---

# Expected Output

The automation script performs the following actions:

1. Launches Chrome browser
2. Opens SauceDemo application
3. Executes login scenarios
4. Validates results using assertions
5. Closes browser automatically

---

# Learning Outcomes

Through this project, the following concepts were learned:

* Selenium WebDriver basics
* Automation testing workflow
* Manual testing process
* Test case design
* Bug reporting
* Maven project setup
* TestNG annotations
* Assertions and waits
* Positive and negative testing

---

