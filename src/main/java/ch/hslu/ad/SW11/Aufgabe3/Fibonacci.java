package ch.hslu.ad.SW11.Aufgabe3;

public class Fibonacci {

    private int n;

    public Fibonacci(final int a) {
        this.n = a;
    }

    public final static int fiboRecursive(final int n) {
        return n > 1 ? fiboRecursive(n - 1) + fiboRecursive(n - 2) : n;
    }
}
