import java.util.Scanner;

public class Calculator {
    public static double add(double a , double b) {
        return a + b;
    }
    public static double sub(double a , double b){
        return a - b;
    }
    public static double mul(double a , double b){
        return a * b;
    }
    public static double div(double a , double b){
        if(b==0){
            System.out.println("Error : Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
             System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using Calculator!");
                break;
            }            

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + sub(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + mul(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + div(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        sc.close();
        }

}