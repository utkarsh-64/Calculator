## Assignment - 01
### 064 - URL
# Calculator

## Overview
This is a simple Java-based calculator program that allows users to perform various mathematical operations, including basic arithmetic, Fibonacci sequence computation, and statistical calculations like mean, variance, and standard deviation.

## Files
The project consists of three main files:

* Main.java: Handles the main execution flow and user interaction.
* UserInput.java: Manages user input and operation selection.
* Calculator.java: Contains methods to perform calculations.

## Functionalities
### Main.java
* Initializes scanner and instances of UserInput and Calculator.
* Runs a loop to take user input and select operations.
* Calls UserInput.handleOperation() to process user choices.

### UserInput.java
Handles user input and selects the appropriate calculation method.

Methods:
* handleOperation(int choice, Calculator calculator): Uses a switch-case to determine which operation to perform based on user input.
  * Takes two numbers as input for addition, subtraction, multiplication, and division.
  * Takes a single number for the Fibonacci sequence.
  * Takes an array for sum, mean, variance, and standard deviation calculations.

### Calculator.java
Contains mathematical operations.

Methods:
* double add(double a, double b): Returns the sum of two numbers.
* double subtract(double a, double b): Returns the difference of two numbers.
* double multiply(double a, double b): Returns the product of two numbers.
* double divide(double a, double b): Returns the quotient of two numbers (handles division by zero).
* int fibonacci(int n): Returns the nth Fibonacci number using recursion.
* double sumArray(double[] arr): Returns the sum of all elements in the array.
* double mean(double[] arr): Returns the mean (average) of the array elements.
* double variance(double[] arr): Computes and returns the variance of the array.
* double standardDeviation(double[] arr): Computes and returns the standard deviation of the array.

## Usage
1. Compile and run the program.
2. Enter the number corresponding to the desired operation.
3. Provide input values as prompted.
4. View the result displayed on the console.

## Exit
To exit the program, enter *10* when prompted for an operation selection.
