package auntification;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAutentification {
    UserRole userRoleS() default UserRole.SUPER_USER;
    UserRole userRoleA() default UserRole.ADMIN;
    UserRole userRoleU() default UserRole.USER;


}

