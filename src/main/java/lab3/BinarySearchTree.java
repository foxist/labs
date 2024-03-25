package lab3;

public class BinarySearchTree {

    private Node root;
    private int size;

    public void insert(Node node) {
        root = insertHelper(root, node);
        size++;
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

    public void remove(int data) {
        if (search(data)) {
            removeHelper(root, data);
            size--;
        } else
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
                if (size == 1)
                    this.root = null;
                else
                    root = null;
            } else if (root.getRight() != null) {
                root.setData(getLeftChildLeast(root));
                root.setRight(removeHelper(root.getRight(), root.getData()));
            } else {
                root.setData(getRightChildLeast(root));
                root.setLeft(removeHelper(root.getLeft(), root.getData()));
            }
        }
        return root;
    }

    private int getLeftChildLeast(Node root) {
        root = root.getRight();
        while (root.getLeft() != null)
            root = root.getLeft();
        return root.getData();
    }

    private int getRightChildLeast(Node root) {
        root = root.getLeft();
        while (root.getRight() != null)
            root = root.getRight();
        return root.getData();
    }

    private StringBuilder display(Node root, StringBuilder string) {
        if (root != null) {
            display(root.getLeft(), string);
            string.append(root.getData() + ", ");
            display(root.getRight(), string);
        }
        return string;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        display(root, stringBuilder);
        if (size == 0)
            return "{" + stringBuilder + "}";
        return "{" + stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length()) + "}";
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int i : new int[]{8, 9, 0, -123})
            binarySearchTree.insert(new Node(i));

        for (int i : new int[]{8, 9, 0})
            binarySearchTree.remove(i);
        System.out.println(binarySearchTree);
    }
}
