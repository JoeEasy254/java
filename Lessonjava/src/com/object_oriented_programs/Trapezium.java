package com.object_oriented_programs;

 class area {
    int lena;
    int lenb;
    int height;

    void trapeziumValues(int a,int b,int h){
        lena = a;
        lenb = b;
        height = h;
     }

     void displayArea(){
        int area = (lena + lenb ) / 2 * height;

         System.out.println("Trapezium area is " + area);
     }
}

public class Trapezium{
 public static void main(String[] args){
     area trapezium_area = new area();
     trapezium_area.trapeziumValues(60,40,10);
     trapezium_area.displayArea();
 }
}
