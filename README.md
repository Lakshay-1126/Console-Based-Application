# User Console Application (Core Java)

A **console-based user management system** developed using **Core Java**.  
This project demonstrates the implementation of **User Registration and Login functionality** using **Object-Oriented Programming (OOP)** and **Java Collections (ArrayList)**.

The application runs in a **menu-driven command-line interface** where users can register, log in, and view registered users.

---

## 🚀 Features

- User Registration
- User Login Authentication
- Display All Registered Users
- Username uniqueness validation
- Menu-driven console application
- In-memory data storage using ArrayList
- Simple and clean project structure

---

## 🛠 Technologies Used

- **Java (Core Java)**
- **OOP Concepts**
  - Classes & Objects
  - Encapsulation
- **Java Collections Framework**
- **Scanner Class**

---

## 📂 Project Structure

```
Console-Based-Application
│
├── UserApp
│   ├── MainApp.java
│   ├── User.java
│   └── UserService.java
│
└── README.md
```

---

## 📌 Class Description

### MainApp.java
- Contains the **main method**
- Displays the **menu-driven interface**
- Handles user input
- Calls service methods

### User.java
- **Model class**
- Stores user information
  - Username
  - Password
  - Email
- Uses constructor and getter methods

### UserService.java
- Contains the **business logic**
- Handles:
  - User registration
  - Login validation
  - Displaying registered users
- Uses **ArrayList** to store users in memory

---

## ▶️ How to Run the Project

### 1️⃣ Clone the repository

```bash
git clone https://github.com/Lakshay-1126/Console-Based-Application.git
```

### 2️⃣ Navigate to project folder

```bash
cd Console-Based-Application
```

### 3️⃣ Compile Java files

```bash
javac UserApp/*.java
```

### 4️⃣ Run the application

```bash
java UserApp.MainApp
```

---

## 📋 Application Menu

```
======= User App Menu =======

1. Register
2. Login
3. Show All user
4. Exit

Enter your choice
```

---

## 💡 Example Workflow

### User Registration

```
Enter username: lakshay
Enter password: 12345
Enter email: lakshay@email.com

Registration successful
```

### User Login

```
Enter username: lakshay
Enter password: 12345

Login successful! Welcome, lakshay
```

---

## 📚 Concepts Practiced

- Core Java Programming
- Object-Oriented Programming (OOP)
- Java Collections (ArrayList)
- Menu-driven applications
- Basic authentication logic

---

## 🔮 Future Improvements

- Store users in **MySQL using JDBC**
- Add **password encryption**
- Implement **update and delete user features**
- Convert to **GUI-based application**
- Build **Spring Boot REST API version**

---

## 👨‍💻 Author

**Lakshay Kumawat**

GitHub: https://github.com/Lakshay-1126

Java Developer | Backend Development Learner
