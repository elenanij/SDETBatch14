package Class28;

/*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/

import java.util.HashMap;

public class HW3 {

    public static void main(String[] args) {

        HashMap <Integer, String> bb = new HashMap<>();

        bb.put(7664847, "Printer");
        bb.put(7879885, "TV");
        bb.put(7890653, "Iphone");
        bb.put(8956734, "Refrigerator");
        bb.put(7637612, "Camera");

        for(var entry:bb.entrySet()) {

            System.out.println(entry);
        }

    }
}
