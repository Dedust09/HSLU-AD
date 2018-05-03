package ch.hslu.ad.SW10.Aufgabe2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestQuickSort {

    private static final Logger LOG = LogManager.getLogger(TestQuickSort.class);

    public TestQuickSort () {

    }

    public static void main(final String[] args) {

        char[] a = {'l','k','a','s','j','d','u','i','v','h','v','w','e','f','h'};

        QuickSort.quickSort(a,0,14);

    }
}
