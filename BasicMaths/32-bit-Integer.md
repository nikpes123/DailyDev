# Understanding 32-Bit Integers and Calculations

This document provides an overview of 32-bit integers, their limits, and how to handle calculations while avoiding overflow or underflow in programming.

---

## What is a 32-Bit Integer?

A **32-bit integer** is a data type used in programming to store whole numbers. It uses 32 bits of memory, where the first bit indicates the sign (positive or negative), and the remaining 31 bits store the number.

### Range of 32-Bit Integers:
- **Signed 32-bit integer** (includes both positive and negative values):
  - Minimum: `-2^31` = `-2,147,483,648`
  - Maximum: `2^31 - 1` = `2,147,483,647`
- **Unsigned 32-bit integer** (only positive values):
  - Range: `0` to `2^32 - 1` = `0` to `4,294,967,295`

---

## How to Calculate the Range of 32-Bit Integers

### 1. **Maximum Signed Integer (`2^31 - 1`):**
   - A signed 32-bit integer reserves 1 bit for the sign (positive/negative).
   - This leaves 31 bits for the number.
   - Maximum value is calculated as:
     ```
     2^31 - 1 = 2,147,483,647
     ```

### 2. **Minimum Signed Integer (`-2^31`):**
   - The smallest value is `-2^31` because negative numbers have an additional representation due to the sign bit.
   - Minimum value:
     ```
     -2^31 = -2,147,483,648
     ```

### 3. **Unsigned 32-Bit Integers (`0` to `2^32 - 1`):**
   - Since no bit is reserved for the sign, all 32 bits represent the number.
   - Maximum value:
     ```
     2^32 - 1 = 4,294,967,295
     ```

---

## Overflow and Underflow in 32-Bit Integers

### **What is Overflow?**
Overflow occurs when a value exceeds the maximum representable value (`2,147,483,647`). The result wraps around to the minimum value (`-2,147,483,648`).

**Example (Java):**
```java
int x = Integer.MAX_VALUE; // 2,147,483,647
x = x + 1; // Overflow: x becomes -2,147,483,648
```

### **What is Underflow?**
Underflow occurs when a value drops below the minimum representable value (`-2,147,483,648`). The result wraps around to the maximum value (`2,147,483,647`).

**Example (Java):**
```java
int x = Integer.MIN_VALUE; // -2,147,483,648
x = x - 1; // Underflow: x becomes 2,147,483,647
```

---

## Handling Overflow and Underflow

### 1. **Check Before Performing Operations**

#### **Addition Overflow Check**

##### **What Happens in Addition?**
When adding two numbers (`x + y`), if their sum is greater than `Integer.MAX_VALUE` (`2,147,483,647`), **overflow occurs**.

##### **How Does the Check Work?**
To avoid overflow:
- Ensure that `x + y` stays within the 32-bit range.
- Rearrange the check to:
  ```java
  x > Integer.MAX_VALUE - y
  ```
  - This ensures that adding `y` to `x` will not exceed the maximum allowable value.

##### **Example:**
Suppose:
- `x = 2_147_483_640` (close to `Integer.MAX_VALUE`)
- `y = 10`

Check:
```java
if (x > Integer.MAX_VALUE - y) {
    // Overflow will occur
}
```

- `Integer.MAX_VALUE - y = 2_147_483_647 - 10 = 2_147_483_637`.
- Since `x = 2_147_483_640` is **greater than** `2_147_483_637`, adding `10` to `x` will cause an overflow.

---

#### **Multiplication Overflow Check**

##### **What Happens in Multiplication?**
When multiplying two numbers (`x * y`), the result can grow even faster than addition and quickly exceed the 32-bit range.

##### **How Does the Check Work?**
To avoid overflow:
- Ensure `x * y` stays within the range.
- Rearrange the check to:
  ```java
  x > Integer.MAX_VALUE / y
  ```
  - This ensures that multiplying `x` by `y` will not exceed `Integer.MAX_VALUE`.

##### **Example:**
Suppose:
- `x = 200_000`
- `y = 50_000`

Check:
```java
if (x > Integer.MAX_VALUE / y) {
    // Overflow will occur
}
```

- `Integer.MAX_VALUE / y = 2_147_483_647 / 50_000 = 42,949`.
- Since `x = 200_000` is **greater than** `42,949`, multiplying `200_000 * 50_000` will cause an overflow.

---



## Problem Statement:
Given a signed 32-bit integer `x`, reverse its digits. If reversing causes overflow, return `0`.

**Example:**
- Input: `x = 123` → Output: `321`
- Input: `x = -123` → Output: `-321`
- Input: `x = 1534236469` → Output: `0` (overflow)


## Key Takeaways

1. **Understand the range of 32-bit integers:**
   - Signed: `-2,147,483,648` to `2,147,483,647`
   - Unsigned: `0` to `4,294,967,295`

2. **Prevent overflow/underflow by checking boundary conditions.**

3. **Use larger data types like `long` when working with numbers that may exceed the 32-bit range.**

4. **Always account for edge cases when reversing or performing arithmetic operations on integers.**

