package com.ngugimuchene;

public class User {
    private final String name;
    private final String email;
    private final int password;
    private int getLenght;

//    constructor
    public User(String nme,String emai,int pass){
        this.name = nme;
        this.email = emai;
        this.password = pass;
    }

//    method
    public String validateEmail(){
        if(email.matches("^(.+)@(\\\\S+)$")) {
            System.out.println("email validated");
        }
            return email;

    }
    public int checkPassword(){
        getLenght = String.valueOf(password).length();
        if (getLenght > 6 ) {
            System.out.println("Password should not be greater than 6 characters");
        }
    return password;
    }

    public String checkName() {
        if (name.length() > 20){
            System.out.println("Name is invalid");
        }
        return name;
    }

    public String getName(){
        return  name;
    }

    public String getEmail(){
        return  email;
    }
    public int getPassword(){
        return  password;
    }

}