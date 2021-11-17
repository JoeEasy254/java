package com.object_oriented_programs;

 class Factor {
     int fact = 1;
     void factorial(int n){
          for(int i = 1;i <= n;i++){
            fact =  fact * i;
          }
         System.out.println("The factorial is:" + fact);
     }
}
public class Factorial {
public static void main(String[] args){
     new Factor().factorial(6);

}
}