package org.example.dayone.arrays;

import java.util.Arrays;

public class GoldWiresByGreedy {

    public static int assembleWires(int[] arr){
        int totalCost=0,currentCost=0;
        Arrays.sort(arr);
        int size=arr.length;

        while(size>1){
            currentCost=arr[0]+arr[1];
            totalCost+=currentCost;
            System.out.println(Arrays.toString(arr)+" "+totalCost);
            arr[1]=currentCost;

            for(int index=2;index<size;index++){
                arr[index-1]=arr[index];
            }
//            System.out.println(Arrays.toString(arr)+" "+totalCost);

            size--;
        }


        return totalCost;
    }

    public static void main(String[] args) {
//        int[] myWires={1, 6, 7, 8, 6, 1};
        int[] myWires={5,8,17,11,2,3};
        System.out.println(assembleWires(myWires));
    }
}
