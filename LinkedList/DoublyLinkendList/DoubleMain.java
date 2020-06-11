package DoublyLinkendList;

public class DoubleMain {

    public static void main(String[] args) {

        DoubleList doubleList= new DoubleList();

        doubleList.createLis(5);

        doubleList.insertStart(4);
        doubleList.insertStart(3);
        doubleList.insertStart(2);
        doubleList.insertStart(1);

        doubleList.insertBefore(45,5);

        doubleList.insertAfter(13,2);

        doubleList.insertAfter(14,3);

        doubleList.showPositionData(3);

        doubleList.showList();

        System.out.println(doubleList.size);

    }
}
