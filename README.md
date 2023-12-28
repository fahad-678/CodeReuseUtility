# Java Code Utility - CodeReuse

This repository provides a Java utility class 'CodeReuse' that encapsulates commonly used methods for array manipulation and matrix operations.

## Features

### Methods Included:

-   `sortAscending`: Sorts an array of integers in ascending order.
-   `calculateStats`: Computes maximum, minimum, and average values of an integer array.
-   `matrixAddition`: Adds two matrices and returns the resultant matrix.

## Usage

### Using the CodeReuse Class

1. **Clone or Download the Repository**

    - Clone the repository:
        ```bash
        git clone https://github.com/fahad-678/CodeReuseUtility.git
        ```
    - Or download the ZIP file and extract it.

2. **Add CodeReuse.jar to Your Project**

    - Copy `CodeReuse.jar` from the repository to your Java project's directory.

3. **Add JAR to Classpath or Dependency Management**

    - **Classpath Method**:

        - Add the JAR to your project's classpath.
        - Import the `CodeReuse` class:
            ```java
            import com.example.CodeReuse; // Update package name accordingly
            ```

    - **Maven**:

        - Add as a dependency in your `pom.xml`:
            ```xml
            <dependency>
                <groupId>com.example</groupId>
                <artifactId>CodeReuse</artifactId>
                <version>1.0</version>
                <scope>system</scope>
                <systemPath>/path/to/CodeReuse.jar</systemPath>
            </dependency>
            ```

    - **Gradle**:
        - Add as a dependency in your `build.gradle`:
            ```groovy
            dependencies {
                implementation files('/path/to/CodeReuse.jar')
            }
            ```

4. **Import and Use the CodeReuse Class**

    ```java
    import com.example.CodeReuse;

    public class YourClass {
        public static void main(String[] args) {
            int[] array = {4, 2, 7, 1, 9};

            // Example for sorting an array
            CodeReuse.sortAscending(array);
            System.out.println("Sorted Array: " + Arrays.toString(array));

            // Other method calls as needed
        }
    }
    ```
