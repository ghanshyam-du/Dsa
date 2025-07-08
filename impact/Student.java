public class Student {
    String name;
    int roll;

    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    
    public String getName(){
        return "Student Name:" + name + "Roll number:" + roll;
    }

    public static void main(String[] args){
        Student student = new Student("John Doe", 101);
        System.out.println(student.getName());
    }
}

