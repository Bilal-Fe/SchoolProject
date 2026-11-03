# 🎓 YILDIZ COLLEGE — School Management System

A simple Java-based **School Management System** designed to manage school information, teachers, and students through a console-based menu interface.

## 📌 Project Overview

The application provides a menu-driven interface that allows users to:

- View general school information.
- Manage teacher records.
- Manage student records.
- Search, add, display, and delete records.

The project also demonstrates the implementation of the **Singleton Design Pattern**, Java Collections (Map), and basic object-oriented programming principles.

---

## 🏫 Main Menu

The application starts with the following main menu:

```text
========== YILDIZ COLLEGE ==========

============ MAIN MENU ============

1 - View School Information
2 - Teacher Menu
3 - Student Menu
4 - Quit
```

### Main Menu Requirements

- All school information must be stored in the `School` class.
- School information must be **constant (immutable)**.
- School information must be accessible from every class within the project.
- The `School` class must implement the **Singleton Design Pattern**.
- The Singleton implementation must prevent the creation of multiple instances of the `School` class.

---

## 👨‍🏫 Teacher Management

The Teacher Menu provides options for managing teacher records.

### Teacher Menu

```text
========== YILDIZ COLLEGE ==========

=========== TEACHERS MENU ==========

1 - Print Teacher List
2 - Find Teacher by Last Name
3 - Find Teacher by Subject
4 - Add a Teacher
5 - Delete a Teacher by TC Number

A - Return to Main Menu
Q - Quit
```

### Teacher Management Requirements

**1. Teacher Information**

Each teacher record must contain the following information:

- TC Number (Unique Identification Number)
- First Name
- Last Name
- Date of Birth (DOB)
- Subject

**2. Data Storage**

- Teacher records must be stored in a Java `Map`.
- The teacher's TC Number must be used as the **KEY**.
- All other teacher information must be stored as the **VALUE**.

**3. Available Operations**

- Display all teacher records in a well-organized table.
- Search for teachers by last name.
- Search for teachers by subject.
- Add new teacher records.
- Delete existing teacher records using their TC Number.

**4. Display Format**

- Every listing must begin with an informative header row.
- Teacher information must be displayed in a clear, structured, and properly aligned table format.

---

## 🎓 Student Management

The Student Menu provides options for managing student records.

### Student Menu

```text
========== YILDIZ COLLEGE ==========

=========== STUDENTS MENU ==========

1 - Print Student List
2 - Find Student by Last Name
3 - Find Student by Subject
4 - Add a Student
5 - Delete a Student by TC Number

A - Return to Main Menu
Q - Quit
```

### Student Management Requirements

**1. Student Information**

Student records should contain the necessary information to identify and manage each student.

**2. Available Operations**

- Display all student records in a well-organized table.
- Search for students by last name.
- Search for students by subject.
- Add new student records.
- Delete existing student records using their TC Number.

**3. Display Format**

- Every listing must begin with an informative header row.
- Student information must be displayed in a clear, structured, and properly aligned table format.

---

## 🛠️ Technical Requirements

| Feature | Requirement |
|---|---|
| Programming Language | Java |
| School Information | Singleton Design Pattern |
| Teacher Data Storage | Java Map |
| Teacher Map Key | TC Number |
| Student Management | Add, Search, List, Delete |
| Teacher Management | Add, Search, List, Delete |
| User Interface | Console-Based Menu |
| Design Principles | Object-Oriented Programming |

---

## 🎯 Project Objectives

The main objectives of this project are to:

- Practice Java Object-Oriented Programming (OOP).
- Understand and implement the Singleton Design Pattern.
- Work with Java Collections, especially the `Map` interface.
- Implement CRUD operations (Create, Read, Update, Delete).
- Develop search and filtering functionality.
- Create a user-friendly, menu-driven console application.
- Organize and display records in a readable tabular format.

---

**Happy Coding! ☕**

*YILDIZ COLLEGE — School Management System*