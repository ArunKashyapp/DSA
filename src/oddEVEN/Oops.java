package oddEVEN;

public class Oops {

    public static void main(String[] args) {
        Student s = new Student();
        s.age = 45;
        System.out.println(s.age);
    }
}

class Student {
    int age;

    // Constructor to initialize the age variable
     Student() {
        this.age = 0; // You can set an initial value if needed
    }
}



