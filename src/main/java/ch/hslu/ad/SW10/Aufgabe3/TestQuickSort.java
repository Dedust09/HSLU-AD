package ch.hslu.ad.SW10.Aufgabe3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestQuickSort {

    private static final Logger LOG = LogManager.getLogger(TestQuickSort.class);

    public TestQuickSort () {

    }

    public static void main(final String[] args) {
            int sizeOfArray = 200000;
            int TRESHOLD = 25;
            char[] a = QuickSort.randomChars(sizeOfArray);

            long start = System.currentTimeMillis();
            QuickSort.quickInsertionSort(a, TRESHOLD);
            long finish = System.currentTimeMillis();

            LOG.info("Quicksort mit " + sizeOfArray + " Elementen und Schwellenwert(" + TRESHOLD + ")" + ": "
                    + (finish - start) + " ms");

            long start2 = System.currentTimeMillis();
            QuickSort.quickSort(a);
            long finish2 = System.currentTimeMillis();

            LOG.info("Quicksort mit " + sizeOfArray + " Elementen: " + (finish2 - start2) + " ms");




    }
}
