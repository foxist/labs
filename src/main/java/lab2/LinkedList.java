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
        Node<T> previousNode = null;
        Node<T> currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                if (head.getData().equals(data))
                    head = currentNode.getNext();
                else
                    previousNode.setNext(currentNode.getNext());
                size--;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        Node<T> currentNode = head;

        for (int i = 0; i < size; i++) {
            string.append(currentNode.getData());
            if (size == 1)
                break;
            if (i < size - 1)
                string.append(", ");
            currentNode = currentNode.getNext();
        }
        return "LinkedList{" + string + "}";
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(20);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(10);

        System.out.println(linkedList);

        System.out.println(linkedList.getSize());

        linkedList.remove(20);

        System.out.println(linkedList);

        System.out.println(linkedList.getSize());

        linkedList.remove(10);

        System.out.println(linkedList);

        System.out.println(linkedList.getSize());

        linkedList.remove(10);

        System.out.println(linkedList);

        System.out.println(linkedList.getSize());
    }
}
