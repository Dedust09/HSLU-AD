package ch.hslu.ad.SW11.Aufgabe2;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.RecursiveAction;

public class ParallelQuickSort extends RecursiveAction{

    private static final int THRESHOLD = 5;
    private final char[] array;
    private final int min;
    private final int max;


    public ParallelQuickSort(final char[] a, final int min, final int max){
        this.array = a;
        this.min = min;
        this.max = max;
    }

    public ParallelQuickSort(final char[] a){
        this.array = a;
        this.min = 0;
        this.max = a.length - 1;
    }

    private void merge(final int min, final int mid, final int max){
        char[] buf = Arrays.copyOfRange(array, min, mid);
        int i = 0;
        int j = min;
        int k = mid;
        while (i < buf.length){
            if (k == max || buf[i] < this.array[k]) {
                this.array[j] = buf[i]; i++;
            } else {
                this.array[j] = this.array[k]; k++;
            }
            j++;
        }
    }

    @Override
    protected void compute() {
        if (max - min < THRESHOLD) {
            quickSort(array, min, max);
        } else {
            final int mid = min + (max - min) / 2;
            invokeAll(new ParallelQuickSort(array, min, mid), new ParallelQuickSort(array, mid, max));
            merge(min, mid, max);
        }
    }

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

    private static final void exchange(final char[] a, final int firstIndex, final int secondIndex) {
        char tmp;
        tmp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = tmp;
    }

    public static final char[] randomChars(final int length) {
        final char[] a = new char[length];
        for (int i = 0; i < length; i++) {
            Random r = new Random();
            a[i] = (char) (r.nextInt(52) + 'A');
        }
        return a;
    }


}
