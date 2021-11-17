package com.ngugimuchene;

public class Main {
    private final String name;
//    constructor

    public Main(String nme){
        this.name = nme;
    }
    public void myfunction(){
        System.out.println("hello " + name);
    }
    public static void main(String[] args) {
	// write your code here
//        Main output = new Main("joseph");
//
//        output.myfunction();

        User getuser = new User("joseph ","ngugimuchene@gmail.com",123456);
        getuser.checkName();
        getuser.checkPassword();
        getuser.validateEmail();
        System.out.println(getuser.getName());
        System.out.println(getuser.getEmail());
        System.out.println(getuser.getPassword());
        System.out.println(  getuser.checkName());
        System.out.println(  getuser.checkPassword());
        System.out.println(  getuser.validateEmail());


    }
}
