# ✅ Official Solution: Custom String Utility Class (Beginner Edition)

## 🧩 Problem Recap

You were asked to implement simple and reusable string utility methods — the kind of logic backend developers use all the time in production.

The catch? You could only use basic String methods like:
- `.trim()`, `.replace()`, `.charAt()`, `.substring()`
- `.indexOf()`, `.split()`, `.toUpperCase()`, `.toLowerCase()`

---

## ✅ What We Implemented

### 1. `removeSpaces(String input)`
Removed all spaces using `.replace(" ", "")`.

### 2. `capitalizeFirstLetter(String input)`
- Trimmed the input
- Capitalized the first character with `.toUpperCase()`
- Lowercased the rest with `.toLowerCase()`
- Combined them with `+`

### 3. `startsAndEndsSameLetter(String input)`
- Trimmed the input
- Checked `.charAt(0)` vs `.charAt(length - 1)`
- Compared using `.equalsIgnoreCase()`

### 4. `countWords(String sentence)`
- Trimmed and split by space `" "`
- Returned the number of items using `.length()`

### 5. `secondIndexOf(String input, char ch)`
- Found the first index using `.indexOf(ch)`
- Then searched again using `.indexOf(ch, first + 1)`

---

## 🧠 Learning Outcome

This exercise helps you:
- Break down logic into steps
- Practice String APIs you're likely to use daily
- Write clean, readable methods without relying on advanced tools

Keep up the great work! 💡
