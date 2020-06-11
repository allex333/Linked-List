package SimglyLinkedList;

public class List {

    Nodo head = new Nodo();
    Nodo aux;

    public boolean emptyList() {
        return head == null;
    }

    public void startList() {
        head = null;
    }

    public void createList(int dato) {

        if (head == null) {
            head = new Nodo(dato);
        } else {
            System.out.println("lista ya creada");
        }
    }

    public void showList() {
        aux = head;

        if (aux == null) {
            System.out.println("lista vacia");
        } else {
            while (aux != null) {
                System.out.print(aux.getDato() + " -> ");
                aux = aux.getSiguiente();
            }
        }
    }

    public void insertStart(int dato) {
        Nodo first = new Nodo(dato);
        aux = head;

        if (head == null) {
            head = first;
        } else {
            first.setSiguiente(aux);
            head = first;
        }
    }

    public void insertFinal(int dato) {
        Nodo last = new Nodo(dato);
        aux = head;

        if (head == null) {
            head = last;
        } else {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(last);
        }
    }

    public void insertBefore(int x, int dato) {
        Nodo before = new Nodo(dato);
        aux = head;

        if (head == null) {
            head = before;
        } else {
            while ((x - 1) != 1 && aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
                x--;
            }
            if (aux.getSiguiente() != null) {
                before.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(before);
            }
        }
    }

    public void insertAfter(int x, int dato) {
        Nodo after = new Nodo(dato);
        aux = head;

        if (head == null) {
            head = after;
        } else {
            x--;
            while (x != 1 && aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
                x--;
            }
            if (aux.getSiguiente() != null) {
                after.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(after);
            }
        }
    }

    public void deleteStart() {
        aux = head;

        if (head != null) {
            head = head.getSiguiente();
            aux.setSiguiente(null);
        }
    }

    public void deleteFinal() {
        aux = head;

        if (head != null) {
            if (head.getSiguiente() == null) {
                head = null;
            } else {
                while (aux.getSiguiente().getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(null);
            }
        }
    }

    //NullPointerException
    public void delete(int x) {
        aux = head;
        Nodo tem = new Nodo();

        if (head != null) {
            if (x == 1) {
                head = head.getSiguiente();
                aux.setSiguiente(null);
            } else {

                while ((x - 1) != 1 && aux.getSiguiente() != null) {
                    aux = aux.getSiguiente();
                    x--;
                }
                tem = aux.getSiguiente();
                aux.getSiguiente().setSiguiente(tem);
                tem.setSiguiente(null);

            }
        }
    }
}
