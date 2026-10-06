# 🧠 Quiz Application

A Java-based desktop quiz application designed for interactive learning through **multiple-choice questions, timed quizzes, automatic scoring, and user assistance features**.

> **Author:** Disha Kokane  
> **Project:** Quiz Application  
> **Academic Year:** 2024–2025

---

## 📌 Project Overview

The **Quiz Application** is a desktop-based educational application developed using **Java Swing and AWT**.

The application allows users to enter their name, read quiz instructions, select a programming-related quiz category, answer multiple-choice questions within a specified time, use a Help option, and receive an automatically calculated final score.

The project focuses on making knowledge assessment more interactive and reducing the manual effort required for evaluating quizzes.

---

## ✨ Key Features

- 👤 User Name Entry
- 📋 Welcome & Rules Screen
- 💻 Programming Quiz Categories
- ❓ Multiple Choice Questions
- ⏱️ Time-Limited Questions
- ➡️ Next Question Navigation
- 🆘 Help / Option Elimination
- 🧮 Automatic Score Calculation
- 🏆 Final Result Display
- 🖥️ Java Desktop GUI
- 📚 Educational Self-Assessment

---

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| **Java** | Core application |
| **Java Swing** | Graphical User Interface |
| **Java AWT** | GUI components and event handling |
| **IntelliJ IDEA** | Development environment |
| **Local Storage / Files** | Quiz and result data concepts |

---

## 🎯 Quiz Categories

The project documentation describes programming-related categories including:

- Java
- Python
- PHP
- HTML

---

## 🧩 Main Modules

### 1. User Entry

The user starts the application by entering a username.

### 2. Welcome & Rules

The application displays instructions and rules before the quiz begins.

### 3. Quiz Selection

The user selects the desired programming category.

### 4. Question Module

Questions are presented with four possible answers.

### 5. Timer

Questions operate with a specified time limit, making the quiz more interactive.

### 6. Help Feature

The Help option disables two incorrect options, helping the user narrow down the possible answers.

### 7. Score Calculation

Correct answers are automatically counted.

### 8. Result

After submitting the quiz, the application displays the user's final score.

---

## 🔄 Application Workflow

```text
                START
                  │
                  ▼
            Enter Username
                  │
                  ▼
           Welcome / Rules
                  │
                  ▼
          Select Quiz Category
                  │
                  ▼
             Start Quiz
                  │
                  ▼
        Display Question
                  │
          ┌───────┴────────┐
          │                │
       Answer             Help
          │                │
          │         Remove 2 Wrong
          │            Options
          └───────┬────────┘
                  ▼
             Next Question
                  │
                  ▼
             More Questions?
              │          │
             Yes         No
              │          │
              └───┐      ▼
                  │    Submit
                  │      │
                  └──────┤
                         ▼
                    Calculate Score
                         │
                         ▼
                    Display Result
```

---

## 💻 System Requirements

### Software

- Java Development Kit
- IntelliJ IDEA
- Java Swing
- Java AWT

### Recommended Hardware

- Intel i5 processor or equivalent
- 16 GB RAM
- Approximately 1 TB storage

---

## 🚀 How to Run

### Step 1 — Clone

```bash
git clone <YOUR-REPOSITORY-URL>
```

### Step 2 — Open Project

Open the project in **IntelliJ IDEA**.

### Step 3 — Configure Java

Set up a compatible JDK.

### Step 4 — Check Resources

Ensure the question/local resource files expected by the project are available.

### Step 5 — Run

Build and execute the application's main class.

---

## 📊 Learning Outcomes

This project demonstrates:

- Java programming
- Object-oriented programming
- Java Swing
- Java AWT
- GUI design
- Event handling
- Multiple-choice question processing
- Timer-based interaction
- Automatic evaluation
- Score calculation
- Educational application development

---

## ⚠️ Current Limitations

The documented system has limitations including:

- Traditional Swing/AWT user interface
- Desktop-only experience
- Dependency on a compatible Java runtime
- Limited cloud integration
- Limited modern UI capabilities
- Limited real-time collaboration
- Deployment is less convenient than a web application

---

## 🔮 Future Enhancements

The project can be extended with:

- 🎨 Modern UI themes
- 🖼️ Image, video, and audio questions
- 🌐 Online quiz functionality
- 👥 Multiplayer quizzes
- 🗄️ SQLite/MySQL database integration
- ✍️ User-created quizzes
- 📈 Detailed performance analytics
- 🏆 Leaderboards
- 🥇 Badges and achievements
- ♿ Accessibility improvements
- 🔗 Educational API integration
- 📱 Cross-platform/mobile version

---

## 👩‍💻 Author

**Disha Kokane**

MCA Student 
Software Development & Academic Projects



---

⭐ **If you find this project useful, consider giving the repository a star!**
