package class25;
//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
import java.util.ArrayList;
import java.util.Iterator;
public class HWTask2 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("mojito");
        drinks.add("pina colada");
        drinks.add("lemonade");
        drinks.add("milk");

        Iterator<String> iterator = drinks.iterator();

        while (iterator.hasNext()) {

            int count = 0;
            while (iterator.hasNext()) {
                String drink = iterator.next();
                if (drink.contains("a") || drink.contains("e")) {
                    drinks.set(count, "water");
                }
                count++;
            }
            System.out.println(drinks);
        }
        System.out.println();
    }
}
