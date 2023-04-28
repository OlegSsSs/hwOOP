package hwSeminar3;

import java.util.Iterator;

public class SinglyLinkedList implements Iterable {

    private Node head;
    private Node tail;
    int count = 0;

    @Override
    public Iterator iterator() {
        return new Iterator<>() {
            Node node0 = new Node("0");
            {
                node0.setNext(head);
            }
            Node currentNode = node0;

            @Override
            public boolean hasNext() {
                return currentNode.getNext() != null;
            }

            @Override
            public Object next() {
                currentNode = currentNode.getNext();
                return currentNode.getData();
            }
        };
    }

    private Node getNode(int index) {

        Node result = head;
        for (int i = 1; i <= index; i++){
            result = result.getNext();
        }
        return result;
    }

    public Object get(int index){
        Node node = getNode(index);
        return node.getData();
    }

    public void add(Object data){
        count++;
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
            return;
        } else if (tail == null) {
            tail = node;
            return;
        }
        tail.setNext(node);
        tail = node;
    }
}
