                                                                                                                                                                                                                                                                                                        package com.company;
import edu.princeton.cs.algs4.*;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        int CMDNumber = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[CMDNumber];
        for (int i = 0;i<CMDNumber;i++){
            StdOut.println("Less "+ (CMDNumber-i) +" intervals need to input: ");
            StdOut.println("Please input left end point:");
            double leftPoint = StdIn.readDouble();
            StdOut.println("Please input right end point:");
            double rightPoint = StdIn.readDouble();
            intervals[i] = new Interval1D(leftPoint,rightPoint);
        }
        for (int i =0; i<CMDNumber-1;i++)
            for (int j = i+1;j<CMDNumber;j++){
               if (intervals[i].intersects(intervals[j]))
                   StdOut.println("Interval"+intervals[i]+"has crossed interval"+intervals[j]);
            }

    }


}