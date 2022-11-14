package class26;

/*Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;

 */

import java.util.LinkedHashSet;

public class Task5HW {

    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Los Angeles");
        cities.add("Amsterdam");
        cities.add("Liverpool");
        cities.add("Athens");
        cities.add("Bejing");


var iterator = cities.iterator();

while(iterator.hasNext()) {

    String city = iterator.next();

    if(city.startsWith("A")) {

        iterator.remove();
    }

}

        System.out.println(cities);

    }
}
