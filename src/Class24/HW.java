package Class24;
/*Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that.*/

import java.util.ArrayList;

public class HW {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(5);
        names.add("Jane");
        names.add(0, "Kate");
        names.set(1, "Anna");
        names.add("Lena");
        names.add("Maria");
        names.add("Alice");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Anna"));
        System.out.println(names.size());

    }
}
