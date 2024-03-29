package lab2;

public class Node<T> {
    private final T data;
    private Node<T> next;

    Node(T data) {
        this.data = data;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                " | " + next +
                '}';
    }
}
