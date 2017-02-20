package SedgewickLecture.Lecture_I;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * Created by dagiel on 20/02/2017.
 */
public class UF {
    UF(int N) {};
    void union(int p, int q) {};
    boolean connected(int p, int q) {return true;};

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p,q)) {
                uf.union(p,q);
                StdOut.println("Connected" + p + " " + q);
            }
        }
    }

}
