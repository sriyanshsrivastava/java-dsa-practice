package dsa.searching;

import java.sql.Statement;

public class C_02_SearchInStrings {
    public static void main(String[] args) {

        // creating variable
        String name = "Sriyansh";
        // calling both the functions

        System.out.println(search(name,'c'));
        System.out.println(searchChar(name,'s'));

    }
    // search function with traditional for loop.
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }

        for (int i=0; i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    // search function with enhanced for loop.
    static boolean searchChar(String str,char target){
        if(str.length()==0){
            return false;
        }

        for(char ch:str.toCharArray()){
            if(target==ch){
                return true;
            }
        }
        return false;
    }
}
