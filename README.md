![Screenshot 2025-06-28 012321](https://github.com/user-attachments/assets/73e54b50-50a5-4920-a488-d66ccbd407ca)# bapp

# 💰 TrustBank – Spring Boot Banking Application

A full-stack online banking system built using **Spring Boot**, **Spring Data JPA**, **Thymeleaf**, and **MySQL**. This project allows users to register, log in, manage their bank accounts, perform transactions, and view their transaction history.

---

## 🚀 Features

- 🔐 User Registration & Login (Spring Security)
- 📄 Account Dashboard (with balance and account info)
- 💸 Deposit / Withdraw Money
- 🔁 Transfer Funds between accounts
- 📑 View Transaction History
- 🔎 Search Accounts by name or balance
- ✅ Backend APIs (RESTful endpoints)
- 🌐 Frontend using Thymeleaf (HTML templates)

---

## 📸 Screenshots

### 🔐 Login Page

![Screenshot 2025-06-28 012321](https://github.com/user-attachments/assets/8b3f1aad-d6b0-42d1-8027-c838c7a27407)


### 📝 Registration Page

![Screenshot 2025-06-28 012332](https://github.com/user-attachments/assets/fe0dd6d1-cf60-4fa3-b5e1-2f36979c1d9b)


### 💼 Account Dashboard

![Screenshot 2025-06-28 012304](https://github.com/user-attachments/assets/d99ded61-b6d7-4247-a126-fcffbb8619d4)


### 💸 Transfer Form

![Screenshot 2025-06-28 012804](https://github.com/user-attachments/assets/6baaaf55-77e9-4399-bd7f-e75715e15acd)


### 📑 Transaction History

![Screenshot 2025-06-28 012344](https://github.com/user-attachments/assets/baeb240f-a1c0-40fb-936d-515878caa3ef)


> 📝 To use this section:
> - Create a folder in your project: `src/main/resources/static/screenshots/`
> - Add your actual screenshot images (e.g. `login.png`, `dashboard.png`, etc.)
> - Adjust the image paths in the README if needed (e.g., `/screenshots/login.png`)

---

## 🛠️ Tech Stack

| Layer        | Technology         |
|--------------|--------------------|
| Backend      | Spring Boot, Spring MVC, Spring Security |
| Database     | MySQL + Spring Data JPA |
| Frontend     | Thymeleaf (HTML, CSS) |
| Build Tool   | Maven              |
| Language     | Java               |

---

## 🧱 Project Architecture

```plaintext
Controller Layer     →   BankController.java
Service Layer        →   AccountService.java
Repository Layer     →   AccountRepository, TransactionRepository
Model Layer          →   Account.java, Transaction.java
Security Config      →   SecurityConfig.java
Main Class           →   BankappApplication.java
Database Config      →   application.properties
