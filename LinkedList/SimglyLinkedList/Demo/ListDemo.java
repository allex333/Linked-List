package SimglyLinkedList.Demo;

public class ListDemo {

    NodoDemo head;
    NodoDemo aux;

    public ListDemo() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void createList(String number) {
        if (head == null) {
            head = new NodoDemo(number);
        } else {
            System.out.println("Your List was already created");
        }
    }

    public void showList() {
        aux = head;

        if (head == null) {
            System.out.println("empty list");
        } else {
            while (aux != null) {
                System.out.print(aux.number + "->");
                aux = aux.next;
            }
            System.out.println();
        }
    }

    public void insertStar(String number) {

        NodoDemo first = new NodoDemo(number);
        aux = head;

        if (head == null) {
            head = first;
        } else {
            first.next = aux;
            head = first;
        }
    }

    public void insertBefore(String number, int x) {

        NodoDemo before = new NodoDemo(number);
        aux = head;

        while (aux.next != null && (x - 1) != 1) {
            aux = aux.next;
            x--;
        }
        if (aux.next != null) {
            before.next = aux.next;
            aux.next = before;
        }
    }

    public void insertAfter(String number, int x) {

        NodoDemo after = new NodoDemo(number);
        aux = head;
        while (aux.next != null && x != 1) {
            aux = aux.next;
            x--;
        }
        if (aux.next != null) {
            after.next = aux.next;
            aux.next = after;
        }


    }

    public void insertFinal(String number) {

        NodoDemo last = new NodoDemo(number);
        aux = head;

        if (head == null) {
            head = last;
        } else {
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = last;
        }
    }

    public void deleteStar() {
        aux = head;

        if (head != null) {
            head = aux.next;
            aux.next = null;
        }
    }

    public void deleteItem(int x) {
        aux = head;

        while (aux.next != null && (x - 1) != 1) {
            aux = aux.next;
            x--;
        }
        NodoDemo tem = aux.next;
        aux.next = tem.next;
        tem.next = null;
    }

    public void deleteFinal() {
        aux = head;

        while (aux.next.next != null) {
            aux = aux.next;
        }
        aux.next = null;
    }

}
