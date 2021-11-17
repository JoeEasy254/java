package com.object_oriented_programs;

 class Employee {
    int id;
    String name;
    float salary;

    void insert(int uniqueid,String nme,float slry){
        id = uniqueid;
        name = nme;
        salary = slry;
    }
 void display(){
        String empl = "Employee";
        System.out.println(empl+" => "+ id + " " + name + " "+ salary);

    }

}

public class Employees {
    public static void main(String[] args){


        Employee newemp1 = new Employee();
        Employee newemp2 = new Employee();
        Employee newemp3 = new Employee();
        Employee newemp4 = new Employee();

        Employee newemp5 = new Employee();



        newemp1.insert(1,"joseph",2599);
        newemp2.insert(2,"moses",2399);
        newemp3.insert(3,"john",4999);
        newemp4.insert(4,"joshua",4349);
        newemp5.insert(5,"catherine",5666);


        newemp1.display();
        newemp2.display();
        newemp3.display();
        newemp4.display();
        newemp5.display();


    }
}

