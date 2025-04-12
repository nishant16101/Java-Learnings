class Account{
    private int balance =1000;
    public synchronized void withdraw(String name,int amount){
        if(balance>=amount){
            System.out.println(name+"is trying to withdram"+amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(name+"completed withdrawal . Remaining amount"+balance);

        }else{
            System.out.println(name+"tried to withdraw"+amount+"but insufficient balance");
        }
    }

}

public class monitors{
    public static void main(String[] args) {
        Account acc = new Account();
        Runnable task1 = ()->acc.withdraw("Nishant", 700);
        Runnable task2 = ()->acc.withdraw("XYZ", 500);
        Thread t1= new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
    }
}