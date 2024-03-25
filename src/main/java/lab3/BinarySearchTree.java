package lab3;

import java.util.Comparator;

public class BinarySearchTree<T> implements Comparator<T> {

    private Node<T> root;

    public void insert(Node<T> node) {
        root = insertHelper(root, node);
    }

    private Node<T> insertHelper(Node<T> root, Node<T> node) {
        if(root == null) {
            root = node;
            return root;
        } else if (compare(root.getData(), node.getData()) == 1) {
            root.setLeft(insertHelper(root.getLeft(), node));
        } else if (compare(root.getData(), node.getData()) == -1) {
            root.setRight(insertHelper(root.getRight(), node));
        }
        return root;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }

    @Override
    public int compare(T o1, T o2) {
        if (o1 == o2)
            return 0;
        else if (o1 > o2) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int i : new int[]{5, 4, 3, 6, 1, 7, 9, 8})
            binarySearchTree.insert(new Node<>(i));
        System.out.println(binarySearchTree);
    }
}
