package hwSeminar3;

public class Node {

    Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    void setNext(Node node) {
        next = node;
    }
}
