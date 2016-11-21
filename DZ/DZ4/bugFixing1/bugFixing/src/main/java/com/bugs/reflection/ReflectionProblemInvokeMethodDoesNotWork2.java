package com.bugs.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblemInvokeMethodDoesNotWork2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class userClass = User.class.getClass();
        User user = new User(userClass.newInstance());
        Field field = userClass.getField("veryImportantField");
        field.set(user, "newValueForVeryImportantField");
        System.out.println("after changes --->>>> " + user.getVeryImportantField());
    }
}
