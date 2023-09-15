import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class average {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0.0;

        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            sum += value;
            count++;
        }
        //TO STOP INPUT (EOF INPUT)
        //ENTER CTRL+Z ON ITS OWN LINE
        //HAS TO BE UPPERCASE Z
        //HIT ENTER
        double avg = sum / count;
        StdOut.println("average is " + avg);
    }
}
