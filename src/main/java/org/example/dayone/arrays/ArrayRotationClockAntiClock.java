package org.example.dayone.arrays;

import java.util.Arrays;

public class ArrayRotationClockAntiClock {

    public static String[] antiClock(String[] arr, int count){
        int size=arr.length;
        String[] temp = new String[arr.length];

        for(int index=0;index<arr.length;index++){
            temp[index]=arr[(index+count)%size];
        }

        return temp;
    }

    public static void main(String[] args) {
        String[] myColors={"pink","black","purple","blue","white","yellow"};

        System.out.println(Arrays.toString(antiClock(myColors,4)));
    }
}
