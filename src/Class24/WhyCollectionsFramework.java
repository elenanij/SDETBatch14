package Class24;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionsFramework {
    public static void main(String[] args) {

        //arrays

        String[] breeds = new String[10];
        breeds[0] = "Bulldogs";
        System.out.println(Arrays.toString(breeds));

        //ArrayList

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Black");
        colors.add("Yellow");

        System.out.println(colors);
        System.out.println(colors.get(0));
        System.out.println(colors.get(1));
        System.out.println(colors.get(2));
        System.out.println(colors.get(3));

        System.out.println("***********");

        //size

        colors.size();

        //loop

        for(int i = 0; i< colors.size(); i++) {

            System.out.println(colors.get(i));
        }

        System.out.println("************");

        for(String color:colors) {

            System.out.println(color);
        }

    }
}
