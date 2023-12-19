package org.example.daytwo.divncon;

public class ClimbingStairsDC {

    public static int climb(int starirs){
        if(starirs<=0){
            return 0;
        }
        else if(starirs==1)
            return 1;
        else if(starirs==2)
            return 2;
        else{
            return climb(starirs-1)+climb(starirs-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(climb(8));
        System.out.println(climb(4));
        System.out.println(climb(5));
    }
}
