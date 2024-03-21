package lab3;

import java.util.Comparator;

public class Node<T> {

    private final T data;
    private Node<T> left;
    private Node<T> right;

    Node(T data) {
        this.data = data;
        left = null;
        right = null;
    }

    Node(T data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
