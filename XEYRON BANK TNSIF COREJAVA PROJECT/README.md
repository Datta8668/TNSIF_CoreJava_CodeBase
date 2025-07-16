
# XEYRON BANK TNSIF (Console-Based Banking System)

This project is a **console-based banking system** developed in Java. This project was created as part of a code-based Core Java study program by TNS India Foundation. It simulates essential banking operations, allowing administrators and customers to interact with the system through a text-based menu.


This project was created as part of a study program to practice:

- Java programming concepts (OOP, collections, exception handling)
- Database operations (CRUD) using **MySQL**
- User authentication and validation
- Transaction processing and record management


---


## ✨ Features

- **Admin Login**
  - View all customers and their Details
  - Verify new customer registrations
  - 
- **Customer Registration & Login**
  - Secure authentication
  - Account creation (Saving/Current)
  - Deposit, Withdraw, Transfer funds
  - View account balances and transaction history
  - Manage beneficiaries
  - 
- **Validation & Error Handling**
  - Input validation (numeric IDs, amounts)
  - User-friendly error messages


---


## 🛠️ Prerequisites

Before running the project, you need:

- **Java JDK** (version 8 or higher)
- **Eclipse IDE** or any Java IDE
- **MySQL Server**
- **MySQL JDBC Driver** (`mysql-connector-j` JAR)


---


## 🐬 MySQL Installation & Setup

#### 1️⃣ Install MySQL

If you don’t have MySQL installed:

- Download: [MySQL Community Server](https://dev.mysql.com/downloads/mysql/)
- Follow the installation instructions for your operating system.

#### 2️⃣ Create Database

1. Create a database:
    CREATE DATABASE bankingsystemdb;

2. Create a dedicated MySQL user:
    CREATE USER 'bankadmin'@'localhost' IDENTIFIED BY 'bankadminpass123';
    GRANT ALL PRIVILEGES ON bankingsystemdb.* TO 'bankadmin'@'localhost';
    FLUSH PRIVILEGES;

3. Use the database:
    USE bankingsystemdb;

4. Table Creation
    Once you run the main Java file (ConsoleApp.java), it will automatically be created.

---

## 🧩 Importing the Project in Eclipse

#### 1️⃣ Open Eclipse & Import the project:

  File > Import > Existing Projects into Workspace

  Select the folder containing the project.


#### 2️⃣ Add MySQL JDBC Driver:

  Download the driver: MySQL Connector/J
  
  In Eclipse:
  
  Right-click the project > Build Path > Configure Build Path
  
  Under Libraries, click Add External JARs...
  
  Select the downloaded .jar file.

---

## 🏃 Running the Application

Locate the ConsoleApp.java file in src/com/tnsif/bankingsystem/ui.

Right-click > Run As > Java Application.

You’ll see the console menu:


WELCOME TO XEYRON BANK TNSIF
1. Admin Login
2. Customer Registration
3. Customer Login
4. Exit
