package day10_08_10_2024.annotation;

import day06_30_09_2024.funcionalprogramming.Pradicate;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

public class DemoReflection
{
    public static void main(String[] args) throws IllegalAccessException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Student s = new Student();
        Class c = s.getClass();

        Field[] field = c.getDeclaredFields();
        for (Field f : field) {
            System.out.println(f.getName());
            System.out.println(f.getType());

            if (f.getName().equals("rollNo")) {
                f.setAccessible(true);
                f.setInt(s,110);
            }

            if (f.getName().equals("name")) {
                f.setAccessible(true);
                f.set(s,"Kuna");
            }
        }

        s.displayData();

        Constructor[] cons = c.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con.getParameterAnnotations());
            if (con.getParameterAnnotations().length == 2) {
                Parameter[] params = con.getParameters();
                System.out.println(Arrays.toString(params));
                Student s1 = (Student) con.newInstance(111,"HMMM");
                s1.displayData();
            }
        }

        Method [] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
            if (m.getName().equals("privateMethod")) {
                m.setAccessible(true);
                m.invoke(s);
            }

            if (m.getName().equals("staticMethod")) {
                m.setAccessible(true);
                m.invoke(null);
            }

            if (m.getName().equals("methodWithParameter")) {
                Parameter [] parameters = m.getParameters();
                System.out.println(Arrays.toString(parameters));
                m.invoke(s,456,"KKK");
            }
        }

        for (Method m : methods) {
            if (m.getDeclaredAnnotation(CreatedBy.class)!= null)
            {
                CreatedBy anno = m.getDeclaredAnnotation(CreatedBy.class);
                if (anno.priority() == 1)
                {
                    m.invoke(s);
                }
            }
        }
    }
}
