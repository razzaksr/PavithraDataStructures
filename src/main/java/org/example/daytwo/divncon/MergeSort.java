package org.example.daytwo.divncon;

import java.util.Arrays;

public class MergeSort {

    public static void merge(String[] arr,int start,int mid,int end){
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,start,end+1)));
        System.out.println(start+" "+mid+" "+end);
        int lengthEast=mid-start+1;
        int lengthWest=end-mid;

        String[] copyOfEast=new String[lengthEast];
        String[] copyOfWest=new String[lengthWest];

        for(int index=0;index<lengthEast;index++){
            copyOfEast[index]=arr[start+index];
        }

        for(int index=0;index<lengthWest;index++){
            copyOfWest[index]=arr[mid+1+index];
        }

        int indexEast=0,indexWest=0, ogIndex=start;

        while(indexEast<lengthEast&&indexWest<lengthWest){
            if(copyOfEast[indexEast].compareTo(copyOfWest[indexWest])>0){
                arr[ogIndex]=copyOfWest[indexWest];
                indexWest++;
            }
            else{
                arr[ogIndex]=copyOfEast[indexEast];
                indexEast++;
            }
            ogIndex++;
        }

        while(indexEast<lengthEast){
            arr[ogIndex]=copyOfEast[indexEast];
            ogIndex++;
            indexEast++;
        }

        while(indexWest<lengthWest){
            arr[ogIndex]=copyOfWest[indexWest];
            ogIndex++;
            indexWest++;
        }

    }

    public static void divide(String[] arr,int start,int end){
        if(start<end){
            System.out.println(Arrays.toString(Arrays.copyOfRange(arr,start,end+1)));
            int midPoint=start+(end-start)/2;
            divide(arr,start,midPoint);
            divide(arr,midPoint+1,end);
            merge(arr,start,midPoint,end);
        }
    }

    public static void main(String[] args) {
        String[] myArray={"Spring Framework","DJango","Node","Flask","Angular","Vue"};
        System.out.println("Original before sort \n"+Arrays.toString(myArray));
        divide(myArray,0, myArray.length-1);
        System.out.println("Original after sort \n"+Arrays.toString(myArray));

    }
}
