import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class randomseq {
    public static void main(String[] args) {
        if (args.length < 3) {
            throw new IllegalArgumentException("Invalid number of arguments");
        }

        int count = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);

        for (int i = 0; i < count; i++) {
            double x = StdRandom.uniform(min, max);
            StdOut.printf("%.2f\n", x);
        }


    }
}
