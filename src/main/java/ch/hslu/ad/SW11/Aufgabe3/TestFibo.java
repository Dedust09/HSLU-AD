package ch.hslu.ad.SW11.Aufgabe3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ForkJoinPool;

public class TestFibo {

    private static final Logger LOG = LogManager.getLogger(TestFibo.class);

    public TestFibo() {}

    public static void main(final String[] args) {
        int a = 40;
        ForkJoinPool pool = new ForkJoinPool();
        ParallelFibonacci task = new ParallelFibonacci(a);

        // Parallele Fibonacci Berechnung mit Fork-Join
        LOG.info("Parallele Fibonacci-Berechnung Fork-Join beginnt...");
        long start1 = System.currentTimeMillis();
        int resultParallelForkJoin = pool.invoke(task);
        long finish1 = System.currentTimeMillis();
        LOG.info("Parallele Fibonacci-Berechnung Fork-Join: " + (finish1 - start1) + "ms, Zahl: "
                + resultParallelForkJoin);

        // Rekursive Berechnung
        LOG.info("Rekursive Fibonacci-Berechnung beginnt...");
        long start2 = System.currentTimeMillis();
        int resultRecursive = Fibonacci.fiboRecursive(a);
        long finish2 = System.currentTimeMillis();
        LOG.info("Rekursive Fibonacci-Berechnung: " + (finish2 - start2) + "ms, Zahl: " + resultRecursive);

        // Iterative Berechnung
        LOG.info("Iterative Fibonacci-Berechnung beginnt...");
        long start3 = System.currentTimeMillis();
        int resultIterative = Fibonacci.fiboIter(a);
        long finish3 = System.currentTimeMillis();
        LOG.info("Iterative Fibonacci-Berechnung: " + (finish3 - start3) + "ms, Zahl: " + resultIterative);
    }
}
