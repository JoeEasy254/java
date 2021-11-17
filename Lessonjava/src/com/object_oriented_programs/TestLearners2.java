package com.object_oriented_programs;

class learnersState{
    String name;
    int k;
}


public class TestLearners2 {
    public static void main(String[] args){
        learnersState learn1 = new learnersState();
        learnersState learn2 = new learnersState();
        learn1.name = "joseph";
        learn2.k = 24;
        int p =032;
        System.out.println(p);

        System.out.println(learn1.k + " -- " + learn1.name);
    }
}
