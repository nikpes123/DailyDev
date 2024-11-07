# Java Patterns Program Documentation

This document provides an overview of a Java class `Patterns` that generates different patterns based on an integer input `x`. Each pattern method prints a unique visual representation, including rows of asterisks and numerical sequences.

## Table of Contents
- [Introduction](#introduction)
- [Class and Methods](#class-and-methods)
  - [Method: `pattern1`](#method-pattern1)
  - [Method: `pattern2`](#method-pattern2)
  - [Method: `pattern3`](#method-pattern3)
  - [Method: `pattern4`](#method-pattern4)
  - [Method: `pattern5`](#method-pattern5)
- [Example Usage](#example-usage)
- [Screenshots](#screenshots)

---

## Introduction

The `Patterns` class contains methods to print various patterns. Each pattern is printed in a grid format using either asterisks (`*`) or numbers, depending on the method.

## Class and Methods

### Method: `pattern1`

Prints a solid square pattern with asterisks, where each line has `x` asterisks, repeated `x` times.

```java
    public void pattern1(int x) {
        for (int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    } 

    public void pattern1(int x){
        String line = "*".repeat(x);
        for (int i = 0; i < x; i++){
            System.out.println(line);
        }
    }
```

### Method: `pattern2`

Prints a right-angled triangle pattern using asterisks. The number of asterisks increases from 1 to x on each line.

```java
    public void pattern2(int x){
        for (int i = 1; i <= x; i++){
            System.out.println("*".repeat(i));
        }
    }
```
### Method: `pattern3`
Prints a right-angled triangle pattern with incremental numbers on each row. Each row contains numbers from 1 up to the current row number.
```java
    public void pattern3(int x){
        for (int i = 1 ; i <= x ;i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
```

### Method: `pattern4`
Prints a right-angled triangle pattern with incremental numbers on each row. Each row contains numbers from 1 up to the current row number.

```java
    public void pattern4(int x){
        for (int i = 1 ; i <= x ;i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
```
### Method: `pattern5`

Prints an inverted right-angled triangle pattern using asterisks. The number of asterisks decreases from `x` down to 1 on each line.

```java
    public void pattern5(int x) {
        for (int i = x; i > 0 ; i--){
            System.out.println("*".repeat(i));
        }
    }
```
## `Example Usage`
The main method demonstrates how to use the Patterns class to print each pattern. Uncomment each method call to display different patterns.

```java
public static void main(String[] args) {
    Patterns pattern = new Patterns();
    pattern.pattern1(5); // Uncomment to see pattern1
    pattern.pattern2(5); // Uncomment to see pattern2
    pattern.pattern3(5); // Uncomment to see pattern3
    pattern.pattern4(5); // Uncomment to see pattern4
    pattern.pattern5(5); // Uncomment to see pattern4

}
```