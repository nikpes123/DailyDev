# 📘 Common Mathematical Formulas

This document contains commonly used mathematical formulas for problem-solving in programming and mathematics.

---

## 📌 **1. Sum of First `n` Natural Numbers**
### **Formula:**
$$ S_n = \frac{n (n + 1)}{2} $$

### **Example Calculation:**
For `n = 10`:
$$ S_{10} = \frac{10 \times (10 + 1)}{2} = 55 $$ 

---

## 📌 **2. Sum of an Arithmetic Series**
Given:
- First term: \( a \)
- Common difference: \( d \)
- Number of terms: \( n \)

### **Formula:**
$$  S_n = \frac{n}{2} \times (2a + (n - 1)d) $$ 
OR
$$  S_n = \frac{n}{2} \times (a + l) $$ 
Where:
- \( l \) is the last term: \( l = a + (n-1)d \)

### **Example Calculation:**
For `n = 5`, `a = 2`, `d = 3`:
$$ S_5 = \frac{5}{2} \times (2(2) + (5-1)3) = 35 $$

---

## 📌 **3. Sum of a Geometric Series**
Given:
- First term: \( a \)
- Common ratio: \( r \)
- Number of terms: \( n \)

### **Formula:**
$$ S_n = \frac{a(1 - r^n)}{1 - r} \quad \text{(if \( r \neq 1 \))} $$

### **Example Calculation:**
For `a = 3`, `r = 2`, `n = 4`:
$$ S_4 = \frac{3(1 - 2^4)}{1 - 2} = 45 $$

---

## 📌 **4. Finding a Missing Number in a Natural Number Sequence**
For an array of distinct numbers in the range \( [0, n] \):

### **Formula:**
$$ \text{missingNumber} = \frac{n(n+1)}{2} - \sum(\text{array})$$

### **Example Calculation:**
For `nums = [0, 1, 3]`:
$$ \text{expected sum} = \frac{3(3+1)}{2} = 6 $$
$$ \text{actual sum} = 0 + 1 + 3 = 4 $$
$$ \text{missing number} = 6 - 4 = 2 $$

---

## 📌 **5. Finding a Missing Number in an Arithmetic Sequence**
Given:
- First term: \( a \)
- Common difference: \( d \)
- Number of terms: \( n \)

### **Formula:**
$$ \text{missingNumber} = S_n - \sum(\text{array}) $$
Where:
$$ S_n = \frac{(n+1)}{2} \times (2a + nd) $$

### **Example Calculation:**
For `nums = [2, 4, 8, 10]`, `a = 2`, `d = 2`:
$$ S_5 = \frac{5}{2} \times (2(2) + (5-1)2) = 30 $$
$$ \text{actual sum} = 2 + 4 + 8 + 10 = 24 $$
$$ \text{missing number} = 30 - 24 = 6 $$

---

## 📌 **6. Sum of First `n` Odd Numbers**
### **Formula:**
$$ S_n = n^2 $$

### **Example Calculation:**
For `n = 4`:
$$ S_4 = 4^2 = 16 $$

---

## 📌 **7. Sum of First `n` Even Numbers**
### **Formula:**
$$ S_n = n(n + 1) $$

### **Example Calculation:**
For `n = 4`:
$$ S_4 = 4(4 + 1) = 20 $$

---

## 📌 **8. HCF (Highest Common Factor) & LCM (Least Common Multiple)**
### **Formula:**
$$ \text{HCF}(a, b) \times \text{LCM}(a, b) = a \times b $$

### **Example Calculation:**
For `a = 12`, `b = 18`:
$$ \text{HCF}(12, 18) = 6, \quad \text{LCM}(12, 18) = 36 $$

---

## 📌 **9. Number of Digits in a Number (`log` Method)**
### **Formula:**
$$ d = \lfloor \log_{10}(n) \rfloor + 1 $$

### **Example Calculation:**
For `n = 4567`:
$$ d = \lfloor \log_{10}(4567) \rfloor + 1 = 4 $$

---

## 📌 **10. Sum of Digits of a Number**
### **Formula (Recursive Approach):**
$$ S(n) = n \% 10 + S(n / 10) $$

### **Example Calculation:**
For `n = 123`:
$$ 1 + 2 + 3 = 6 $$

---

## 📌 **More Advanced Topics to Explore**
✅ Fibonacci Sequence: $$ F_n = F_{n-1} + F_{n-2} $$
✅ Permutations & Combinations: $$ nPr = \frac{n!}{(n-r)!} $$, $$ nCr = \frac{n!}{r!(n-r)!} $$
✅ Quadratic Equation: $$ x = \frac{-b \pm \sqrt{b^2 - 4ac}}{2a} $$
✅ Modular Exponentiation: $$ (a^b) \mod m $$

---
### **📌 Conclusion**
This document summarizes **frequently used mathematical formulas** in problem-solving, programming, and competitive coding.

🚀 **Use these formulas to solve problems efficiently!**
