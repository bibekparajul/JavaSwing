import java.util.ArrayList;

public class FirstExample {

    public static void main(String[] args) {
                System.out.println("Hello WOrld");

                Student student = new Student(10,"Bibek",23,"Bode");
                Student student1 = new Student(11,"Rahul",22,"Kathmandu");


        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);

        //arraylist is a collection framework
        //code optimization and performance is the main thing

        for(Student std: students){
            System.out.println(std.getId());
            System.out.println(std.getName());
            System.out.println(std.getAddr());
            System.out.println(std.getAge());
        }


        System.out.println(student.getId());
        System.out.println(student.getName());
    }
}
