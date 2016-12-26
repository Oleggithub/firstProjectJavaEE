package com;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by b_nop on 15.12.2016.
 */
public class YearConstraintValidator implements ConstraintValidator<Year, Date> {

    private int annotationYear;

    @Override
    public void initialize(Year year) {
        this.annotationYear = year.value();
    }

    @Override
    public boolean isValid(Date target, ConstraintValidatorContext cxt) {
        if (target == null) {
            return true;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(target);
        int fieldYear = c.get(Calendar.YEAR);

        return fieldYear == annotationYear;
    }

}