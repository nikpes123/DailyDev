# Arrays in Data Structures

## Characteristics of Arrays
1. **Fixed Size**: Arrays have a predefined size that cannot be changed after creation.
2. **Contiguous Memory Allocation**: All elements are stored in consecutive memory locations.
3. **Index-Based Access**: Elements can be accessed directly using their index.
4. **Homogeneous Data**: Arrays store elements of the same data type.
5. **Static Data Structure**: Size and type are fixed at compile time.

---

## How Arrays Work
- **Memory Layout**: Arrays store elements sequentially in memory.
- **Access**: Use an index to access elements in constant time (`O(1)`).
- **Storage**: Elements are of the same data type, allowing for predictable memory use.

---

## Where/When Arrays Are Used
- **Static Data**: When the size and type of data are known in advance.
- **Frequent Random Access**: Arrays are ideal for scenarios where fast access to elements is needed.
- **Low Overhead**: Arrays are simple and have minimal overhead compared to other data structures.

---

## Complexities of Array Operations

| Operation      | Time Complexity | Explanation                                  |
|----------------|-----------------|----------------------------------------------|
| **Access**     | `O(1)`          | Direct access using index.                  |
| **Insertion**  | `O(n)`          | Shifting elements for insertion in the middle. |
| **Deletion**   | `O(n)`          | Shifting elements after deletion.           |
| **Search**     | `O(n)`          | Linear search; `O(log n)` if sorted (binary search). |

---

## Comparison of Arrays vs Linked Lists

| Feature                | Arrays                           | Linked Lists                     |
|------------------------|-----------------------------------|-----------------------------------|
| **Memory Allocation**  | Contiguous                       | Dynamic                          |
| **Access Time**        | `O(1)` (Index-based)             | `O(n)` (Sequential traversal)    |
| **Insertion/Deletion** | `O(n)` (Shifting required)       | `O(1)` (At head or tail)         |
| **Dynamic Resizing**   | Not supported (fixed size)       | Supported                        |
| **Memory Usage**       | Efficient                        | Higher (extra pointers required) |

---

## Representation in Java

### One-Dimensional Arrays:
```java
int[] arr;       // Preferred way
int arr[];       // Alternate way
//  In Java, arrays do not have a default size when declared.
int[] arr = new int[5];  // Array with 5 elements (default initialized)

int[][] arr = new int[3][4];  // 3x4 matrix Multi-D