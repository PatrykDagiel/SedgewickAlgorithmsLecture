package SedgewickLecture.Lecture_2;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.Stopwatch;

/**
 * Created by dagiel on 21/02/2017.
 */
public class ThreeSum {
    public static int count(int[] a) {
        int N = a.length;
        int count = 0;
        for(int i = 0; i < N; i++)
            for(int j = i+1; j < N; j++)
                for(int k = j+1; k < N; k++)
                    count++;
        return count;
    }

    public static void main(String[] args) {
        int[] a = In.readInts(args[0]);
        Stopwatch stopwatch = new Stopwatch();
        StdOut.println(count(a));
        double time = stopwatch.elapsedTime();
        System.out.println("Time : " + time);
    }
}
