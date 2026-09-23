import java.net.SocketTimeoutException;

class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something...");
    }

    public void printColor() {
        System.out.println(this.color);

    }

}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2= new Pen();
        pen2.color="black";
        pen2.type="gel";

        pen1.write();


        Student s1 = new Student();
        s1.name="Dip";
        s1.age=23; 
        s1.printInfo();

        Student s2 = new Student();
        s2.name = "No Name";
        s2.age=23;

        s2.printInfo();
    }
}
