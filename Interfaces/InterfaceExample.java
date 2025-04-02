interface Payment{
    void makepayment(double amount);
    default void showpayment(){
        System.out.println("Payment Method selected");
    }
    static void displayCurrencies(){
        System.out.println("Supported Currencies :USD,INR,EUR");
    }
}
class CreditCardPayments implements Payment{
    @Override
    public void makepayment(double amount){
        System.out.println("Credit Card Payment of "+ amount+"successful");

    }

}
class UPIPayment implements Payment {
    @Override
    public void makepayment(double amount) {
        System.out.println("UPI Payment of $" + amount + " successful.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        
        Payment payment1 = new CreditCardPayments();
        payment1.makepayment(100.50);
        payment1.showpayment(); 
        
        Payment payment2 = new UPIPayment();
        payment2.makepayment(200.75);

        

        // Calling static method from interface
        Payment.displayCurrencies();
    }
}