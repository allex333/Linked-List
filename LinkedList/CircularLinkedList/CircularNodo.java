package CircularLinkedList;

public class CircularNodo {

    public int data;
    public CircularNodo next;

    public CircularNodo(int data) {
        this.data = data;
        this.next = this;
    }

    public CircularNodo() {
    }

}
