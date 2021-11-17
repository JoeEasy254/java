package com.object_oriented_programs;

class Circle {

    double radius;

    void constructVlaues(int r){
        this.radius = r;
    }

    void calculateArea(){
        double area = Math.PI * radius * radius;

        System.out.println("The area for circle is " + Math.round(area));
    }
}

public class CircleArea{
 public static void main(String[] args){
     Circle newCircle = new Circle();
     newCircle.constructVlaues(4);

     newCircle.calculateArea();
 }
}

