package ch.hslu.ad.sw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    private static final Logger LOG = LogManager.getLogger(MemoryDemo.class);
    private static int counterAll = 0;
    private static int countert1 = 0;
    private static int countert2 = 0;
    private static int countert3 = 0;



    public static void task1(){
        counterAll++;
        countert1++;
    }

    public static void task2(){
        counterAll++;
        countert2++;
    }

    public static void task3(){
        counterAll++;
        countert3++;
    }

    public static void task(final int n) {
        task1(); task1(); task1(); task1();
        for (int i = 0; i < n; i++) {
            task2(); task2(); task2();
            for (int j = 0; j < n; j++) {
                task3(); task3();
            }
        }
    }

    public static void main(final String[] args) {
        Log.task(20);
        LOG.info("Counter All: " + counterAll);
        LOG.info("Counter T1: " + countert1);
        LOG.info("Counter T2: " + countert2);
        LOG.info("Counter T3: " + countert3);
    }


}
