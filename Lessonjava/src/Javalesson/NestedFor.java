package Javalesson;

public class NestedFor {
    public static void main(String[] args){
        for(int i = 2; i <= 20; i+=2){
            for(int x = 1;x < 10; x++){
                System.out.println(i * x);
            }
        }

    }
}
