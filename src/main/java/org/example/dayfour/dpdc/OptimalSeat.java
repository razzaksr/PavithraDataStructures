package org.example.dayfour.dpdc;

/*
Mike has arranged a small party for the inauguration of his new startup.
He has invited all of his fellow employees who are N in number.
These employees are indexed with an array starting from 1 to N.
In this startup, everyone knows each other’s salary.
We will represent salary by an integer value.
Mike has to arrange tables, where he will accommodate everyone.
But he is a little thrifty in that, he wants to adjust everyone in as few tables as he can.
Tables of various seating are available. Let’s say the cost of renting each table is K.
All the employees have to seat in the order of the index.
The only problem is that the employees with the same salary can get into arguments which can ruin the party.
Mike came across the term inefficiency of arrangement,
which can be defined as the sum of the cost of tables + the total number of people getting into arguments.
Given the number of employees, N, and their salaries in array a[ ], he wants to find the optimal inefficiency,
i.e., the smallest possible value for the inefficiency of arranging the N employees.
 */

import java.util.Arrays;

public class OptimalSeat {

    public static int lessInefficiency(int[] arr,int employees,int cost){
        Arrays.sort(arr);// 3,5,7,9,12
        int[] dp=new int[employees+1];// [0,0,0,0,0]
        dp[0]=0;
        // i=3
        // dp[] = {0,4,4,0,0,0,0,0,0}
        for(int i=1;i<=employees;i++){
            int sum=0;
            int noOfArguments=0;
            dp[i]=Integer.MAX_VALUE;// 100000000000
            for(int j=1;j<=i;j++){
                sum+=arr[j-1];// arr[0]->>800+800>> 1600+1200>> 2800
                System.out.println(sum);
                int difference=sum-j*arr[j-1];// 2800 - 3 * 1200>> -800
                noOfArguments+=Math.max(0,difference);// max(0,-800)>> 0
                dp[i]=Math.min(dp[i],dp[j-1]+cost+noOfArguments);// 4, 4+4+0
                System.out.println(dp[i]+" no of arguments "+noOfArguments+" difference "+difference);
            }
            System.out.println();
        }
        return dp[employees];
    }

    public static void main(String[] args) {
//        int[] myEmployees={12,5,9,3,7};
//        int[] myEmployees={5, 4, 3, 2, 1};
        int[] myEmployees={800, 800, 1200, 1200, 1500, 1500, 2000, 2000};
        System.out.println(lessInefficiency(myEmployees, myEmployees.length,4));
    }
}
