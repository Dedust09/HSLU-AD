package ch.hslu.ad.SW10.Aufgabe2;

import ch.hslu.ad.sw03.BinaryTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;

public class TestQuickSort {

    private static final Logger LOG = LogManager.getLogger(TestQuickSort.class);

    public TestQuickSort () {

    }

    public static void main(final String[] args) {

        final int smallSizeOfArray = 1500;
        final int mediumSizeOfArray = 15000;
        final int bigSizeOfArray = 150000;

        final long startTimeSmallSort = System.currentTimeMillis();
        QuickSort.quickSort(QuickSort.randomChars(smallSizeOfArray));
        final long endTimeSmallSort = System.currentTimeMillis();

        LOG.info("Quicksort mit " + smallSizeOfArray + " Elementen: " + (endTimeSmallSort - startTimeSmallSort) + " ms");


        final long startTimeMediumSort = System.currentTimeMillis();
        QuickSort.quickSort(QuickSort.randomChars(mediumSizeOfArray));
        final long endTimeMediumSort = System.currentTimeMillis();

        LOG.info("Quicksort mit " + mediumSizeOfArray + " Elementen: " + (endTimeMediumSort - startTimeMediumSort) + " ms");


        final long startTimeBigSort = System.currentTimeMillis();
        QuickSort.quickSort(QuickSort.randomChars(bigSizeOfArray));
        final long endTimeBigSort = System.currentTimeMillis();

        LOG.info("Quicksort mit " + bigSizeOfArray + " Elementen: " + (endTimeBigSort - startTimeBigSort) + " ms");




    }
}
