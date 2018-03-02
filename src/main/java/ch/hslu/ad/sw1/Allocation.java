/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ad.sw1;

import java.util.Objects;

/**
 *
 * @author Luke
 */
public final class Allocation implements Comparable<Allocation>{

    private int size;
    private int address;

    public Allocation(final int address, final int size) {
        this.address = address;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int getAddress() {
        return address;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Allocation)) {
            return false;
        }
        final Allocation other = (Allocation) obj;
        return (other.getAddress() == this.getAddress()) && (other.getSize() == this.getSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.address, this.size);
    }

    @Override
    public String toString() {
        return ("Allocation[Address:" + this.getAddress() + "; Size:" + this.getSize() + "]");
    }

    @Override
    public int compareTo(Allocation o) {
        return Integer.compare(this.getAddress(), o.getAddress());
    }
}
