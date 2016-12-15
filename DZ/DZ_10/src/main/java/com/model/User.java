package com.model;

import java.util.Date;

/**
 * Created by b_nop on 15.12.2016.
 */
public class User {
    private Long id;
    private String login;
    private String name;
    private String email;
    private Date birthDate;
    private Boolean active;

    public User(Long id, String login, String name, String email, Date birthDate, Boolean active) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.active = active;
    }

    public User(String john, String s, String s1, Date date, boolean b) {
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", active=" + active +
                '}';
    }
}
