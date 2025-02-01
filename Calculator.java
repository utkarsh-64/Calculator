// Calculator.java
public class Calculator {

  //Creating method for addition
  public double add(double a, double b) { 
        return a + b; 
    }

  //Creating method for subtraction
  public double subtract(double a, double b) { 
        return a - b; 
    }

  //Creating method for multiplication
  public double multiply(double a, double b) { 
        return a * b; 
    }

  //Creating method for division
  public double divide(double a, double b) { 
        if (b != 0) {
            return a / b ;
        }
        else {
            return Double.NaN ;
        }
    }
}
