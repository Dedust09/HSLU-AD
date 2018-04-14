package ch.hslu.ad.sw05.Aufgabe2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdditionTask implements Runnable {

    private static Logger LOG = LogManager.getLogger(AdditionTask.class);

    private int rangeBegin;
    private int rangeEnd;
    private long sum;
    private String n = "ke plan";
    private volatile Thread runThread;
    private volatile boolean isStopped = false;

    public AdditionTask (final int rb, final int re) {

        this.rangeBegin = rb;
        this.rangeEnd = re;

    }

    public void stopRequest(){
        isStopped = true;
        if (runThread != null) {
            runThread.interrupt();
        }
    }

    public boolean isStopped(){
        return isStopped;
    }

    @Override
    public void run() {
        this.runThread = Thread.currentThread();
        // Initialisierungsphase
            while (!isStopped() && !Thread.currentThread().isInterrupted()) {

                    long sum = 0;
                    // Arbeitsphase
                    for (int i = this.rangeBegin; i <= this.rangeEnd; i++) {
                        sum += i;
                    }
                    this.sum = sum;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                LOG.info(ex.toString());
                runThread.interrupt();
            }
        // Aufräumphase
        if (!isStopped()) {
            LOG.info(runThread.getName() + ": SUM" + n + " -> " + sum);
        }
        else {
            LOG.info(runThread.getName() + ": interrupted.");
        }
    }
}
