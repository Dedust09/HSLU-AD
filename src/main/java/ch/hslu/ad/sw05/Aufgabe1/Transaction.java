package ch.hslu.ad.sw05.Aufgabe1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Transaction implements Runnable {

    private final static Logger LOG = LogManager.getLogger(Transaction.class);

    private int amount;
    private BankAccount from;
    private BankAccount to;


    public Transaction (final BankAccount from, final BankAccount to, final int amount) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }


    @Override
    public void run(){
        LOG.info("Vorher:    " + this.toString());
        for (int i = 0; i < this.amount; i++) {
            this.from.transfer(to,1);
        }
        LOG.info("Nachher:   " + this.toString());
    }

    @Override
    public String toString () {
        return ("Von: " + this.from.toString() + " Nach: " + this.to.toString() + " Menge: " + this.amount);
    }

}
