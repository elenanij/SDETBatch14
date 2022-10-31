package Class24;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

       // ArraysList<int> numbers = new ArrayList<int>(); cannot use primitive data types. only classes

//        int => Integer
//        boolean => Boolean
//        byte => Byte
//        double => Double
//        long => Long
//        float => Float
//        char => Character

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);

        int a = 34;
        numbers.add(a);
        System.out.println("Numbers");

        for(Integer num:numbers) {

            System.out.println(num);
        }
    }
}
