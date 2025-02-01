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

  //Creating fibonacci method for fibonacci sequence
  public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }   
    }

  //Creating method for the sum of array
  public double sumArray(double[] arr) {
        double sum = 0;

        for (double num : arr) {
            sum += num;
        }

        return sum;
    }

  //Creating method for mean of the array
  public double mean(double[] arr) {
        return sumArray(arr) / arr.length;
    }

  //Creating method for the Variance
  public double variance(double[] arr) {
        double mean = mean(arr);
        double sum = 0;

        for (double num : arr) {
            sum += Math.pow(num - mean, 2);
        }

        return sum / arr.length;
    }

  //Creating method of standardDeviation
  public double standardDeviation(double[] arr) {
        return Math.sqrt(variance(arr));
    }
}
