/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw1;

/**
 * This class represents an Memory
 * @author Luke
 * @version 1.0
 */
public final class MemorySimple implements Memory {

    private int size;
    private int allocated;

    public MemorySimple(final int size) {
    }

    @java.lang.Override
    public Allocation malloc(int size) {
        return null;
    }

    @java.lang.Override
    public void free(Allocation allocation) {

    }

    @java.lang.Override
    public int getAllocated() {
        return allocated;
    }

    @java.lang.Override
    public int getFree() {
        return 0;
    }

    @Override
    public String toString(){
        return "freha";
    }
}
