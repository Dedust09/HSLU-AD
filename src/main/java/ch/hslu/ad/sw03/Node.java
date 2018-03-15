package ch.hslu.ad.sw03;

public class Node implements Comparable<Node> {

    private final int value;
    private int degree;
    private int depth;
    private String path;
    private boolean isLeaf;

    public Node(final int val) {
        value = val;
    }

    public int getDegree() {
        return degree;
    }

    public int getDepth() {
        return depth;
    }

    public int getValue() {
        return value;
    }

    public String getPath() {
        return path;
    }

    public boolean getIsLeaf() {
        return isLeaf;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Node)) {
            return false;
        }
        final Node other = (Node) obj;
        return (other.getValue() == this.getValue());
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.getValue(), o.getValue());
    }

    @Override
    public String toString() {
        return "Wert: " + this.getValue() + " | Grad: " + this.getDegree() + " | Pfad: " + this.getPath() + " | Tiefe: " + this.getDepth();
    }
}
