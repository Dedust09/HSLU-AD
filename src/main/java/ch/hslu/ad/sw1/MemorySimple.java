/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw1;

import java.util.LinkedList;
import java.util.List;

/**
 * This class represents an Memory
 * @author Luke
 * @version 1.0
 */
public final class MemorySimple implements Memory {

    private int size;
    private int allocated;
    private List<Allocation> allocations = new LinkedList<>();

    public MemorySimple(final int size) {
        this.size = size;
    }

    @Override
    public Allocation malloc(int size) {
        Allocation allocation = new Allocation(allocations.stream().mapToInt(i -> i.getSize()).sum(), size);
        allocations.add(allocation);
        this.allocated = allocations.indexOf(allocation);
        return allocation;
    }

    @Override
    public void free(Allocation allocation) {
        allocations.remove(allocation);
    }

    @Override
    public int getAllocated() {
        return allocated;
    }

    @Override
    public int getFree() {
        return  1;
    }

    @Override
    public String toString(){
        int sum = allocations.stream().mapToInt(i -> i.getSize()).sum();
        return "MemorySimple[Belegt: " + sum + "; Frei: " + (this.size - sum) + "]";
    }
}
