package com.udemy.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)              //применяется к полю
@Retention(RetentionPolicy.RUNTIME)     //сохраняется вплоть до выполнения кода
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

    public String value() default "xyz.com";
    public String message() default "email must ends with xyz.com";

    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
