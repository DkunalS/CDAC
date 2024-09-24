package day01_24_09_2024;

public class Student
{
    private static int count = 0;
    private int rollNo;
    private String name;
    private int age;

    public Student(String name, int age)
    {
        this.rollNo = ++count;
        this.name = name;
        this.age = age;
    }

    public void display()
    {
        System.out.println(rollNo + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Om", 23);
        Student s2 = new Student("Dhruv", 21);
        Student s3 = new Student("Yash", 22);
        Student s4 = new Student("Kunal", 26);
        Student s5 = new Student("Daksh", 21);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();

        System.out.println("Total no of Student: " + count);
    }
}
