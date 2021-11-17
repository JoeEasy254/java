package Javalesson;

public class Pyramidfor {
    public static  void main(String[] args){
//        for(int a = 1;a <= 6;a++){
//            for(int b =1 ;b<=a;b++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i = 10; i>=1;i--){
//            String str = "*";
//            String repeated = str.repeat(i);
//            System.out.println(repeated);
//        }
int num = 10;
    for(int a = 1;a<=num;a++){
        for(int b = num; b >= a;b--){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
