public class LinkedList {

    public Node head;

    LinkedList() {
        head = null;
    }
    public static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (head == null)
            head = newNode;
        else {
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void remove(int data) {
        Node currentNode = head;
        Node prevNode = null;

        while (currentNode != null) {
            if (currentNode.data == data) {
                if (currentNode == head)
                    head = currentNode.next;
                else
                    prevNode.next = currentNode.next;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void print() {
        Node currentNode = head;

        if (head != null)
            System.out.print(head.data + ", ");

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.print(currentNode.data + ", ");
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(1);

        linkedList.remove(1);

        linkedList.print();
    }
}
