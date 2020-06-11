package SimglyLinkedList.Demo;

public class MainDemo {

    public static void main(String[] args) {


        ListDemo listDemo = new ListDemo();

        System.out.println("is your list empty? " + listDemo.isEmpty());
        //listDemo.starList();

        listDemo.isEmpty();

        listDemo.createList("five");

        listDemo.insertStar("four");

        listDemo.insertStar("three");

        listDemo.insertFinal("six");

        //listDemo.insertBefore("eleven",3);

        //listDemo.insertAfter("twelve",3);

        //listDemo.deleteStar();

        //listDemo.deleteItem(3);

        listDemo.deleteFinal();

        listDemo.showList();


    }
}
