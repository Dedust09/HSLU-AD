package ch.hslu.ad.SW11.Aufgabe2;

import ch.hslu.ad.SW10.Aufgabe3.QuickSort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ForkJoinPool;

public class TestParallelQuickSort {

    private static final Logger LOG = LogManager.getLogger(TestParallelQuickSort.class);


    public static void main(final String[] args) {
        int sizeOfArray = 200_000_000;
        int TRESHOLD = 50_000_000;
        char[] a = ParallelQuickSort.randomChars(sizeOfArray);
        QuickSort.quickInsertionSort(a, TRESHOLD);
        final ForkJoinPool pool = new ForkJoinPool();
        final ParallelQuickSort pQS = new ParallelQuickSort(a);

        long start = System.currentTimeMillis();
        pool.invoke(pQS);
        long finish = System.currentTimeMillis();
        LOG.info("Parallel Quicksort mit " + sizeOfArray + " Elementen: " + (finish - start) + " ms");

        long start2 = System.currentTimeMillis();
        QuickSort.quickSort(a);
        long finish2 = System.currentTimeMillis();
        LOG.info("Quicksort          mit " + sizeOfArray + " Elementen: " + (finish2 - start2) + " ms");

        long start3 = System.currentTimeMillis();
        long finish3 = System.currentTimeMillis();
        LOG.info("QuickInsertionSort mit " + sizeOfArray + " Elementen: " + (finish3 - start3) + " ms");




    }
}
