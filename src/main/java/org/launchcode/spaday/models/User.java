package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {
    private static int id;
    private static int nextId =1;
    @NotNull
    @Size(min=5, max = 15)
    private String username;
    @Email
    private String email;
    @Min(6)
    private String password;



    public User() {
        this.id=nextId;
        nextId++;
    }

    public User(String username, String email, String password, String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

