package ch.hslu.ad.SW10.Aufgabe3;

import java.util.Random;

public class QuickSort {

    public QuickSort() {

    }

    /**
     *  Methode zum Austauschen von Elementen im Array
     * @param a Array
     * @param firstIndex Erstes Element
     * @param secondIndex Zweites Element
     */
    private static final void exchange(final char[] a, final int firstIndex, final int secondIndex) {
        char tmp;
        tmp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = tmp;
    }

    /**
     * Array Sortieren mit Quicksort
     * @param a Array
     * @param left Linke grenze im Array
     * @param right Rechte grenze im Array
     */
    public static final void quickSort(final char[] a, final int left, final int right) {
        int up = left; // linke Grenze
        int down = right - 1; // rechte Grenze (ohne Trennelement)
        char t = a[right]; // rechtes Element als Trennelement
        boolean allChecked = false;
        do {
            while (a[up] < t) {
                up++; // suche grösseres (>=) Element von links an
            }
            while ((a[down] >= t) && (down > up)) {
                down--; // suche echt kleineres(<) Element von rechts an
            }
            if (down > up) { // solange keine Überschneidung
                exchange(a, up, down);
                up++; down--; // linke und rechte Grenze verschieben
            } else {
                allChecked = true; // Austauschen beendet
            }
        } while (!allChecked);
        exchange(a, up, right); // Trennelement an endgültige Position (a[up])
        if (left < (up - 1)) quickSort(a, left, (up - 1)); // linke Hälfte
        if ((up + 1) < right) quickSort(a, (up + 1), right); // rechte Hälfte, ohne T’Elt.
    }

    /**
     * Array Sortieren mit Quicksort
     * @param a Array
     */
    public static final void quickSort (final char[] a) {
        QuickSort.quickSort(a,0, a.length - 1);
    }

    /**
     * Ein Array erzeugen mit zufälligen Chars
     * @param length Länge des Arrays
     * @return Gibt das Array zurück
     */
    public static final char[] randomChars(final int length) {
        final char[] a = new char[length];
        for (int i = 0; i < length; i++) {
            Random r = new Random();
            a[i] = (char) (r.nextInt(26) + 'a');
        }
        return a;
    }

    /**
     * Array sortieren mit insertion sort
     * @param a Array
     */
    public static void insertionSort(final char[] a) {
        for (int i = 0; i < a.length; i++) {
            int current = i;
            if (current != a.length - 1) {
                while (a[current] > a[current + 1]) {
                    QuickSort.exchange(a, current, current + 1);
                    if (current != 0) {
                        current--;
                    }
                }
            }
        }
    }

    /**
     * Array sortieren mit quick insertion sort
     * @param a Array
     * @param TRESHOLD Grenzwert für die Sortierung mit insertion sort
     */
    public static final void quickInsertionSort(final char[] a, final int TRESHOLD) {
        final int left = 0;
        final int right = a.length - 1;
        int up = left; // linke Grenze
        int down = right - 1; // rechte Grenze (ohne Trennelement)
        char t = a[right]; // rechtes Element als Trennelement
        boolean allChecked = false;
        do {
            while (a[up] < t) {
                up++; // suche grösseres (>=) Element von links an
            }
            while ((a[down] >= t) && (down > up)) {
                down--; // suche echt kleineres(<) Element von rechts an
            }
            if (down > up) { // solange keine Überschneidung
                exchange(a, up, down);
                up++;
                down--; // linke und rechte Grenze verschieben
            } else {
                allChecked = true; // Austauschen beendet
            }
        } while (!allChecked);
        exchange(a, up, right); // Trennelement an endgültige Position (a[up])
        if ((left - (up - 1)) == TRESHOLD) {
            QuickSort.insertionSort(a);
        } else {
            quickSort(a, left, (up - 1)); // linke Hälfte
        }
        if (((up + 1) - right) == TRESHOLD) {
            QuickSort.insertionSort(a);
        } else {
            if ((up + 1) < right)
                quickSort(a, (up + 1), right); // rechte Hälfte, ohne T’Elt.}
        }
    }


}
