package com;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by b_nop on 15.12.2016.
 */
@Documented
@Constraint(validatedBy = YearConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Year {

    int value();
    String message() default "{Year}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}