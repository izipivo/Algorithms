package ru.neket.BinaryTree;

public class Node {
    private int value;
    private Node Left;
    private Node Right;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setLeft(Node left) {
        Left = left;
    }

    public Node getLeft() {
        return Left;
    }

    public void setRight(Node right) {
        Right = right;
    }

    public Node getRight() {
        return Right;
    }
}
