package JAVACHALLENGE100Days.Day1;
//problem from OOPS concept

public class Student {
    String name ;
    int age ;
    char Grade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Grade=" + Grade +
                '}';
    }

    Student(String name , int age , char Grade){
        this.name = name;
        this.age = age;
        this.Grade = Grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student("kanhaiya" , 20 , 'A');
        Student st2 = new Student("mohan " , 19 , 'B');
        System.out.println(st1.toString());
        System.out.println(st2.toString());

    }
}
