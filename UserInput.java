//UserInput.java
import java.util.* ;

public class UserInput{
  private Scanner scan;
  private final Scanner scan;
  
  public UserInput(Scanner scan) {
        this.scan = scan;
    }

  //Creating method handleOperations
  public void handleOperation(int choice, Calculator calculator) {
    switch (choice) {
      //Addition
      case 1 -> {
        System.out.println("Enter two numbers:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Result: " + calculator.add(a, b));
      }

      //Subtraction  
      case 2 -> {
        System.out.println("Enter two numbers:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Result: " + calculator.subtract(a, b));
      }

      //Multiplication  
      case 3 -> {
        System.out.println("Enter two numbers:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Result: " + calculator.multiply(a, b));
      }

      //Division  
      case 4 -> {
        System.out.println("Enter two numbers:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Result: " + calculator.divide(a, b));
      }

      //Fibonacci Series
      case 5 -> {
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        System.out.println("Fibonacci: " + calculator.fibonacci(n));
      }

        
    }
  }
