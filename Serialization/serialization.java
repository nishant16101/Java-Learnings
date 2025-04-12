import java.io.*;

// Serializable class
class Student implements Serializable {
    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}

class serialization {
    public static void main(String[] args) {
        Student s1 = new Student("Nishant", 101);

        // Serialize to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(s1);
            System.out.println("Object Serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize from the file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s2 = (Student) in.readObject();
            System.out.println("Object Deserialized");
            s2.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
