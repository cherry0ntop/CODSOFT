import java.util.Scanner;
import java.util.InputMismatchException;
public class MainATM {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Welcome to our banking system! Please enter your name: ");
    String name = s.nextLine();
    System.out.println("Welcome, "+name+"!\nPLease enter your password: ");
    String pass = s.nextLine();
    System.out.println("Please enter your balance (must be more than or equal to $100)");
    double balance1 = getNumberInput(s);
    while (balance1<100){
        System.out.println("Please enter an amount greater than or equal to $100");
        balance1 = getNumberInput(s);
    }
    ATM atm1 = new ATM();
    atm1.atmPrep(pass, name, balance1);
    System.out.println("Your account is set! What operation would you like to do? ");
     boolean continueProgram = true;
     boolean validInputDepo = false;
     boolean validInputWith = false;
        while (continueProgram){
            System.out.println("Please enter your desired operation:\n(1)Deposit\n(2)Withdraw\n(3)Checkbalance\n(4)Log Out");
            int choice = getIntInput(s);
            switch(choice){
                case 1:
                do{
                System.out.println("Enter your deposit amount");
               try{
                double depositedAmount = Double.parseDouble(s.nextLine());
                if (depositedAmount>0){
                atm1.Deposit(depositedAmount);
                validInputDepo = true;
                }
                else
                System.out.println("Please enter a positive amount.");
                }
                catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a number.");
                }
            }while(!validInputDepo);
                break;
                case 2:
                while(!validInputWith){
                System.out.println("Enter your withdraw amount(must be a positive amount\nthat is less than your balance): ");
                try{
                double withdrawnAmount = Double.parseDouble(s.nextLine());
                if ((withdrawnAmount)<=balance1&&(withdrawnAmount>0)){
                atm1.Withdraw(withdrawnAmount);
                validInputWith = true;
                }
                else{
                  System.out.println("Please enter a valid withdrawal amount.");
                }
                }
                catch(NumberFormatException e){
                    System.out.println("Invalid input. Please enter a number(No letters or special characters).");
                    }
                }
                break;
                case 3:
                atm1.checkBalance();
                break;
                case 4: 
                System.out.println("Thank you for using our program!");
                continueProgram = false;
                break;
                default:
                System.out.println("Please enter a correct number: ");
                break;
                
            }
        }
        }
        public static double getNumberInput(Scanner sc){
            double input = 0;
            boolean valid = false;
            while(!valid){
                try{
                    input = sc.nextDouble();
                    valid = true;
                }
                catch(InputMismatchException ime){
                    System.out.println("Invalid input. Please enter a valid number: ");
                    sc.nextLine();
                }
            }
            sc.nextLine();
            return input;
        }
        public static int getIntInput(Scanner sc){
            int input = 0;
            boolean valid = false;
            while(!valid){
                try{
                    input = sc.nextInt();
                    valid = true;
                }
                catch(InputMismatchException ime){
                    System.out.println("Invalid input. Please enter a valid number: ");
                    sc.nextLine();
                }
            }
            sc.nextLine();
            return input;
        }
    }
