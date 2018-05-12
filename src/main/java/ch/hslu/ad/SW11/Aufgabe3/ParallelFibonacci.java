package ch.hslu.ad.SW11.Aufgabe3;

import java.util.concurrent.RecursiveTask;

public class ParallelFibonacci extends RecursiveTask<Integer> {

    private int n;

    public ParallelFibonacci(final int a){
        this.n = a;
    }

    /**
     * Paralleles berechnen der Fibonacci Zahl
     * @return Fibonacci Zahl
     */
    @Override
    protected Integer compute() {
        final int result;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n < 20){
            return Fibonacci.fiboIter(n);
        } else {
            ParallelFibonacci task1 = new ParallelFibonacci(n - 2);
            task1.fork();
            ParallelFibonacci task2 = new ParallelFibonacci(n - 1);
            result = task2.invoke() + task1.join();
        }
        return result;
    }
}
