import java.io.IOException;

public class LinkedList {
    public static void main(String[] args) throws IOException, InterruptedException {
        LinkList newList = new LinkList();

        newList.generateList(new int[] {1,2,3,4,5});
        Integer last = newList.findLast();
        System.out.println(last);
        newList.insertFirst(0);
        newList.insertLast(6);
        newList.removeByIndex(2);
        newList.displayList();

        newList.generateStringList(new String[] {"one","two","three","four","five"});
        newList.removeByIndex(4);
        newList.insertLastString("333");
        System.out.println(newList.findLastString());
        newList.displayStringList();
        System.out.println("Found element is: " + newList.getStringByIndex(1));

    }

}
