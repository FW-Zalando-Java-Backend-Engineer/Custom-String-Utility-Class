# 🧪 Custom String Utility Class

## 🧩 Background

Imagine this: you're building a backend service and you get raw input from users — full of spaces, inconsistent casing, and repeated characters. You don't want to fix this logic over and over, right?

So what do professionals do?  
✅ They write **utility methods** — clean, reusable, and testable.  
Today, you're going to build some of your own!

And guess what? You already have all the tools you need:  
`.trim()`, `.toUpperCase()`, `.substring()`, `.charAt()`, `.indexOf()` and more.


---

## 🎯 Objectives

You're writing **static string utility methods** using only basic `String` methods.  
Let’s think together on each one — like a developer would.

---

## 🛠️ Your Tasks (Let’s Think Through Each One)

[Use the starter code](https://github.com/FW-Zalando-Java-Backend-Engineer/Custom-String-Utility-Class/blob/main/StringUtils.java)

### 1. `removeSpaces(String input)`

🧠 You’ve got a string like `" H e l l o "` and you want to clean it to `"Hello"`.

> Hmm. How would we get rid of every space?

Yes! You can use `.replace(" ", "")` to remove **every** space.  
Easy win! This will work even if the spaces are in the middle.

🧪 Use case: Clean usernames or codes that shouldn’t contain spaces.

---

### 2. `capitalizeFirstLetter(String input)`

Let’s say the user enters `"heLLo"` and we want `"Hello"`.

> First thought: what should we do with the casing?

- Lowercase everything except the first letter.
- But wait — how do we split a string?

Ah! We don’t need to split it.  
Use `.substring(0, 1)` to get the first letter, then `.toUpperCase()` it.  
Then use `.substring(1)` and `.toLowerCase()` the rest.

Now just combine them with `+`.

🧪 Use case: Formatting names and titles in forms.

---

### 3. `startsAndEndsSameLetter(String input)`

Input: `"Anna"`  
We want to check if it starts and ends with the same letter — case-insensitive.

> So, what’s our first move?

Right! Use `.charAt(0)` and `.charAt(length - 1)`.  
But wait — what if the user adds spaces?

Exactly — call `.trim()` first.

Now just compare the two letters using `.equalsIgnoreCase()`.  
Wrap them in `String.valueOf(char)` to compare them as strings.

🧪 Use case: Code validation or string symmetry checks.

---

### 4. `countWords(String sentence)`

Sentence: `"  Java is fun  "` → We want to count 3 words.

> Ok, how do we even define a word?

Good question. Let’s assume **words are separated by spaces**.  
So we use `.trim()` to remove outer whitespace.

Now what? We `.split(" ")`.  
That gives us an array of words.

Count them with `.length`.

🧠 Bonus Thinking: Can there be double spaces between words? Hmm… maybe that’s a stretch goal. For now, let’s assume clean single-space sentences.

---

### 5. `secondIndexOf(String input, char c)`

Imagine a string like `"banana"` and we want the **second index** of `'a'`.

> First instinct: use `.indexOf()`.

Yes! That gives us the **first** `'a'`.  
Now, how do we find the second?

Trick: call `.indexOf()` again — but start searching from index `first + 1`.

Use `.indexOf(c, startFromHere)`.

🧪 Use case: Spotting repeated patterns or second occurrences.

---
## ✅ What to Focus On

- Your logic must be clean and well-commented.
- No regex, no `StringBuilder`, no advanced libraries.
- Just you and your String API tools!

---

## 💬 Want to Push Yourself?

Try to write your solution **before** coding it.  
- Use plain English
- Break it into steps
- Then translate it into Java

That’s how pros write reliable, readable code.

---

## 📚 References

- [Java String API](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html)
- [String Method Cheatsheet](https://www.w3schools.com/java/java_ref_string.asp)

---

💡 Once you're done, challenge yourself:  
> Try rewriting your logic using fewer variables or chaining methods!



