package org.example.dayone.arrays;

import java.util.Arrays;

public class CoinByGreedy {

    public static int findDenomination(int[] arr, int required){
        int count=0;
        Arrays.sort(arr);

        for(int index=arr.length-1;required>=0&&index>=0;){
            if(arr[index]<=required){
                required-=arr[index];
                count++;
                System.out.println(arr[index]+"X"+count);
            }
            else{
                index--;
            }
        }

        return required==0?count:-1;
    }

    public static void main(String[] args) {
        int[] denom={500,100,200};
        System.out.println(findDenomination(denom,1500));
        System.out.println(findDenomination(denom,1800));
        System.out.println(findDenomination(denom,2300));
        System.out.println(findDenomination(denom,3200));
    }
}
