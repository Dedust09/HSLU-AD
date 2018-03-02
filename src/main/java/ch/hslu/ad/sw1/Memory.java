package ch.hslu.ad.sw1;

/**
 * This interface represents a Memory
 * @author Luke
 * @version 1.0
 */
public interface Memory {

    /**
     * This function will allocate a size to an address
     * @param size give a size to allocate
     * @return Will Return an allocation
     */
    Allocation malloc(final int size);

    /**
     * This function will free an allocated Address
     * @param allocation give the address to free
     */
    void free (final Allocation allocation);

    /**
     * Get the numbers of allocations
     * @return
     */
    int getAllocated();

    /**
     * Get the free Allocations
     * @return
     */
    int getFree();
}
