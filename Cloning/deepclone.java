class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        // Deep clone: also clone the address
        Person cloned = (Person) super.clone();
        cloned.address = (Address) address.clone();
        return cloned;
    }
}

public class deepclone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr1 = new Address("Pune");
        Person p1 = new Person("Rahul", addr1);

        Person p2 = (Person) p1.clone();

        
        p1.address.city = "Mumbai";

        System.out.println("Person1 Address: " + p1.address.city);
        System.out.println("Person2 Address: " + p2.address.city);  
    }
}
