package Class28;

/*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HW2 {

    public static void main(String[] args) {

        TreeMap<String, String> capitals = new TreeMap<>();

        capitals.put("USA", "Washington DC");
        capitals.put("France", "Paris");
        capitals.put("Netherlands", "Amsterdam");
        capitals.put("Japan", "Tokio");
        capitals.put("Australia", "Canberra");

        //print all keys and values from a country map using for each loop

        for (var entry : capitals.entrySet()) {

            System.out.println(entry);
        }

//or

        System.out.println("________________");

        for (Map.Entry<String, String> entry : capitals.entrySet()) {

            System.out.print(entry.getKey() + " " + entry.getValue());
            System.out.println();
        }

        //print all keys and values from a country map using iterator

        System.out.println("______________");
        var iterator = capitals.entrySet().iterator();

        while (iterator.hasNext()) {

            var entry = iterator.next();
            System.out.println(entry);
        }

        //Print all values from a country map using for each loop

        System.out.println("______________");

        for (String capital : capitals.values()) {

            System.out.println(capital);

        }

        //Print all values from a country map using iterator

        System.out.println("______________");

        Iterator<String> iterator1 = capitals.values().iterator();

        while (iterator1.hasNext()) {

            String value = iterator1.next();

            System.out.println(value);
        }

    }

}
