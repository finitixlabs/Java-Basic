import java.util.Scanner;

public class Atm_system {
    static double balance = 10000;
    //Check Balance 
    public static void CheckBalance(){
        System.out.println("Your balance is : " + balance);
    }

    //Withdrawl
    public static void Withdrawl(double amount){
        if(amount <=0){
            System.out.println("Invalid amount");
        }
        else if(balance < amount){
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - amount;
            System.out.println("You have withdrawn : " + amount);
            System.out.println("Your balance is : " + balance);
        }
        
    }
    //Deposit
    public static void Deposit(double amount){
        if(amount <=0){
            System.out.println("Invalid amount");
        }
        else{
            balance = balance + amount;
            System.out.println("You have deposited : " + amount);
            System.out.println("Your balance is : " + balance);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
            //Options to Select
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            //Take input and store as Choice
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    CheckBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    Deposit(amount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    Withdrawl(amount);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
