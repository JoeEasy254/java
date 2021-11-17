package Javalesson;

public class InfiniteLoop {

    public static void main(String[] args){
        for(int n = 1;n < 50;n++){
            System.out.println(n);
            if(n == 40 ){
                break;
            }
        }
    }
}
