package class25;
//Create an arrayList of words. Remove every word that ends with “e”.

import java.util.ArrayList;
import java.util.Iterator;

public class HWTask1 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("dog");
        words.add("store");
        words.add("holiday");
        words.add("candle");
        words.add("interview");
        words.add("make");

        Iterator <String> iterator = words.iterator();

        while (iterator.hasNext()) {

            String word = iterator.next();
            if(word.endsWith("e")) {
                iterator.remove();
            }
        }

        System.out.println(words);
    }
}
