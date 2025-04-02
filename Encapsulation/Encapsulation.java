class BankAccount{
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited"+amount+"New Balance"+balance);

        }else{
            System.out.println("Invalid deposit amount  ");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        BankAccount myAccount= new BankAccount("Nishant",1000);
        System.out.println("account Holder"+myAccount.getAccountHolder());
        System.out.println("Current Balance"+myAccount.getBalance());

         myAccount.deposit(500);
         myAccount.withdraw(200);
    }
}