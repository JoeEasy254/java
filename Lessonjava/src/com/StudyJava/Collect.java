package com.StudyJava;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Collect {
    public static void main(String[] args){
//    create an array
        String[] myarr = {"my","array","is","just","an","array","with","cool","inputs"};
//        convert to list
        List<String> strList = new ArrayList<String>();
       Collections.addAll(strList,myarr);
       System.out.println(strList);

//       converting an integer to
        int[] arr = {1,3,4,5,6,7,7};
        List<Integer> myInts = new ArrayList<Integer>();

//        Collections.addAll(myInts,arr);
    }
}
