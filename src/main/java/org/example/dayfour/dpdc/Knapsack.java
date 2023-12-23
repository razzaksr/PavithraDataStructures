package org.example.dayfour.dpdc;

/*
fruits in the knapsack you’d include getting maximum profit. Here’s the weight and profit of each fruit:

Items: { Apple, Orange, Banana, Melon }
Weight: { 2, 3, 1, 4 }
Profit: { 4, 5, 3, 7 }
Knapsack capacity: 5

Let’s try to put different combinations of fruits in the knapsack,
such that their total weight is not more than 5.

Apple + Orange (total weight 5) => 9 profit
Apple + Banana (total weight 3) => 7 profit
Orange + Banana (total weight 4) => 8 profit
Banana + Melon (total weight 5) => 10 profit

This shows that Banana + Melon is the best combination,
as it gives us the maximum profit and the total weight does not exceed the capacity
 */

import java.util.ArrayList;
import java.util.List;

public class Knapsack {

    public static int findBenefit(String[] fruits, int[] weights, int[] profits, int capacity){
        int lengthWeights= weights.length;
        int[][] dp=new int[lengthWeights+1][capacity+1];
        // dp={
        //   0 1 2 3 4 5
        //0 {0,0,0,0,0,0},
        //1 {0,0,4,},
        //2 {0,0,0,0,0,0},
        //3 {0,0,0,0,0,0},
        //4 {0,0,0,0,0,0}
        // }

        for(int i=1;i<=lengthWeights;i++){
            for(int wt=1;wt<=capacity;wt++){
                // when wt=2, i is 1 so 2
                if(weights[i-1]<=wt){
                    // dp[1][2] = max(dp[0][2]>>0,4)
                    dp[i][wt]=Math.max(dp[i-1][wt],profits[i-1]+dp[i-1][wt-weights[i-1]]);
                }
                else{
                    dp[i][wt]=dp[i-1][wt];
                }
            }
        }

        // backtracking
        List<String> selectedFruits=new ArrayList<>();
        int w=capacity;
        int i=lengthWeights;
        while(w>0&&i>0){
            if(dp[i][w]!=dp[i-1][w]){
                selectedFruits.add(fruits[i-1]);
                w-=weights[i-1];
            }
            i--;
        }

        System.out.println("Selected fruits are "+selectedFruits);

        return dp[lengthWeights][capacity];
    }

    public static void main(String[] args) {
        String[] items={ "Apple", "Orange", "Banana", "Melon" };
        int[] wts={ 2, 3, 1, 4 };
        int[] prof={ 4, 5, 3, 7 };
        System.out.println(findBenefit(items,wts,prof,5));
    }
}
