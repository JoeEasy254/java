package com.StudyJava;

import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args){
        String[] strarr = {"this","is","a","course","on","java"};
        List<String>  strList = Arrays.asList(strarr);
        System.out.println(strList);

        Integer[] intarr = {1,3,4,5,6,7,7,8,8};
        List<Integer> intList = Arrays.asList(intarr);

        System.out.println(intList);

    }
}
