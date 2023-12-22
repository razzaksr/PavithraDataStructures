package org.example.dayfour.dpdc;

public class JumpGameVI {

    public static int maxJump(int arr[],int jump){
        int size=arr.length;

        if(size==0)
            return 0;

        int[] dp=new int[size];
        dp[0]=arr[0];

        for(int index=1;index<size;index++){
            int maxSum=arr[index-1];
            for(int hop=index-2;hop>=Math.max(0,index-jump);hop--){
                maxSum=Math.max(dp[hop],maxSum);
            }
            System.out.print(maxSum+","+arr[index]+" ");
            dp[index]=maxSum+arr[index];
        }

        return dp[size-1];

    }

    public static void main(String[] args) {
        System.out.println(maxJump(new int[]{1,-1,-2,4,-7,3},2));
        System.out.println(maxJump(new int[]{10,-5,-2,4,0,3},3));
        System.out.println(maxJump(new int[]{1,-5,-20,4,-1,3,-6,-3},2));
    }
}
