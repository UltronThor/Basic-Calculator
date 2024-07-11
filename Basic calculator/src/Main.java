import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int operator ;
        double num1 , num2 ;
        System.out.println("1 - Add \n 2 - Subtract  \n 3 - Multiplication \n 4 - Divide");
        System.out.println("Select operator :  ");
        Scanner calculator = new Scanner(System.in);
        operator = calculator.nextInt();
        System.out.println("Enter first number : ");
        num1 = calculator.nextDouble();
        System.out.println("Enter second number : ");
        num2 = calculator.nextDouble();

       double result = 0;
        switch (operator) {
            case 1:
                result = num1 + num2;
                break;

            case 2:
                result = num1 - num2;
                break;

            case 3:
                result = num1 * num2;
                break;

            case 4:
                result = num1 / num2;
                 break;


        
            default: System.out.println("Entered operator is not valid :(");
                break;
        }

        System.out.println("Result is : "+result);
    }
}
