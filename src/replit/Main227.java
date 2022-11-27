package replit;

import java.util.*;

public class Main227 {

    public static void main(String[] args) {
        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }

    public static String HTMLElements(String str) {

        String[] arr = str.split("[><]");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        List<String> tags = new ArrayList<>();
        tags.add("b");
        tags.add("i");
        tags.add("em");
        tags.add("div");
        tags.add("p");

        for(String word: arr) {

            word = word.replaceAll("[^a-z]", "");
            if (tags.contains(word)) {

                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }



                Set<Map.Entry<String, Integer>> linkedSet = new LinkedHashSet<>(map.entrySet());

                ArrayList<String> list1 = new ArrayList<>();

                var iterator = linkedSet.iterator();

                while (iterator.hasNext()) {

                    var entry = iterator.next();

                    if (entry.getValue() % 2 == 0) {

                        iterator.remove();
                    } else {

                        list1.add(entry.getKey());
                    }
                }


                if (!list1.isEmpty()) {

                    String result = list1.get(0);
                    return result;

                } else {
                    return "true";
                }
            }
        }

