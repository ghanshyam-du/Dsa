public class Students {
    public static void main(String args[]){
        Student Ghanshyam = new Student();
        Ghanshyam.roll = 21;
        Ghanshyam.marks = 90.23f;
        Ghanshyam.name = "Ghanshyam dubey ";

        System.out.println(Ghanshyam.marks);
        System.out.println(Ghanshyam.name);
        System.out.println(Ghanshyam.roll);

    }
}

class Student{
    int roll;
    String name;
    float marks;
}