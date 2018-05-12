package ch.hslu.ad.SW11.Aufgabe3;

public class Fibonacci {

    private int n;

    public Fibonacci(final int a) {
        this.n = a;
    }

    /**
     * Rekursive Berechnung der n-ten Fibonacci-Zahl
     *
     * @param n Gewünschte Zahl der Fiboncci-Folge - 1
     * @return Zahl der Fiboncci-Folge
     */
    public static int fiboRec1(final int n) {
        if (n == 0) { // Rekursionsbasis
            return 0;
        } else if (n == 1) {
            return 1; // Rekursionsbasis
        } else {
            return (fiboRec1(n - 2) + fiboRec1(n - 1)); // Rekursionsvorschrift
        }
    }

    /**
     * Iterative Berechnung der n-ten Fibonacci-Zahl
     *
     * @param n Gewünschte Zahl der Fibonacci-Folge
     * @return Zahl der Fibonacci-Folge
     */
    public static int fiboIter(final int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public final static int fiboRecursive(final int n) {
        return n > 1 ? fiboRecursive(n - 1) + fiboRecursive(n - 2) : n;
    }
}
