# Java Fundamentals

## 1. Classes in Java

A **class** is a blueprint that contains:
- **Properties (variables)** – Define the data or state.
- **Methods (functions)** – Define the behavior or actions.

Important points:
- In Java, each `.java` file can contain multiple classes.
- A `.java` file can contain at most one `public` top-level class.
- The **public class name should match the file name exactly**.
- Class names should follow **PascalCase** (capitalize the first letter of each word).

Example:

```java
public class HelloWorld {
}
```

---

## 2. Access Modifiers

Access modifiers control the visibility of classes, methods, and variables.

| Modifier | Accessibility |
|---|---|
| `public` | Accessible from anywhere, subject to module/package access rules |
| `private` | Accessible only within the same class |
| `protected` | Accessible within the same package and through inheritance |
| Default (no modifier) | Accessible within the same package |

---

## 3. Methods

Methods are functions defined inside a class.

They are used to perform specific tasks and make code reusable.

### Main Method

```java
public static void main(String[] args)
```

It is the traditional **entry point** of a Java application.

### Breakdown

| Keyword | Meaning |
|---|---|
| `public` | Allows the JVM launcher to access the method |
| `static` | Can be called without creating an object |
| `void` | Does not return any value |
| `main` | Name of the entry method |
| `String[] args` | Command-line arguments |

---

## 4. Packages

Packages are used to organize Java classes into logical groups and namespaces.

They help:
- Organize code.
- Avoid naming conflicts.
- Control package-level accessibility.
- Improve code maintainability.

Example:

```java
package com.example;
```

A package name commonly follows lowercase naming conventions.

---

## 5. Built-in Java Classes

Java provides many built-in classes that make development easier.

Examples:
- `System`
- `Scanner`
- `Math`
- `String`
- `Integer`
- `ArrayList`

These classes provide predefined functionality that can be reused.

---

## 6. Input and Output

### Output

Used to print data to the console.

```java
System.out.println("Hello");
```

Other output methods:

```java
System.out.print("Hello");
System.out.printf("Value: %d", 10);
```

### Input

The `Scanner` class is used to take input from the user.

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int age = sc.nextInt();

System.out.println(age);
```

Common Scanner methods:

| Method | Input Type |
|---|---|
| `nextInt()` | Integer |
| `nextLong()` | Long |
| `nextFloat()` | Float |
| `nextDouble()` | Double |
| `next()` | Single word |
| `nextLine()` | Entire line |
| `nextBoolean()` | Boolean |

---

## 7. Primitive Data Types

Primitive data types are the basic built-in data types in Java.

Java has **8 primitive data types**.

| Data Type | Size | Default Value |
|---|---|---|
| `byte` | 1 byte | `0` |
| `short` | 2 bytes | `0` |
| `int` | 4 bytes | `0` |
| `long` | 8 bytes | `0L` |
| `float` | 4 bytes | `0.0f` |
| `double` | 8 bytes | `0.0d` |
| `char` | 2 bytes | `'\u0000'` |
| `boolean` | JVM-dependent representation | `false` |

**Note:**
- Primitive types store values directly.
- `boolean` has no officially specified storage size in the Java language specification.
- Default values apply to class fields and array elements, not uninitialized local variables.

---

## 8. Wrapper Classes

Every primitive type has a corresponding wrapper class.

| Primitive Type | Wrapper Class |
|---|---|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

Wrapper classes allow primitive values to be represented as objects.

Example:

```java
int a = 10;

Integer b = a;
```

Java automatically converts between primitives and their wrapper classes using:

- **Autoboxing** – Primitive to Wrapper.
- **Unboxing** – Wrapper to Primitive.

---

## 9. Literals and Identifiers

Example:

```java
int a = 10;
```

- `a` → Identifier (variable name).
- `10` → Literal (constant value).
- `int` → Data type.

A literal is a fixed value directly written in the source code.

Examples:

```java
int age = 24;
double price = 99.99;
char grade = 'A';
boolean isActive = true;
String name = "Sarthak";
```

---

## 10. Type Conversion (Widening)

Automatic conversion happens when converting from a **smaller compatible data type to a larger compatible data type**.

Example:

```java
int a = 10;

double b = a;

System.out.println(b);
```

Output:

```text
10.0
```

This is called **Widening Type Conversion**.

- Happens automatically.
- Generally avoids loss of magnitude or precision for these conversions.
- Example: `int` → `double`.

---

## 11. Type Casting (Narrowing)

Manual conversion from a larger data type to a smaller data type.

Example:

```java
int a = (int) 55.2f;

System.out.println(a);
```

Output:

```text
55
```

This is called **Narrowing Type Casting**.

- Requires explicit casting in cases such as `float` to `int`.
- May result in data loss.
- Decimal portions are truncated when converting floating-point values to integers.

---

## 12. ASCII and Unicode

Java follows **Unicode**, not just ASCII.

ASCII characters are included within Unicode.

Example:

```java
int a = 'A';

System.out.println(a);
```

Output:

```text
65
```

Explanation:

- Character `'A'` has Unicode value `65`.
- When a `char` is converted to an `int`, its numeric Unicode code unit value is returned.
- Java `char` represents a UTF-16 code unit and occupies 2 bytes.

---

## 13. Automatic Type Promotion in Expressions

During arithmetic operations, smaller integral data types (`byte`, `short`, and `char`) are automatically promoted to `int`.

Example:

```java
byte a = 10;
byte b = 20;
byte c = 100;

int d = a * b / c;

System.out.println(d);
```

Output:

```text
2
```

Even though all variables are `byte`, the result is stored in an `int` because Java promotes operands to `int` during arithmetic calculations.

**Important:** This is why the following produces a compilation error:

```java
byte a = 10;
byte b = 20;

byte c = a + b; // Compilation error
```

You need explicit casting:

```java
byte c = (byte) (a + b);
```

---

## 14. Byte Range

- Size: **1 byte (8 bits)**.
- Minimum value: `-128`.
- Maximum value: `127`.

Range:

```text
-128 to 127
```

Total possible values:

```text
256
```

Formula:

\[
2^8 = 256
\]

---

## 15. Loops in Java

Loops are used to execute a block of code repeatedly.

Java provides:
- `for` loop
- `while` loop
- `do-while` loop

### For Loop

Use a `for` loop when you know **how many times** the loop should run.

Syntax:

```java
for (initializer; condition; increment/decrement) {
    // Code
}
```

Example:

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

Output:

```text
0
1
2
3
4
```

### While Loop

Use a `while` loop when the number of iterations is **not known beforehand**.

Syntax:

```java
while (condition) {
    // Code
}
```

Example:

```java
int i = 0;

while (i < 5) {
    System.out.println(i);
    i++;
}
```

### Do-While Loop

A `do-while` loop executes its body **at least once**, even if the condition is initially false.

Syntax:

```java
do {
    // Code
} while (condition);
```

Example:

```java
int i = 0;

do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

## 16. Switch Statement

The `switch` statement is used to execute one block of code from multiple choices based on the value of an expression.

### Basic Syntax

```java
switch (expression) {
    case value1:
        // Code
        break;

    case value2:
        // Code
        break;

    default:
        // Code
}
```

### Break Statement

- Terminates the current switch case.
- Prevents execution from continuing into the next case (fall-through).
- Without `break`, execution may continue into subsequent cases.

### Nested Switch

A switch statement can be placed inside another switch statement.

Example:

```java
switch (outer) {
    case 1:
        switch (inner) {
            case 1:
                // Code
                break;
        }
        break;
}
```

### New Switch Syntax (Java 14+)

Modern Java introduced a cleaner switch syntax using `->`.

Example:

```java
switch (day) {
    case "MONDAY" -> System.out.println("Start of week");
    case "FRIDAY" -> System.out.println("Weekend is near");
    default -> System.out.println("Normal day");
}
```

Benefits:
- No need for `break`.
- Cleaner and less error-prone.
- Prevents accidental fall-through.

---

## 17. Functions / Methods in Java

A **method (function)** is a block of code that performs a specific task.

A method declaration consists of:

- Access Modifier.
- `static` (optional).
- Return Type.
- Method Name.
- Parameters.

Example:

```java
public static void sum() {
    // Code
}
```

### Static vs Non-Static Methods

#### Static Method

- Belongs to the class.
- Can be called without creating an object.
- Also called **Object Independent**.

Example:

```java
public static void sum() {
    System.out.println("Static method");
}
```

Calling:

```java
sum();
```

#### Non-Static Method

- Belongs to an object (instance).
- Requires an object of the class to call it.

Example:

```java
public void display() {
    System.out.println("Non-static method");
}
```

Calling:

```java
HelloWorld obj = new HelloWorld();

obj.display();
```

---

## 18. Return Type

The return type specifies what a method returns.

### No Return Value

```java
public static void sum() {
    System.out.println("Hello");
}
```

`void` means the method does not return a value.

### Returning a Value

```java
public static int add(int a, int b) {
    return a + b;
}
```

Calling:

```java
int result = add(10, 20);

System.out.println(result);
```

Output:

```text
30
```

---

## 19. Parameters and Arguments

Parameters allow data to be passed into a method.

Example:

```java
public static int add(int a, int b) {
    return a + b;
}
```

- `a` and `b` are **parameters**.
- Values passed while calling the method are called **arguments**.

Calling:

```java
add(10, 20);
```

Here, `10` and `20` are arguments.

---

## 20. Pass by Value in Java

Java is **always pass-by-value**.

The behavior depends on the type of value being passed.

### Primitive Data Types

For primitives (`int`, `char`, `long`, etc.), a copy of the value is passed.

Therefore, changes inside the method **do not affect the original variable**.

Example:

```java
public static void change(int x) {
    x = 100;
}

public static void main(String[] args) {
    int a = 10;

    change(a);

    System.out.println(a);
}
```

Output:

```text
10
```

### Strings

- Strings are **immutable**.
- Their contents cannot be changed after creation.
- Operations that appear to modify a String create a new String instead.

### Objects

Java still uses **pass-by-value**, but the value being copied is the **reference** to the object.

- The reference value is copied.
- Both references initially point to the same object.
- Object contents can be modified inside the method.
- Reassigning the copied reference inside the method does **not** affect the original reference.

Example:

```java
class Student {
    String name;
}

public class Main {

    public static void change(Student s) {
        s.name = "Rahul";
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Sarthak";

        change(student);

        System.out.println(student.name);
    }
}
```

Output:

```text
Rahul
```

**Important:** Java does not support traditional pass-by-reference. Even when passing objects, Java passes a copy of the reference value.

---

## 21. Variable Scope

Scope determines where a variable can be accessed.

A variable's scope begins from the point where it is declared and ends at the closing boundary of its scope.

### Types of Scope

#### 1. Method Scope

Variables declared inside a method are accessible only within that method.

Example:

```java
public static void display() {
    int x = 10;
}
```

#### 2. Block Scope

Variables declared inside `{ }` are accessible only within that block.

Example:

```java
if (true) {
    int x = 5;

    System.out.println(x);
}
```

#### 3. Loop Scope

Variables declared inside a loop exist only within the loop.

Example:

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

Here, `i` cannot be accessed outside the loop.

---

## 22. Shadowing

Shadowing occurs when a local variable has the **same name** as a class or instance variable.

The local variable hides the class variable within its scope.

Example:

```java
class Test {

    static int x = 90;

    public static void main(String[] args) {
        int x = 40; // Shadows the class variable

        System.out.println(x);
        System.out.println(Test.x);
    }
}
```

Output:

```text
40
90
```

- `x` → Refers to the local variable.
- `Test.x` → Refers to the static class variable.

---

## 23. Variable Arguments (Varargs)

Varargs are used when the number of arguments is **unknown or variable**.

Syntax:

```java
public static void fun(int... numbers) {
    // Code
}
```

Example:

```java
public static void sum(int... numbers) {
    int total = 0;

    for (int num : numbers) {
        total += num;
    }

    System.out.println(total);
}
```

Calling:

```java
sum(10, 20);
sum(10, 20, 30);
sum(1, 2, 3, 4, 5);
```

For the main method, this is also valid:

```java
public static void main(String... args) {
}
```

**Important:**
- `int...` or `String...` is treated as an array internally.
- A method can have only one varargs parameter.
- The varargs parameter must be the last parameter.

---

## 24. Method Overloading

Method overloading means having **multiple methods with the same name but different parameter lists**.

Methods must differ in at least one of these:

- Number of parameters.
- Type of parameters.
- Order of parameter types.

Example:

```java
public static int sum(int a, int b) {
    return a + b;
}

public static int sum(int a, int b, int c) {
    return a + b + c;
}

public static double sum(double a, double b) {
    return a + b;
}
```

Calling:

```java
System.out.println(sum(10, 20));
System.out.println(sum(10, 20, 30));
System.out.println(sum(10.5, 20.5));
```

**Important:** Changing only the return type does **not** count as method overloading.

---

## 25. Quick Revision

### Java Basics

- Class = Blueprint containing properties and methods.
- Public class name = File name.
- Class names follow PascalCase.
- `main()` = Traditional entry point of a Java application.
- `static` = Can be called without creating an object.
- `void` = No return value.
- `String[] args` = Command-line arguments.
- Package = Organizes classes into logical groups.
- `System.out.println()` = Output.
- `Scanner` = Input.

### Data Types

- Primitive data types = `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.
- Wrapper class example = `Integer`.
- Identifier = Variable name.
- Literal = Constant value.
- Widening = Automatic type conversion.
- Narrowing = Manual type casting.
- Java uses Unicode.
- Arithmetic on `byte`, `short`, and `char` promotes operands to `int`.

### Loops and Conditions

- `for` = Useful when iterations are known.
- `while` = Useful when iterations are not known beforehand.
- `do-while` = Executes at least once.
- `switch` = Selects one block from multiple choices.
- `break` = Stops execution of the current case.
- New switch syntax (`->`) = Cleaner syntax without fall-through.

### Methods

- Method = Reusable block of code.
- `static` = Can be called without creating an object.
- `void` = No return value.
- Parameters = Inputs accepted by a method.
- Arguments = Actual values passed during a method call.
- Java is **always pass-by-value**.
- Strings are immutable.
- Objects are passed by copying their reference value.
- Scope types = Method, Block, Loop.
- Shadowing = Local variable hides a class or instance variable.
- Varargs (`...`) = Accept a variable number of arguments.
- Method overloading = Same method name with different parameter lists.

---

## 26. Topics to Explore Further

- [ ] Stack vs Heap Memory in Java.
- [ ] Primitive vs Non-Primitive Data Types.
- [ ] Static vs Instance Variables.
- [ ] Object Creation and Memory Allocation.
- [ ] Pass by Value vs Pass by Reference (Understand Java's actual behavior).
- [ ] Method Overloading vs Method Overriding.
- [ ] Java Execution Process (JDK, JRE, JVM).
- [ ] Compile Time vs Runtime.
- [ ] Memory Management and Garbage Collection.
- [ ] Java Access Modifiers in Detail.
