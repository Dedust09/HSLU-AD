package ch.hslu.ad.sw03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public final class BinaryTree implements Tree {

    private static final Logger LOG = LogManager.getLogger(BinaryTree.class);
    private int levels;
    private int high;
    private int weight;
    private Node root;

    public BinaryTree(){
        Node node1 = new Node(6);
        this.setRoot(node1);
        Node node2 = new Node(8);
        node1.setRightChild(node2);
        Node node3 =  new Node(4);
        node1.setLeftChild(node3);
        Node node4 = new Node(2);
        node3.setLeftChild(node4);
        Node node5 = new Node(5);
        node3.setRightChild(node5);
        Node node6 = new Node (7);
        node2.setLeftChild(node6);
        Node node7 = new Node(9);
        node2.setRightChild(node7);
        Node node8 = new Node(1);
        node4.setLeftChild(node8);
        Node node9 = new Node(3);
        node4.setRightChild(node9);
        Node node10 = new Node(10);
        node7.setRightChild(node10);

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
    public Node getRoot() {
        return root;
    }

    @Override
    public void addNode(Node node) {

    }

    @Override
    public void removeNode(Node node) {

    }

    @Override
    public Node searchNode(final int value) {
                return null;
    }

    @Override
    public void setRoot(Node root) {
        this.root = root;
    }
}
