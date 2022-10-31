package class25;
////Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.

import java.util.ArrayList;

public class HWTask3 {
    public static void main(String[] args) {

        ArrayList<Integer> evenNums = new ArrayList<>(250);

        for(int i=1; i<=500; i++) {

            if(i%2 == 0) {

                evenNums.add(i);
            }
        }

    evenNums.removeIf(num -> num%5== 0);

        System.out.println("evenNums = " + evenNums);
    }
}
