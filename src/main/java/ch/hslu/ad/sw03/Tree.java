package ch.hslu.ad.sw03;

public interface Tree {

    public int getLevels();
    public int getHigh();
    public int getWeight();
    public void addNode(final Node node);
    public Node searchNode(final int value);
    public void removeNode(final Node node);
}
