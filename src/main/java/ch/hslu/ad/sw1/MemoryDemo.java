/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw1;

/**
 *
 * @author Luke
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class MemoryDemo {

    private static final Logger LOG = LogManager.getLogger(MemoryDemo.class);

    public static void main(final String[] args) {
        final Memory memory = new MemorySimple(1024);
        LOG.info(memory);
        final Allocation block1 = memory.malloc(16);
        LOG.info(block1);
        LOG.info(memory);
        final Allocation block2 = memory.malloc(8);
        LOG.info(block2);
        LOG.info(memory);
        memory.free(block1);

    }
}
