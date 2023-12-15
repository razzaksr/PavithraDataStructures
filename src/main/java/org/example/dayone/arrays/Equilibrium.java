package org.example.dayone.arrays;

import java.util.Arrays;

public class Equilibrium {

    public static int findPosition(int[] arr){
        int overAllSum=0, leftSum=0;
        for(int each:arr){overAllSum+=each;}
        System.out.println(overAllSum);

        for(int index=0;index<arr.length;index++){
            overAllSum-=arr[index];
            if(overAllSum==leftSum){
                return index;
            }
            leftSum+=arr[index];
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] ogArray={-12,-1,6,1,8,-5,10,-2,56};
//        int[] ogArray={-3,56,66,-17,11,-12};
        int[] ogArray={-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findPosition(ogArray));
    }
}
