package org.example.dayone.arrays;

public class ChocolateFactory {

    public static void foundPackets(int[] arr){
        int[] reOrdered=new int[arr.length];
        int newIndex=0;

        for(int index=0;index<arr.length;index++){
            if(arr[index]!=0){
                reOrdered[newIndex]=arr[index];
                newIndex++;
            }
        }

        for(;newIndex<arr.length;newIndex++){
            reOrdered[newIndex]=0;
        }

        for (int each:reOrdered) {
            System.out.print(each+" ");
        }
    }

    public static void main(String[] args) {
        int[] myPackets={10,4,0,3,0,6,20,0,4,0,0,19,3,1};
        foundPackets(myPackets);
    }
}
