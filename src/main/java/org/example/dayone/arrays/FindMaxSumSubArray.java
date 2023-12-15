package org.example.dayone.arrays;

import java.util.Arrays;

public class FindMaxSumSubArray {

    public static int findMaxSub(int[] hai){
        int maxSum=Integer.MIN_VALUE, currentSum=0;
        for(int current=0;current<hai.length;current++){
            currentSum=0;
            for(int next=current;next<hai.length;next++){
                currentSum+=hai[next];
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] ogArray={-12,-1,6,1,8,-5,10,-2,56};
        System.out.println(findMaxSub(ogArray));
    }
}
