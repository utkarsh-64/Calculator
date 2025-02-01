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
      case 1 -> {
        System.out.println("Enter two numbers:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Result: " + calculator.add(a, b));
      }

      case 2 -> {
        System.out.println("Enter two numbers:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Result: " + calculator.subtract(a, b));
      }

      case 3 -> {
        System.out.println("Enter two numbers:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Result: " + calculator.multiply(a, b));
      }
        
    }
  }
