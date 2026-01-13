# Vaadin Spreadsheet Autofit Columns Issue

This project demonstrates an issue with Vaadin Flow Spreadsheet where column auto-sizing does not work correctly.

## Problem Description

When using:

`spreadsheet.autofitColumn(i);`

the calculated column width is incorrect and remains too narrow, even when cells contain long text values. As a result, the content is truncated and not fully visible, although autofitColumn is expected to resize the column to fit its content.

The screenshot below illustrates this behavior (pay attention to name, email, salary, comment columns): 
1. macOS:
   <img width="2474" height="670" alt="image" src="https://github.com/user-attachments/assets/4b2ca13a-07e0-4bc6-8a17-8f772b2478f0" />

2. Windows 11:
   <img width="1178" height="444" alt="image" src="https://github.com/user-attachments/assets/6e6333ab-7043-49ac-9ce8-1568be7376c0" />

## How to Run the Project

1. Build the project: `mvn clean install`
2. Run the Application class directly from your IDE.
3. Open the application in your browser: `http://localhost:8080`.
   
