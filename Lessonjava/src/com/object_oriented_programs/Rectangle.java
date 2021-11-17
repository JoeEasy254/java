package com.object_oriented_programs;

 class RectangleArea {
    int width;
    int lenght;



    void insert(int wid,int leng){
        this.width = wid;
        this.lenght = leng;
    }

    void displayArea(){
        int area = width * lenght;
        System.out.println("The area is " + area);
    }
}

class Rectangle{
    public static void  main(String[] args){
        RectangleArea area = new RectangleArea();
        int width = 80;
        int length = 80;
        area.insert(width,length);

        area.displayArea();
    }
}