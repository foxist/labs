package lab2;

public class LinkedList<T> {

    private Node<T> head;
    private int size;

    LinkedList() {
        head = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(T data) {
        Node<T> node = new Node<>(data);
        node.setNext(head);
        head = node;
        size++;
    }

    public void remove(T data) {
        if (head.getData().equals(data)) {
            head = head.getNext();
            size--;
        }
        Node<T> previousNode = head;
        Node<T> currentNode = head.getNext();

        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                previousNode.setNext(currentNode.getNext());
                size--;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
        } else {
            Node<T> currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNext();
            }
        }
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insert(40);
        linkedList.insert(30);
        linkedList.insert(20);
        linkedList.insert(10);
        linkedList.insert(20);

        System.out.println(linkedList.getSize());
        linkedList.traverse();

        linkedList.remove(20);

        System.out.println(linkedList.getSize());

        linkedList.traverse();
    }
}
