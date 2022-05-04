import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
  
        Scanner data = new Scanner(System.in);
 
        System.out.println("Enter a number: ");
        int num1 = data.nextInt();
        
        System.out.println("Enter another number: ");
        int num2 = data.nextInt();

        // 1. Addition

        int addition = num1 + num2;
        System.out.println( num1 + " + " + num2  + " = " + addition);

        // 2. Subtraction

        int subtraction = num1 - num2;
        System.out.println( num1 + " - " + num2  + " = " + subtraction);
      
        // 3. Multiplication

        int multiplication = num1 * num2;
        System.out.println( num1 + " * " + num2  + " = " + multiplication);
      
        // 4. Division

        Float  division = (float)num1 / (float)num2;
        System.out.println( num1 + " / " + num2 + " = " + division);

        // 5. Modulus

        int Modulus = num1 % num2;
        System.out.println( num1 + " % " + num2  + " = " + Modulus);
            
    }
}
