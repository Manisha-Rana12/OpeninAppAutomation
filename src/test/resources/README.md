# OpeninApp Automation Framework

## Overview

This project is a Selenium-based automation framework designed to test the OpeninApp application. It uses Java and TestNG, and it is designed with the Page Object Model (POM) pattern to enhance code reusability and maintainability. ExtentReports is integrated for generating detailed test reports.

## Project Structure

- **src/main/java/pages**: Contains the Page Object Model (POM) classes for the application's pages.
- **src/main/java/generic**: Contains the base setup class and utility classes.
- **src/test/java/test**: Contains the test classes for performing automation testing.
- **src/test/resources**: Contains property files and other resources.
<img width="172" alt="image" src="https://github.com/user-attachments/assets/284c0903-0fd3-4d09-af98-63ad3f8309f1">

## Technologies and Tools Used

- **Java**: Programming language for writing test scripts.
- **Selenium WebDriver**: For automating web application testing.
- **TestNG**: For organizing the tests and managing test execution.
- **ExtentReports**: For generating detailed test reports.
- **Maven**: For managing project dependencies and build lifecycle.
- **WebDriverManager**: For managing browser drivers.

## Setup Instructions

### Prerequisites

- JDK 8 or higher
- Maven
- IDE (Eclipse, IntelliJ IDEA, etc.)

### Installation

1. Clone the repository:
    
    git clone https://github.com/Manisha-Rana12/OpeninAppAutomation.git
    

2. Navigate to the project directory:
    
    cd openinapp-automation
    

3. Install the project dependencies:
    
    mvn clean install
    

### Configuration

1. Update the `basic.properties` file located in `src/test/resources` with the necessary configurations:
    properties
    OpeninAppBaseURL=https://openinapp.com/
    userEmail=your-email@example.com
    password=your-password
    mobileNum=your-mobile-number
    websiteUrl=your-website-url
    name=your-name
    

## Running the Tests

You can run the tests using TestNG in your IDE or via Maven.

### Using IDE

1. Right-click on the `OpeninAppTest` class in `src/test/java/test`.
2. Select `Run As` > `TestNG Test`.

### Using Maven


mvn test
