package day10_08_10_2024.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Retention Policy [ Method , FIELD , RUNTIME ]

@Target({ElementType.METHOD, ElementType.FIELD})                    // Where the Annotation will use
@Retention(RetentionPolicy.RUNTIME)                                 // Till what time

public @interface CreatedBy
{
    int priority();
    String createdBy();

}
