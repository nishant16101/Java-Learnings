

class BankAccount{
    double balance;
    BankAccount(double balance){
        this.balance = balance;
    }
void calculateInterest(){
    System.out.println("Interest calculation for general bank account");
}

}
class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    void calculateInterest(){
        double interest = balance*0.04;
        System.out.println("Savings Account Interset"+interest);
    }
    

}
class CurrentAccount extends BankAccount{
    CurrentAccount(double balance){
        super(balance);
    }
    @Override
    void calculateInterest(){
        System.out.println("Current Account do not earn interest");
    }
}
public class bankingsystem{
    public static void main(String[] args) {
        BankAccount account;
        account = new SavingsAccount(5000);
        account.calculateInterest();
        account = new CurrentAccount(5000);
        account.calculateInterest();
    }

}
