package org.example.dayone.arrays;

public class InversionCountOfArray {
    public static int findCount(double[] arr){
        int inversions=0;

        for(int hold=0;hold<arr.length-1;hold++){
            for(int next=hold+1;next<arr.length;next++){
                if(arr[hold]>arr[next]){
                    System.out.print("("+arr[hold]+","+arr[next]+")  ");
                    inversions++;
                }
            }
        }
        System.out.println();

        return inversions;
    }
    public static void main(String[] args) {
        double[] hello={9.8,12.5,1.9,12.6,4.5,8.2,4.7,9.1};
        System.out.println(findCount(hello));
    }
}
