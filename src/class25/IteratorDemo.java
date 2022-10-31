package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLiner");
        makeUpItem.add("lipstick");
        //get the iterator from the list
        Iterator<String> iteratorObj = makeUpItem.iterator();
        //returns true if there are still items in the list
        System.out.println(iteratorObj.hasNext());

        //gives us the item

        System.out.println(iteratorObj.next());




    }
}
