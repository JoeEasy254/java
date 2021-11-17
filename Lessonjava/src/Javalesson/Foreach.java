package Javalesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args){
//        int[] numbers = {1,3,5,6,7,87,8,8,8,8,9};
//        ArrayList<String> nameList = new ArrayList<String>();
//    nameList.add("joshua");
//    nameList.add("kevin");
//    nameList.add("simon");
//        for (String n:nameList){
//            System.out.print(n);
//        }

        jb:
        for (int a = 1; a <=5; a++){
            pk:
            for(int b = 1; b<=5;b++ ){
                if(a == 3 && b==3){
                    break pk;
                }
            System.out.println(a + " " + b);
            }

        }
    }
}
