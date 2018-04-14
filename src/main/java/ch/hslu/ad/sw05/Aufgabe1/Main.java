package ch.hslu.ad.sw05.Aufgabe1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger LOG = LogManager.getLogger(Main.class);

    private List<BankAccount> source = new ArrayList<>();
    private List<BankAccount> target = new ArrayList<>();
    private int numbers;

    public Main (final int numbers) {

        this.numbers =  numbers;

        for (int i = 0; i < numbers; i++ ) {
            BankAccount a = new BankAccount((int)(Math.random() * 5000), i);
            source.add(a);
            LOG.info(a.toString() + "  erstellt und in source hinzugefügt");
        }

        for (int i = 0; i < numbers; i++ ) {
            BankAccount a = new BankAccount((int)(Math.random() * 5000), i + numbers);
            target.add(a);
            LOG.info(a.toString() + "  erstellt und in target hinzugefügt");
        }
    }

    public void run () {

        final Thread[] threads = new Thread[numbers * 2];

        for (int i = 0; i < numbers; i++ ) {
            threads[i] = new Thread(new Transaction(source.get(i), target.get(i), 2000));
            threads[i+numbers] = new Thread(new Transaction(target.get(i), source.get(i), 5000));
        }

        for (final Thread thread : threads) {
            thread.start();
        }

    }

    public static void main(final String[] args){
        Main main = new Main(10);

        main.run();


    }


}
