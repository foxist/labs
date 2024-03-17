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

    public void addFirst(T data) {
        Node<T> firstNode = new Node<>(data);
        firstNode.setNext(head);
        head = firstNode;
        size++;
    }

    public void add(T data) {
        if (head == null) {
            head = new Node<>(data);
            size++;
            return;
        }

        Node<T> currentNode = head;
        while (currentNode.getNext() != null)
            currentNode = currentNode.getNext();
        currentNode.setNext(new Node<>(data));
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

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

//        linkedList.insert(40);
//        linkedList.insert(30);
//        linkedList.insert(20);
//        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.addFirst(30);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(40);

        System.out.println(linkedList.getSize());

        linkedList.remove(20);

        System.out.println(linkedList.getSize());
    }
}
