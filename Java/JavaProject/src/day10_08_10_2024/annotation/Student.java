package day10_08_10_2024.annotation;

public class Student
{
    private int rollNo;
    private String name;

    public Student() {
        rollNo = 100;
        name = "Dash";
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    private void privateMethod() {
        System.out.println("This is a Private Method");
    }

    @CreatedBy(priority = 1,createdBy = "Kunnu")
    public void displayData() {
        System.out.println(" Roll No: "+ rollNo + " " +" Name: "+ name);
    }

    public void methodWithParameter(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        System.out.println("Roll No Set No: "+rollNo);
        System.out.println("Name Set: "+name);
    }

}
