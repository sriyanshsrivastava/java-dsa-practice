package dsa.searching;

/*
    Given a characters array letters that is sorted in non-decreasing order and
    a character target, return the smallest character in the array that is larger than
    target.

    Note: that the letters wrap around.
        -- for example, if target == 'z' and letter -- ['a', 'b'], the answer is 'a'

    Example:
        input: letters = ["c","f","j"], target = "a"
        output: "c"

    Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/

 */

public class Q_05_LeetCodeQuestion_744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'z';

        System.out.println(nestGreatestLetter(letters,target));

    }

    static char nestGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < letters[mid]){
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
