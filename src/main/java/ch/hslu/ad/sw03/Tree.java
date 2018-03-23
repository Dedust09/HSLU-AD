package ch.hslu.ad.sw03;

public interface Tree {

    public int getLevels();
    public int getHigh();
    public int getWeight();
    public Node getRoot();
    public void setRoot(final Node node);
    public void addNode(final Node node);
    public Node searchNode(final int value);
    public void removeNode(final Node node);
}
