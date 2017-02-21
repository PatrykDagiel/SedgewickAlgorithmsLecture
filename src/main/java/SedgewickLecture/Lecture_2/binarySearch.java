package SedgewickLecture.Lecture_2;

/**
 * Created by dagiel on 21/02/2017.
 */
public class binarySearch {
    public static int binarySearch(int[] a, int key) {
        int l0 = 0, hi = a.length;
        while (l0 <= hi) {
            int mid = l0 + (hi - l0) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) l0 = mid + 1;
            else return mid;
        }
        return -1;
    }
}
