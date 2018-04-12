package ch.hslu.ad.sw04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HashSet implements Set<Integer> {

    private static final Logger LOG = LogManager.getLogger(HashSet.class);
    private Integer[] hashSet;

    public HashSet (int size) {
        this.hashSet = new Integer[size];

    }


    @Override
    public void add(Integer value) {
        if (this.contains(value)) {
            LOG.error("Value already exist");
        }

        hashSet[getIndex(value)] = value;

    }

    @Override
    public void remove(Integer value) {
        if (!this.contains(value)) {
            LOG.error("value does not exist");
        }

        hashSet[getIndex(value)] = null;

    }

    @Override
    public boolean contains(Integer value) {
        return hashSet[getIndex(value)] != null;
    }

    private int getIndex (Integer value) {
        return value.hashCode() % hashSet.length;
    }
}
