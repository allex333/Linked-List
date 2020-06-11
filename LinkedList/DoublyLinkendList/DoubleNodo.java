package DoublyLinkendList;

public class DoubleNodo {

    public int data;
    public DoubleNodo previus;
    public DoubleNodo next;

    public DoubleNodo(int data, DoubleNodo previus, DoubleNodo next) {
        this.data = data;
        this.previus = previus;
        this.next = next;
    }

    public DoubleNodo(int data) {
        this(data, null, null);
    }

    public DoubleNodo() {
    }
}
