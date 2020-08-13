package com.company;
import edu.princeton.cs.algs4.*;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args){
        int inputNumber = Integer.parseInt(args[0]);
        double shortestDis = 100;
        Point2D[] points = new Point2D[inputNumber];
        for (int i = 0; i<inputNumber;i++){
            points[i] = new Point2D(StdRandom.uniform(0f,1f),StdRandom.uniform(0f,1f));
            //StdDraw.point(points[i].x(),points[i].y());
        }
        for (int i = 0;i<inputNumber;i++)
            for (int j = i+1; j<inputNumber-1;j++)
                if (points[i].distanceTo(points[j])<shortestDis)
                    shortestDis = points[i].distanceTo(points[j]);
                StdOut.println(shortestDis);
    }


}