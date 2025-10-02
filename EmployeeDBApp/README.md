# Java JDBC Employee Database App

## 📌 Overview
This project demonstrates a simple **Java JDBC CRUD application** for managing employees.  
It connects to a **MySQL database** using JDBC and performs:
- Insert (Add Employee)
- Read (View All Employees)
- Update (Modify Employee Data)
- Delete (Remove Employee Record)

## 🚀 Tech Stack
- Java (JDK 17 or above)
- MySQL (or PostgreSQL with driver change)
- JDBC
- VS Code / IntelliJ / Eclipse

## 🗄️ Database Setup
sql
CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100),
    salary DOUBLE
);

▶️ Running the Project

1.Clone this repo.

2.Update DB credentials in DBConnection.java.

3.Compile:

4.Run

### Output:
<img width="1113" height="543" alt="Screenshot 2025-10-02 143318" src="https://github.com/user-attachments/assets/2e2fba81-9852-4637-853d-a90503c6ae16" />

<img width="1140" height="795" alt="Screenshot 2025-10-02 143401" src="https://github.com/user-attachments/assets/db0537cf-ab86-4efc-b8f5-fe426475e6fd" />

<img width="1101" height="673" alt="Screenshot 2025-10-02 143438" src="https://github.com/user-attachments/assets/f574648c-10f2-44af-8f77-9bcbe2ec7ad9" />
