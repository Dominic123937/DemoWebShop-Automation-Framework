# 🛒 DemoWebShop Automation Framework

## 📌 Project Overview
This repository contains a robust Selenium automation framework developed using Java and TestNG for the Tricentis Demo Web Shop application.  
The framework automates end-to-end e-commerce workflows with a strong focus on reusability, maintainability, and stable validations, following real-world QA automation practices.

---

## 🌐 Application Under Test
- Application Name: Tricentis Demo Web Shop  
- URL: https://demowebshop.tricentis.com/  
- Domain: E-commerce (Demo Application)

---

## 🛠️ Tech Stack & Tools
- Programming Language: Java  
- Automation Tool: Selenium WebDriver  
- Test Framework: TestNG  
- Build Tool: Maven  
- IDE: Eclipse  
- Version Control: Git & GitHub  
- Browser: Google Chrome  

---

## 🏗️ Framework Architecture
The framework follows a modular and reusable design:

- A centralized BaseSuite handles:
  - Browser initialization
  - Application launch
  - Login and logout functionality
- All test classes extend BaseSuite to eliminate code duplication
- Test execution is managed using TestNG annotations and testng.xml
- Assertions are implemented using stable URL-based and UI-based validations

---

## 🧪 Test Coverage
The automation suite includes 20+ functional and end-to-end test cases covering:

- Category navigation (Books, Electronics, Apparel & Shoes, etc.)
- Product selection and product detail validation
- Add to Cart functionality
- Shopping Cart operations
- Checkout workflow
- Account and profile navigation
- Static pages (About Us, Contact Us, News)
- Newsletter subscription
- URL validation and page verification

---

## ▶️ Test Execution Strategy
- Test cases can be executed:
  - Individually from test classes
  - As a batch using TestNG XML
- Batch execution ensures:
  - Regression coverage
  - Framework stability
  - Validation of complete end-to-end flows

---

## 📂 Project Structure
Automation_Project  
├── BaseSuite.java  
├── TC_01.java  
├── TC_02.java  
├── TC_03.java  
├── ...  
└── TC_21.java  

---

## ✅ Key Features & Highlights
- Reusable BaseSuite design
- Clean separation of setup and test logic
- Stable assertion strategy to avoid flaky tests
- Realistic end-to-end user scenarios
- Batch execution support using TestNG
- GitHub version-controlled automation project
- Suitable for functional and regression testing

---

## 🚀 Learning Outcomes
Through this project, the following skills were practiced and strengthened:

- Selenium WebDriver automation
- TestNG lifecycle and batch execution
- Assertion strategies and failure debugging
- Handling dynamic web elements
- Automation framework structuring
- GitHub version control and documentation

---

## 👤 Author
Bharath  
QA Automation Engineer (Fresher)
---
