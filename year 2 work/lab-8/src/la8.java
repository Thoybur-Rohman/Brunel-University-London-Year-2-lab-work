import java.util.ArrayList;

public class la8 {
    public static void main(String args[]) {
        for (int i = 0; i < 10; ++i) {
            int x = CS2004.UI(0, 1);
        }
        ScalesSolution s = new ScalesSolution("10101");
        s.println();
        test1();
    }

    public static void test1() {
        ArrayList<Double> weights = new ArrayList<Double>();
        {
            double a = 1.0, b = 2.0, c = 3.0, d = 4.0, e = 10.0;
            weights.add(a);
            weights.add(b);
            weights.add(c);
            weights.add(d);
            weights.add(e);
            System.out.print(weights);

            Double test = ScalesSolution.ScalesFitness(weights);
            System.out.print(test);
        }



    }
    }







