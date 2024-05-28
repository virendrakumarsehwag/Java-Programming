import java.util.*;
import java.lang.*;

class Student {
    int roll;
    String name,address;
    public Student(int roll, String name, String address){
        this.roll=roll;
        this.address=address;
        this.name=name;

    }
    public String toString(){
        return "Name = " + this.name + " rollno = " + this.roll;
    }

    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));
        Student obj1 = new Student(21,"Golu","rewa");
        Student obj2 = new Student(1,"Gol","re");
        Student obj3 = new Student(2,"Gomlu","wa");
        System.out.println("Unsorted");
        System.out.println(obj1);
        System.out.println(obj3);
        System.out.println(obj2);


    }
}
class sortbyrollno implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
            return s1.roll-s2.roll;
    }
}
class sortbyname implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class SortingTest{
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
//        ar.add(new Student(111, "Mayank", "london"));
//        ar.add(new Student(131, "Anshul", "nyc"));
//        ar.add(new Student(121, "Solanki", "jaipur"));
//        ar.add(new Student(101, "Aggarwal", "Hongkong"));
        Student obj1 = new Student(21,"Golu","rewa");
        Student obj2 = new Student(1,"Gol","re");
        Student obj3 = new Student(2,"Gomlu","wa");
        ar.add(obj1);
        ar.add(obj2);
        ar.add(obj3);
        System.out.println("Unsorted");
       for(Student student: ar){
           System.out.println(student);
       }
       Collections.sort(ar, new sortbyname());
        for(Student student: ar){
            System.out.println(student);
        }
    }

}


