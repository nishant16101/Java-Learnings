class Parent{
    public int publicVar =10;
    protected int  protectedVar =20;
    int defaultvar =30;
    private int privateVar =40;

    void display(){
        System.out.println("Public"+publicVar);
        System.out.println("Private"+privateVar);
        System.out.println("default"+defaultvar);
        System.out.println("protected"+protectedVar);
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Public"+publicVar);
        System.out.println("protected"+protectedVar);
        //System.out.println("Private"+privateVar);
    }
}
public class AccessModifierExample {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.display();

        System.out.println("Accessing from main:");
        System.out.println("Public: " + obj.publicVar); 
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultvar); 
        
    }
}
