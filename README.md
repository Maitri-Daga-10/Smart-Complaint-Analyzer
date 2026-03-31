# 🚀 Smart Complaint Analyzer (Java Console Application)

## 📌 Overview
The **Smart Complaint Analyzer** is a Java-based console application developed to efficiently manage and organize civic complaints. It allows users to register complaints, automatically categorize them, assign priority levels, and store them persistently using file handling.

This project demonstrates the practical application of **Object-Oriented Programming (OOP), file handling, and problem-solving using Java** to address real-world issues.

---

## 🎯 Problem Statement
In real-world scenarios, complaints related to civic issues such as road damage, water supply problems, and electricity failures are often:
- Unstructured and scattered  
- Difficult to manage and track  
- Not prioritized effectively  

This leads to delays in resolving critical issues.

---

## 💡 Solution
This system provides a structured and efficient solution by:
- Automatically categorizing complaints  
- Assigning priority levels based on urgency  
- Storing complaints in a file for persistence  
- Allowing users to search and view complaints easily  

---

## ✨ Features

### 🔹 Core Features
- ➕ Add new complaints  
- 📂 Automatic categorization (Road, Water, Electricity, Other)  
- ⚡ Priority detection (HIGH / LOW)  
- 💾 Persistent storage using text file  

### 🔹 Additional Features
- 🔍 Search complaints by keyword  
- 📋 View all complaints  
- ⏱️ Timestamp for each complaint  
- 📁 Data loaded automatically on restart  

---

## 🛠️ Technologies Used
- **Java**  
- **Object-Oriented Programming (OOP)**  
- **File Handling (FileWriter, Scanner)**  
- **Collections (ArrayList)**  

---

## 📂 Project Structure
Smart-Complaint-Analyzer/
├── Complaint.java
├── ComplaintManager.java
├── FileHandler.java
├── Main.java
├── complaints.txt
├── README.md


---

## ⚙️ How It Works

1. The user enters a complaint through the console  
2. The system processes the input using keyword-based logic  
3. Complaint is automatically categorized  
4. Priority is assigned based on urgency keywords  
5. Complaint is saved in a file (`complaints.txt`)  
6. User can:
   - View all complaints  
   - Search complaints  

---

## ▶️ How to Run the Project

### Step 1: Clone the repository
git clone https://github.com/Maitri-Daga-10/Smart-Complaint-Analyzer.git

### Step 2: Navigate to the project foldercd Smart-Complaint-Analyzer
cd Smart-Complaint-Analyzer

### Step 3: Compile the program
javac *.java

### Step 3: Compile the program
java Main

---

## 🧠 Key Concepts Demonstrated
- Object-Oriented Programming (OOP)
- File handling and data persistence
- String processing and keyword matching
- Menu-driven program design

---

## 🚧 Challenges Faced
- Designing a modular class structure
- Implementing automatic categorization logic
- Managing file input/output operations
- Handling user input effectively

---

## 🔮 Future Enhancements
- Add Graphical User Interface (GUI) using Java Swin
- Integrate database (MySQL) for better storage
- Implement user authentication system
- Use AI/ML for smarter complaint classification

---

## Author
Maitri Daga
