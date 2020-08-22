package com.company;
import edu.princeton.cs.algs4.*;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        String s = "ACTGACG";
        String t = "TGACGAC";
        boolean result = false;
        result = IsCirRotation(s,t);
        StdOut.println(result);

    }

    public static boolean IsCirRotation(String str1,String str2){
        // version of one line code
      //  return ((str1.length() == str2.length()) && ((str2 + str2).indexOf(str1)>=0));

        if (str1.length()!=str2.length())
            return false;
        for (int i=1;i<str1.length();i++){
            String temp = str1.substring(i,str1.length())+str1.substring(0,i);
            if (temp.equals(str2))
                return true;
        }
        return false;
    }


}
