package com.company;
import edu.princeton.cs.algs4.*;

public class Main {

    public static void main(String[] args){
        String testStr = "{[()()]}";
        StdOut.println(Parenthesis(testStr));
    }
    // '(' = 40  , ')' = 41 , '[' = 91 , ']' = 93 , '{' = 123 ,'}' = 125
    public static boolean Parenthesis(String str) {
        Stack<Character> temp = new Stack<Character>();
        Character tempChar = null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
                temp.push(str.charAt(i));
            else if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}'){
                tempChar = temp.pop();
                if (tempChar+str.charAt(i) != 81 && tempChar+str.charAt(i) != 184 && tempChar+str.charAt(i) != 248)
                    return false;
            }
        }
        if (temp.isEmpty())
            return true;
        else {
            return false;
        }
    }

}


