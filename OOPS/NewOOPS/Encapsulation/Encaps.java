package OOPS.NewOOPS.Encapsulation;

class Account {
    private double balance;
     
    //public method to set and get balance 
    public void setBalance(double balance){
        if(balance > 0) this.balance += balance;
    }
    public double getBalance(){
        return this.balance;
    }

}

public class Encaps{
    public static void main(String[] args) {
        Account newAccount = new Account();
        newAccount.setBalance(5000);
        newAccount.setBalance(3000);
        double balance = newAccount.getBalance();
        System.out.println("Amount : " + balance);
    }
}