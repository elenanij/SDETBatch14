package Class24;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>(new ArrayList<>(Arrays.asList('E', 'F', 'C')));

        chars.add('A');
        chars.add('K');

        //shift
        chars.add(0, 'Y');
        chars.add(2, 'L');

        //replacing
        chars.set(0, 'M');
//chars.clear();

        //chars.remove('M');
        chars.remove(2);
        System.out.println(chars);

    }
}
