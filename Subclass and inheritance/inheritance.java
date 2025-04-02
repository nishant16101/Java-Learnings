
class Vehicle {
    String brand = "Ford";  

    
    void honk() {
        System.out.println("Vehicle makes a sound!");
    }
}


class Car extends Vehicle {
    String model = "Mustang";  

    
    @Override
    void honk() {
        System.out.println(brand + " " + model + " honks: Beep Beep!");
    }
}

public class inheritance {
    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.honk(); 
        System.out.println("Brand: " + myCar.brand); 
        System.out.println("Model: " + myCar.model); 
    }
}
