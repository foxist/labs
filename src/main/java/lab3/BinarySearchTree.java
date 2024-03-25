package lab3;

import java.util.Comparator;

public class BinarySearchTree {

    private Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        if (root == null) {
            root = node;
            return root;
        } else if (root.getData() > node.getData())
            root.setLeft(insertHelper(root.getLeft(), node));
        else
            root.setRight(insertHelper(root.getRight(), node));
        return root;
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if (root == null)
            return false;
        else if (root.getData() == data)
            return true;
        else if (root.getData() > data)
            return searchHelper(root.getLeft(), data);
        else
            return searchHelper(root.getRight(), data);
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.getLeft());
            System.out.println(root.getData());
            displayHelper(root.getRight());
        }
    }

    public void remove(int data) {
        if (search(data))
            removeHelper(root, data);
        else
            System.out.println(data + " couldn't be found");
    }

    private Node removeHelper(Node root, int data) {
        if (root == null)
            return null;
        else if (root.getData() > data) {
            root.setLeft(removeHelper(root.getLeft(), data));
        } else if (root.getData() < data) {
            root.setRight(removeHelper(root.getRight(), data));
        } else {
            if (root.getLeft() == null && root.getRight() == null) {
                root = null;
            } else if (root.getRight() != null) {
                root.getData() =
            }
        }
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int i : new int[]{-5, -4, -3, -6, 1, 7, 9, 8})
            binarySearchTree.insert(new Node(i));
        binarySearchTree.display();

        for (int i = 1; i <= 10; i++) {
            System.out.println(binarySearchTree.search(i));
        }
    }
}
