class Address{
    String city;
    Address(String city){
        this.city= city;
    }
}
class Person implements Cloneable{
    String name;
    Address address;
    Person(String name,Address address){
        this.name = name;
        this.address = address;

    }
    //Override the clone method
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class shallow{
    public static void main(String[] args) throws CloneNotSupportedException{
        Address addr1 = new Address("Pune");
        Person p1 = new Person("Nishant",addr1);
        Person p2 = (Person) p1.clone();

        p1.address.city = "Mumbai";
        System.out.println("Person Address"+p1.address.city);
        System.out.println("Person Address"+p2.address.city);

    }
}