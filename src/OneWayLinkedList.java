public class OneWayLinkedList {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void push(int data) {
        final Node node = head;
        head = new Node(data, node);
    }

    static class Node {

        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
