package org.example.daytwo.divncon;

public class FindMinMissingByDC {

    public static int missingMinimum(int[] arr,int start, int end){
        if(start>end)
            return start;
        else{
            int midPoint=start+(end-start)/2;
            int midValue=arr[midPoint];
            if(midPoint<midValue)
                end=midPoint-1;
            else
                start=midPoint+1;
            return missingMinimum(arr,start,end);
        }
    }

    public static void main(String[] args) {
//        int[] myArray={0,1,3,4,5,6};
        int[] myArray={0,3,3,4,5,6};
        System.out.println(missingMinimum(myArray,0,myArray.length-1));
    }
}
