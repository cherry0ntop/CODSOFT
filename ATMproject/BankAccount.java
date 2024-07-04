import java.util.Scanner;
public class BankAccount {
    Scanner sc = new Scanner(System.in);
    private String userName;
    private String Password;
    private double balance;
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        while (balance < 100) {
            System.out.println("Balance must be greater than 100. Please enter a new value:");
            balance = sc.nextInt();
          }
        this.balance=balance;
    }
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    
}
