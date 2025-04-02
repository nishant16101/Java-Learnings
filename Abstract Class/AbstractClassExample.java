abstract class Vehicle{
    String model;
    Vehicle(String model){
        this.model = model;

    }
    abstract void start();
    void stop(){
        System.out.println(model+"is empty");
    }
}
class Car extends Vehicle{
    Car(String model){
        super(model);
    }
    //implementing abstract method
    @Override
    void start(){
        System.out.println(model+"is starting with a key iginition");
    }
}
class Bike extends Vehicle{
    Bike(String model){
        super(model);

    }
    @Override
    void start() {
        System.out.println(model + " is starting with a kick.");
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        Vehicle car = new Car("Tesla Model S");
        car.start(); 
        car.stop(); 

        Vehicle bike = new Bike("Ducati Panigale");
        bike.start(); 
        bike.stop(); 
    }
}