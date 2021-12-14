import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class lab5 {
    public static void main(String args[]) {
        //arrayfill();
        //RunAlgorithm();
        //arrayA();
        RunAlgorithm();
       // stack();
    }
    public static void queues(){
        ArrayBlockingQueue<Data> q = new ArrayBlockingQueue<Data>(10);
        Data ali = new Data("ali",69);
        Data thoy = new Data("thoy",69);
        Data hasib = new Data("hasib",69);
        Data mahima = new Data("mahima",69);
        Data sadiya = new Data("sadiya",69);
        Data yash = new Data("yash",69);
        Data jj = new Data("jj",69);
        Data arham = new Data("arham",69);
        Data iqra = new Data("iqra",69);
        Data james = new Data("james",69);
        q.add(ali);
        q.add(hasib);
        q.add(thoy);
        q.add(mahima);
        q.add(sadiya);
        q.add(yash);
        q.add(jj);
        q.add(arham);
        q.add(iqra);
        q.add(james);


        while(q.isEmpty() == false)
        {
            q.poll().Print();
        }
        System.out.println(q.size());


        for(int i=0;i<10;++i)
        {
            q.add(new Data("Test:"+String.valueOf(i),i));
        }
        PrintCollection(q);

    }
    public static void stack() {
        Stack<Data> stack = new Stack<Data>();
        Data ali = new Data("ali",69);
        Data thoy = new Data("thoy",69);
        Data hasib = new Data("hasib",69);
        stack.push(ali);
        stack.push(thoy);
        stack.push(hasib);

        while(stack.isEmpty() == false)
        {
            stack.pop().Print();
        }
        System.out.println(stack.size());
        PrintCollection(stack);

    }
    public static void arrayA() {
//        ArrayList<Data> arrayA = new ArrayList<Data>();
//        ArrayList<Data> arrayB = new ArrayList<Data>();
//        Data ali = new Data("ali",69);
//        Data thoy = new Data("thoy",69);
//        Data hasib = new Data("hasib",69);
//        arrayA.add(thoy);
//        arrayA.add(hasib);
//        arrayA.add(ali);

//        PrintCollection(arrayA);
//        System.out.println();
//        arrayB = arrayA;
//        PrintCollection(arrayB);
//        System.out.println();
//        arrayA.remove(0);
//        PrintCollection(arrayB);
        ArrayList<Data> arrayC = new ArrayList<Data>();
        ArrayList<Data> arrayD = new ArrayList<Data>();
        Data ali = new Data("ali",69);
        Data thoy = new Data("thoy",69);
        Data hasib = new Data("hasib",69);
        arrayC.add(thoy);
        arrayC.add(hasib);
        arrayC.add(ali);

        PrintCollection(arrayC);
        System.out.println();
        arrayD = (ArrayList<Data>)arrayC.clone();
        arrayC.remove(1);
        PrintCollection(arrayC);
        System.out.println();
        PrintCollection(arrayD);
        System.out.println();


    }

    public static void arrayfill(){

        ArrayList<Data> array = new ArrayList<Data>();
        Data ali = new Data("ali",69);
        Data thoy = new Data("thoy",69);
        Data hasib = new Data("hasib",69);
        Data yash = new Data("yash",69);
        array.add(thoy);
        array.add(hasib);
        array.add(ali);
        array.add(yash);
        PrintCollection(array);
      //  System.out.println();
    }



    public static void PrintCollection(Collection<Data> c)
    {
        for (Iterator<Data> iter = c.iterator(); iter.hasNext();)
        {
            Data x = (Data)iter.next();
            x.Print();

        }
        System.out.println();
    }
    public static void RunAlgorithm()
    {
        long StartTime, EndTime, ElapsedTime;

        System.out.println("Testing algorithm …");

        // Save the time before the algorithm run
        StartTime=System.nanoTime();

        // Run the algorithm
        //arrayfill();
        //stack();
        queues();

        // Save the time after the run
        EndTime=System.nanoTime();

        // Calculate the difference
        ElapsedTime= EndTime- StartTime;

        // Print it out
        System.out.println("The algorithm took " + ElapsedTime + " Nano seconds to run.");
    }


}
