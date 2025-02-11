# Strings in Java

## Characteristics of Strings
1. **Sequence of Characters**: Strings in Java are sequences of characters represented by the `String` class.
2. **Immutable**: Strings are immutable; once created, their content cannot be changed.
3. **Index-Based Access**: Characters in a string can be accessed directly using indices.
4. **Dynamic Length**: The size of a string can vary depending on its content.
5. **String Pool**: String literals are stored in a common pool to save memory.

---

## How Strings Work in Java
- **Memory Layout**: Strings are stored in the heap memory, with literals placed in the String Pool.
- **Immutability**: Any modification to a string creates a new object.
- **String Pool**: Optimizes memory usage by reusing string literals.
- **Reference Type**: Strings are objects in Java, not primitive data types.

---

## Where/When Strings Are Used
- **Text Processing**: For storing and manipulating textual data.
- **Data Validation**: Input validation and sanitization.
- **Pattern Matching**: Using regex for searching patterns in strings.
- **Immutable Data**: Ensures safety and security in multithreaded applications.

---

## Complexities of String Operations

| Operation            | Time Complexity | Explanation                                       |
|----------------------|-----------------|-------------------------------------------------|
| **Access**           | `O(1)`          | Direct access to a character using an index.    |
| **Concatenation**    | `O(n)`          | Creates a new string with copied content.       |
| **Search**           | `O(n)`          | Linear search for substrings or characters.     |
| **Comparison**       | `O(n)`          | Character-by-character comparison.              |
| **Substring**        | `O(n)`          | Extracting a substring involves copying data.   |

---

## String Class in Java

### String Declaration:
```java
String str1 = "Hello World";       // String literal (stored in String Pool)
String str2 = new String("Hello"); // String object (stored in heap memory)
```

### Important String Methods:
```java
String str = "hello";

// Length of the string
int length = str.length(); // 5

// Character at a specific index
char ch = str.charAt(1); // 'e'

// Substring extraction
String sub = str.substring(1, 4); // "ell"

// Concatenation
String result = str + " world"; // "hello world"
String result2 = str.concat(" world"); // "hello world"

// String Comparison
boolean isEqual = str.equals("hello"); // true
boolean ignoreCase = str.equalsIgnoreCase("HELLO"); // true

// Replace characters
String replaced = str.replace('l', 'x'); // "hexxo"

// Convert to uppercase and lowercase
String upper = str.toUpperCase(); // "HELLO"
String lower = str.toLowerCase(); // "hello"

// Check if string contains a substring
boolean contains = str.contains("he"); // true

// Trim whitespace
String trimmed = "  hello  ".trim(); // "hello"

// Split a string
String[] parts = "hello world".split(" "); // ["hello", "world"]

// Convert to character array
char[] chars = str.toCharArray();

// Check if empty or blank
boolean isEmpty = str.isEmpty(); // false
boolean isBlank = str.isBlank(); // false
```

---

## StringBuilder and StringBuffer
For mutable strings, use `StringBuilder` or `StringBuffer` to avoid creating new objects repeatedly.

### StringBuilder (Not Thread-Safe, Faster):
```java
StringBuilder sb = new StringBuilder("hello");

// Append
sb.append(" world"); // "hello world"

// Insert
sb.insert(5, "!"); // "hello! world"

// Delete
sb.delete(5, 6); // "hello world"

// Reverse
sb.reverse(); // "dlrow olleh"

// Convert to String
String result = sb.toString();
```

### StringBuffer (Thread-Safe, Slower):
```java
StringBuffer sb = new StringBuffer("hello");

sb.append(" world"); // "hello world"
sb.reverse(); // "dlrow olleh"
```

---

## Comparison of String, StringBuilder, and StringBuffer

| Feature                | String                           | StringBuilder                   | StringBuffer                    |
|------------------------|----------------------------------|---------------------------------|---------------------------------|
| **Mutability**         | Immutable                       | Mutable                         | Mutable                         |
| **Thread-Safety**      | Not Thread-Safe                 | Not Thread-Safe                 | Thread-Safe                     |
| **Performance**        | Slow (new object creation)      | Fast                            | Slower than StringBuilder       |
| **Use Case**           | Fixed Strings                   | Single-threaded modifications  | Multi-threaded modifications   |

---

## Summary
- Strings in Java are immutable and stored in the String Pool.
- Use `StringBuilder` or `StringBuffer` for frequent string modifications.
- Java provides rich built-in methods for string manipulation.
- Choose the appropriate class based on performance and thread safety requirements.