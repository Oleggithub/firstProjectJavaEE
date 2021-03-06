package auntification;

/**
 * Created by b_nop on 23.11.2016.
 */
public class User {
    String name;
    String surname;
    int age;
    UserRole role;

    public User(String name, String surname, int age, UserRole role) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.role = role;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", role=" + role +
                '}';
    }
}
