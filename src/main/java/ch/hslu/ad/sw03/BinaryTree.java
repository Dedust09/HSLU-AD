package ch.hslu.ad.sw03;

public final class BinaryTree implements Tree {

    private int levels;
    private int high;
    private int weight;

    public BinaryTree(){

    }

    @Override
    public int getHigh() {
        return high;
    }

    @Override
    public int getLevels() {
        return levels;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void addNode(Node node) {

    }

    @Override
    public void removeNode(Node node) {

    }

    @Override
    public Node searchNode(int value) {
        return null;
    }
}
