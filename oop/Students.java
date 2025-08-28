public class Students {
    public static void main(String args[]) {
        Student Ghanshyam = new Student(25, "Ghanshyam", 98);
        // Ghanshyam.roll = 21;
        // Ghanshyam.marks = 90.23f;
        // Ghanshyam.name = "Ghanshyam dubey ";

        System.out.println(Ghanshyam.marks);
        System.out.println(Ghanshyam.name);
        System.out.println(Ghanshyam.roll);
        Ghanshyam.greeting();

    }
}

class Student {
    int roll;
    String name;
    float marks;

    Student(int rol, String naam, float marks) {
        this.roll = rol;
        this.name = naam;
        this.marks = marks;
    }

    void greeting() {
        System.out.println("Hi my name is " + this.name);
    }
}