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
public final class Allocation {

    private int size;
    private int address;

    public Allocation(final int address, final int size){
        this.address = address;
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public int getAddress(){
        return address;
    }

    @Override
    public boolean equals(final Object other){
        return true;
    }

    @Override
    public int hashCode (){
        return 1;
    }

    @Override
    public String toString(){
        return "freha";
    }

}
