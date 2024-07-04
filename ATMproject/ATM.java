public class ATM{
    BankAccount userAccount = new BankAccount();
    public void atmPrep(String password,String Name,double balance){
        this.userAccount.setPassword(password);
        this.userAccount.setUserName(Name);
        this.userAccount.setBalance(balance);
    }
    public void Deposit(double depositedAmount){
        userAccount.setBalance(userAccount.getBalance()+depositedAmount);
        System.out.println("Your balance now is: "+userAccount.getBalance());
    }
    public void Withdraw(double withdrawnAmount){
        
        double newB = userAccount.getBalance() - withdrawnAmount;
        userAccount.setBalance(newB);
        System.out.println("Your balance now is: "+userAccount.getBalance());
    }
    public void checkBalance(){
        System.out.println("Your balance is: " +userAccount.getBalance());
    }
}
