package dsa.searching;

/*
    You are given an m X n integer frid accounts where accounts[i][j] is the amount
    of money the i th consumer has in the j th bank. Return the wealth that the richest customer has.

    A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the
    customer is the customer that has the maximum wealth.

    Example -
            Input: accounts = [[1,2,3],[3,2,1]]
            output: 6

            Explanation:
                    1st customer has wealth = 1+2+3 = 6
                    second customer has wealth = 3+2+1 =6
                    Both customers are considered the richest with a wealth of 6 each, so return 6.

     link: https://leetcode.com/problems/richest-customer-wealth/description/
 */

public class Q_03_LeetCodeQuestion_1672 {
    public static void main(String[] args) {
        // Example Account array.
        int[][] customer = {
                {1,2,3},
                {3,2,1}
        };

        // Printing the maximumWealth of the customer.
        System.out.println(maximumWealth(customer));

    }

    static int maximumWealth(int[][] array){
        int maxTotalWealth =0;
        for(int[] customer:array){
            int tempWelth = 0; // adding all the amounts in the same loop
            for(int wealth:customer){
                tempWelth+=wealth;
            }
            if (tempWelth>maxTotalWealth){ // checking if the wealth of this current person is greater than maxTotal wealth.
                maxTotalWealth=tempWelth; // assigning this temporary addition of wealth to maxTotalWealth.
            }
        }
        return maxTotalWealth;
    }
}
