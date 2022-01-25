import java.util.ArrayList;

public class lab9 {
    public static void main(String args[]) {
        ArrayList<Double> weights = new ArrayList<Double>();
      //  weights.add(1.0);
       // weights.add(2.0);
       // weights.add(3.0);
      //  weights.add(4.0);
       // weights.add(10.0);

       // RMHC(weights,5,10);*/

        weights = CS2004.ReadNumberFile("Primes.txt");

        for (int i = 0; i < 10; i++) {
            long startTime = System.nanoTime();
            RMHC(weights, 1000, 1000);
            long endTime = System.nanoTime();
            long elapsedTime = (endTime - startTime);
            System.out.println("Elapsed Time: " + elapsedTime);
        }
    }
    public static ScalesSolution RMHC(ArrayList<Double> weights, int n, int iter) {
        ScalesSolution sol = new ScalesSolution(n);
        ScalesSolution oldSol = new ScalesSolution(sol.GetSol());
        for (int i = 0; i < iter; i++) {
            System.out.println("Iteration number: " + i);
            System.out.println("Old Solution : ");
            oldSol.println();
            double f = oldSol.ScalesFitness(weights);
            System.out.println("Old Fitness: ");
            System.out.println(f);
            // the new solution after copying the string from scalesolution
            sol.SmallChange();
            System.out.println("New Solution : ");
            sol.println();
            double f1 = sol.ScalesFitness(weights);
            System.out.println("New Fitness: ");
            System.out.println(f1);
            if (oldSol.ScalesFitness(weights) > sol.ScalesFitness(weights)) {
                oldSol = new ScalesSolution(sol.GetSol());
            }
        }
        return (oldSol);
    }


//    public static void test1() {
//        ArrayList<Double> weights = new ArrayList<Double>();
//        {
//            double a = 1.0, b = 2.0, c = 3.0, d = 4.0, e = 10.0;
//            weights.add(a);
//            weights.add(b);
//            weights.add(c);
//            weights.add(d);
//            weights.add(e);
//            System.out.print(weights);
//
//            Double test = ScalesSolution.ScalesFitness(weights);
//            System.out.print(test);
//        }



    }








