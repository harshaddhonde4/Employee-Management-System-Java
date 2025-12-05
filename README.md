# 📊 Employee Management System (Custom DBMS)

![Java](https://img.shields.io/badge/Language-Java-orange)
![Structure](https://img.shields.io/badge/Data_Structure-LinkedList-blue)
![Type](https://img.shields.io/badge/Project-CLI_Application-green)

A lightweight, **in-memory Database Management System** simulation built entirely in Java. This project demonstrates core DBMS concepts by implementing a custom SQL-like engine using **Doubly Linked Lists** to manage employee records efficiently without an external database.

---

## 🚀 Overview

This application mimics the behavior of a relational database. Instead of storing data on a hard drive using SQL, it uses the **Java Collection Framework (LinkedList)** to perform operations in the Random Access Memory (RAM). It is designed to demonstrate:
* **Object-Oriented Programming (OOP)** principles.
* **Data Structure** implementation (Linear Linked List).
* **Database Internal Architecture** (Query processing and Aggregate functions).

---

## ✨ Key Features

### 1. 📝 CRUD Operations
* **Create:** Insert new employee records with Auto-Incrementing Primary Keys (IDs).
* **Read:** Display all records or search specifically by **ID** or **Name**.
* **Update:** Modify existing employee details (e.g., Address) based on their ID.
* **Delete:** Remove records securely using either **ID** or **Name**.

### 2. 🔢 Aggregate Functions
Built-in logic to perform analytical calculations on the data:
* **Count:** Total number of employees.
* **Sum:** Total salary expenditure.
* **Average:** Average salary across the organization.
* **Max/Min:** Find the highest and lowest paid employees.

### 3. 🖥️ Interactive CLI
A user-friendly command-line menu driven by a `switch-case` architecture allows users to perform operations seamlessly.

---

## 🛠️ Technology Stack

* **Language:** Java (JDK 8+)
* **Storage:** In-Memory `LinkedList<Employee>`
* **Input Handling:** `java.util.Scanner`
* **Core Concepts:** Classes, Objects, Collections, Exception Handling.

---

## 💻 How to Run

### Prerequisites
Ensure you have **Java** installed on your system.
```bash
java -version
