package com.company;
import edu.princeton.cs.algs4.*;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        int CMDNumber = Integer.parseInt(args[0]);
        double minInterval = Double.parseDouble(args[1]);
        double maxInterval = Double.parseDouble(args[2]);
        Interval2D[] intervals = new Interval2D[CMDNumber];
        Interval1D[] intervalX = new Interval1D[CMDNumber];
        Interval1D[] intervalY = new Interval1D[CMDNumber];
        for (int i = 0;i<CMDNumber;i++){
            double leftPoint = StdRandom.uniform(0,1-minInterval);
            double rightPoint = StdRandom.uniform(leftPoint+minInterval,(leftPoint+maxInterval)>1?1:(leftPoint+maxInterval));
            double downPoint = StdRandom.uniform(0,1-minInterval);
            double UpPoint = StdRandom.uniform(downPoint+minInterval,(downPoint+maxInterval)>1?1:(downPoint+maxInterval));
            Interval1D randomX = new Interval1D(leftPoint,rightPoint);
            Interval1D randomY = new Interval1D(downPoint,UpPoint);
            intervals[i] = new Interval2D(randomX,randomY);
            intervals[i].draw();

            intervalX[i] = randomX;
            intervalY[i] = randomY;
        }
        for (int i =0; i<CMDNumber-1;i++) // print crossed interval2d
            for (int j = i+1;j<CMDNumber;j++){
               if (intervals[i].intersects(intervals[j]))
                   StdOut.println("Interval"+intervals[i]+" crosses interval"+intervals[j]);
            }

        for (int i =0; i<CMDNumber-1;i++) // print contained interval2d
            for (int j = i+1;j<CMDNumber;j++){
                if (intervalX[i].contains(intervalX[j].min())&&intervalX[i].contains(intervalX[j].max()))
                    if (intervalY[i].contains(intervalY[j].min())&&intervalY[i].contains(intervalY[j].max()))
                        StdOut.println("Interval"+intervals[i]+" contains interval"+intervals[j]);
            }

    }


}