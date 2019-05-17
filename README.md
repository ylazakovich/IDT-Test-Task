# IDT-Test-Task

## Description
Need to write (build) an automation testing framework system according to the requirements below, and implement some functionality

Application to implement should be using some ot the technologies, the choice is up to you: JAVA/C#, Selenium/Rest-Assured, JUnit/NUnit. The application must correctly handle the occurrence of exceptional situations, including their journaling. For logging please use Log4j/Nlog

Classes and other entities of the application must be properly structured by package and have a name reflecting their functionality.

Code design must comply with Java Code Convention or C# Coding Conventions

## GENERAL REQUIREMENTS (STEPS)
1) Open Dev.by
2) Go to "Компании" page
3) Open 1st company in a list
4) Verify that company has an email/phone/website address
5) Repeat for other 10 companies

## ISSUES
Need to fix ajax request:
* POST https://companies.dev.by/recaptcha

DON'T HELP: 
* waitAjax
* Explicit wait
* CapabilityGenerator
* firefox driver
* Selenide 

## Result
![alt text](result.png)