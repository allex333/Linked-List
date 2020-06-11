package DoublyLinkendList;

public class DoubleList {

    DoubleNodo head;
    //DoubleNodo tail;
    DoubleNodo aux;

    int size;
    int counter;

    public DoubleList() {
        this.head = null;
        //this.tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public void showList(){
        aux=head;

        while(aux!=null){
            System.out.print(aux.data + " -> ");
            aux=aux.next;
        }
        System.out.println();
    }

    public void createLis(int data){
        if (head==null){
            head= new DoubleNodo(data);
            size++;
        }else{
            System.out.println("Your List was already created");
        }
    }

    public void insertStart(int data) {

        DoubleNodo first=new DoubleNodo(data);

        if(head==null){
            head= new DoubleNodo(data);
            size++;
        }else{
            first.next=head;
            head.previus=first;
            head=first;
            size++;
        }
    }

    public void insertBefore(int data, int position){
        aux=head;
        counter=1;

        DoubleNodo before=new DoubleNodo(data);

        while( (aux.next != null) && (counter <(position-1)) ){
            aux=aux.next;
            counter++;
        }
        before.next=aux.next;
        aux.next.previus=before;
        aux.next=before;
        before.previus=aux;
        size++;
    }

    public void insertAfter(int data, int position){
        aux=head;
        counter=1;
        DoubleNodo after=new DoubleNodo(data);

        while( (aux.next != null) && (counter< position) ){
            aux=aux.next;
            counter++;
        }
        after.next=aux.next;
        aux.next.previus=after;
        aux.next=after;
        after.previus=aux;
        size++;
    }

    public void insertEnd(int data){

        DoubleNodo end=new DoubleNodo(data);

        while(aux.next!=null){
            aux=aux.next;
        }
        aux.next=end;
        end.previus=aux;
        size++;
    }

    public void deleteStart(){
        aux=head;

        if (head!=null){
            head=aux.next;
            aux.next=null;
            head.previus=null;
            size--;
        }
    }

    public void deletePosition(int position){
        aux=head;
        counter=1;
        while ( (aux.next != null) && (counter < (position-1)) ){
            aux=aux.next;
            counter++;
        }
        DoubleNodo temporal=aux.next;
        aux.next=temporal.next;
        temporal.next.previus=aux;
        temporal.next=null;
        temporal.previus=null;
        size--;
    }

    public void deleteEnd(){
        aux=head;

        while(aux.next.next != null){
            aux=aux.next;
        }
        aux.next.previus=null;
        aux.next=null;
        size--;
    }

    public void showPositionData(int position){
        aux=head;
        counter=1;

        while( (aux.next != null) && (counter< position) ){
            aux=aux.next;
            counter++;
        }
        System.out.println(aux.data);
    }


}
