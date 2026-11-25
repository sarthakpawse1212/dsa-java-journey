# Arrays in Java

## 1. Introduction to Arrays

An **array** is a collection of elements of the **same data type** stored under a single variable name.

Arrays can store:
- Primitive data types (`int`, `char`, `boolean`, etc.).
- Non-primitive data types (Objects, `String`, custom classes, etc.).

### Primitive Data Types

Primitive values are stored directly as values.

Examples:
- `int`
- `char`
- `boolean`
- `float`
- `double`
- `long`

---

## 2. Array Declaration

General syntax:

```java
dataType[] variableName;
```

Example:

```java
int[] rollNums;
```

This only **declares** the array reference. No array object is created yet.

## 3. Array Initialization

An array object is created using the `new` keyword.

```java
int[] rollNums = new int[5];
```

Explanation:
- `int[] rollNums` → Declaration (reference variable).
- `new int[5]` → Creates an array object of size 5 in heap memory.
- Memory is allocated at **runtime** (Dynamic Memory Allocation).

### Declaration and Initialization Separately

```java
int[] nums;        // Declaration (reference variable)

nums = new int[5]; // Initialization (creates the actual array object)
```

### Array Initialization with Values

Instead of using `new`, values can be provided directly.

```java
int[] rollNums = {1, 5, 8, 7, 6};
```

The array object is automatically created and initialized with the given values.

---

## 4. Compile Time vs Runtime

```java
int[] rollNums = new int[5];
```

- `int[] rollNums` → Declaration is checked during **compile time**.
- `new int[5]` → Array object is created during **runtime** (Dynamic Memory Allocation).

---

## 5. Memory Allocation

### C / C++

- Array elements are stored in **contiguous (continuous) memory locations**.
- Each element has a memory address.
- Pointers can be used to access these addresses.

### Java

- Java does **not** provide direct access to memory addresses or pointers.
- Array objects are created in **heap memory**.
- JVM manages memory allocation and garbage collection.
- You don't work with memory addresses directly.

> **Note:** Array elements themselves are stored contiguously within the array object. The JVM manages where that object resides in the heap, so you don't deal with physical memory addresses.

---

## 6. Default Values in Arrays

When an array is created, its elements are automatically initialized with default values.

| Data Type | Default Value |
|---|---|
| `int` | `0` |
| `double` | `0.0` |
| `float` | `0.0f` |
| `long` | `0L` |
| `boolean` | `false` |
| `char` | `'\u0000'` |
| Object (`String`, etc.) | `null` |

### What is `null`?

`null` means the reference variable **does not point to any object**.

Example:

```java
String name = null;
```

For object arrays:

```java
String[] names = new String[3];
```

Initially:

```text
[null, null, null]
```

> **Important:** Primitive arrays are not initialized with `null`; they receive their respective default primitive values.

---

## 7. Filling an Array Using a Loop

You can populate an array using a loop.

```java
int[] arr = new int[5];

for (int i = 0; i < arr.length; i++) {
    arr[i] = i + 1;
}
```

Result:

```text
[1, 2, 3, 4, 5]
```

## 8. Printing an Array

Use the `Arrays.toString()` method.

```java
import java.util.Arrays;

System.out.println(Arrays.toString(arr));
```

Output:

```text
[1, 2, 3, 4, 5]
```

---

## 9. Primitive Arrays vs Object Arrays

### Array of Primitive Data Types

An array can store primitive values such as `int`, `char`, `boolean`, etc.

Example:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

Each element stores the actual primitive value.

### Array of Objects

Arrays can also store references to objects.

Example:

```java
String[] names = {"Sarthak", "Rahul", "Amit"};
```

Or for custom objects:

```java
Student[] students = new Student[5];
```

In object arrays:
- The array stores **references** to objects.
- Initially, each element contains `null` until an object is assigned.

---

## 10. Passing Arrays to Methods

Arrays are **mutable**, meaning their elements can be modified.

When an array is passed to a method, Java passes a **copy of the reference** (Java is still pass-by-value).

Since both references point to the same array object, changes made inside the method are reflected outside.

Example:

```java
public static void change(int[] arr) {
    arr[0] = 100;
}
```

Calling:

```java
int[] arr = {1, 2, 3};

change(arr);

System.out.println(Arrays.toString(arr));
```

Result:

```text
[100, 2, 3]
```

---

## 11. Multidimensional Arrays

A multidimensional array is an **array of arrays**.

Example:

```java
int[][] matrix = new int[3][4];
```

This creates:
- 3 rows.
- 4 columns in each row.

### Taking Input for a 2D Array

Use nested loops.

- **Outer loop** → Iterates through rows.
- **Inner loop** → Iterates through columns.

Example:

```java
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = sc.nextInt();
    }
}
```

---

## 12. Jagged (Dynamic Column) Arrays

In Java, each row of a 2D array can have a different number of columns.

Example:

```java
int[][] arr = {
    {1, 2},
    {3, 4, 5},
    {6}
};
```

This is called a **Jagged Array** (or irregular array).

- Number of rows is fixed after creation.
- Each row can have a different number of columns.
- Individual rows are separate array objects.

---

## 13. ArrayList

`ArrayList` is a class in the **Java Collections Framework**.

Other collection classes include:
- `LinkedList`
- `HashMap`
- `HashSet`
- `Stack`
- `Queue`

### Why Use ArrayList?

Use an `ArrayList` when you **don't know the number of elements in advance**.

Unlike arrays:
- Size grows automatically.
- You don't need to specify the size during creation.
- Elements can be added or removed dynamically.

Example:

```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
```

### Common ArrayList Methods

| Method | Description |
|---|---|
| `add()` | Adds an element |
| `get()` | Retrieves an element by index |
| `set()` | Updates an element |
| `remove()` | Removes an element |
| `contains()` | Checks if an element exists |
| `size()` | Returns the number of elements |
| `clear()` | Removes all elements |

Example:

```java
list.add(10);
list.add(20);

System.out.println(list.get(0));

list.set(1, 50);

System.out.println(list.contains(10));
```

### Internal Working of ArrayList

Although an `ArrayList` appears to have a dynamic size, it is internally backed by a **resizable array**.

When the internal array becomes full:

1. A new, larger array is created (typically about **1.5× larger** in modern Java implementations).
2. All elements are copied from the old array to the new one.
3. The old array becomes eligible for garbage collection.
4. The `ArrayList` now uses the new, larger array.

This resizing process happens automatically, so the programmer doesn't need to manage memory manually.

> **Note:** The exact growth factor is an implementation detail and may vary, but the key idea is that `ArrayList` automatically resizes by creating a larger internal array and copying existing elements into it.

---

## 14. Quick Revision

### Arrays

- Array = Collection of elements of the same data type.
- Arrays can store primitive and non-primitive data types.
- Declaration: `int[] arr;`
- Initialization: `arr = new int[5];`
- `new` creates the array object in heap memory.
- Array size is fixed after creation.
- C/C++ provide pointers and direct memory access.
- Java hides memory addresses and manages memory through the JVM.
- Primitive arrays have default values (`0`, `false`, etc.).
- Object arrays have `null` as the default value.
- Use a `for` loop to populate an array.
- Use `Arrays.toString(arr)` to print an array.

### Primitive vs Object Arrays

- Primitive arrays store actual values (`int`, `char`, etc.).
- Object arrays store references to objects.
- Arrays are mutable; changes to their elements inside a method affect the original array.
- Java is still **pass-by-value** (it passes a copy of the array reference).

### Multidimensional Arrays

- Multidimensional array = Array of arrays.
- Use nested loops for 2D arrays:
    - Outer loop → Rows.
    - Inner loop → Columns.
- Jagged arrays allow each row to have a different number of columns.

### ArrayList

- `ArrayList` belongs to the Java Collections Framework.
- Use `ArrayList` when the number of elements is unknown or changes dynamically.
- Common methods: `add()`, `get()`, `set()`, `remove()`, `contains()`, `size()`.
- `ArrayList` grows automatically by creating a larger internal array and copying existing elements into it.

---

## 15. Topics to Explore Further

- [ ] Primitive and Non-Primitive Data Types: Storage, Memory Allocation and Differences.
- [ ] Call by Value vs Call by Reference (Understand Java's actual behavior).
- [ ] Stack vs Heap Memory in Java.
- [ ] Internal Working of ArrayList.
- [ ] Time Complexity of Array and ArrayList Operations.
