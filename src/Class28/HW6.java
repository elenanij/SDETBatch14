package Class28;

/*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/

import java.util.LinkedHashSet;

public class HW6 {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Everybody");
        set.add("Everybody");
        set.add("loves");
        set.add("Java");
        set.add("Java");
        set.add(", it's the best");

        String newStr = "";

        for(String str: set) {

            newStr = newStr.concat(str);
        }

        System.out.println(newStr);
    }
}
