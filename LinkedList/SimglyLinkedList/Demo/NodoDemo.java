package SimglyLinkedList.Demo;

public class NodoDemo {

    public NodoDemo next;

    public String number;

    public NodoDemo(String number, NodoDemo next) {
        this.next = next;
        this.number = number;
    }

    public NodoDemo(String number) {
        this(number, null);
    }

    public NodoDemo() {
    }

}
