package org.example.dayone.arrays;

import java.util.Arrays;

public class PreFixNSufFixSum {

    public static double[] prefixSum(double[] socketArray){
        double preSum[]=new double[socketArray.length];
        preSum[0]=socketArray[0];
        for(int index=1;index < socketArray.length;index++){
            preSum[index]=preSum[index-1]+socketArray[index];
        }
        return preSum;
    }

    public static double[] suffixSum(double[] socketArray){
        double sufSum[]=new double[socketArray.length];
        sufSum[sufSum.length-1]=socketArray[socketArray.length-1];
        for(int index= socketArray.length-2;index >= 0;index--){
            sufSum[index]=sufSum[index+1]+socketArray[index];
        }
        return sufSum;
    }

    public static void main(String[] args) {
        double[] myArray={8.9,12.5,3.1,7.2,15.9,21.6};
        System.out.println(Arrays.toString(prefixSum(myArray)));
        System.out.println(Arrays.toString(suffixSum(myArray)));
    }
}
