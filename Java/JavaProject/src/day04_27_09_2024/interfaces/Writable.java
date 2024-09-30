package day04_27_09_2024.interfaces;

public interface Writable
{
    void write();
    default void foo()
    {
        System.out.println("This Default Functionality");
    }
}
