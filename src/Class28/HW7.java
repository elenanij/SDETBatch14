package Class28;

/*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers*/

import java.util.ArrayList;

public class HW7 {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(5);

        nums.add(100);
        nums.add(5);
        nums.add(47);
        nums.add(33);
        nums.add(100);

        int sum = 0;

        for (Integer num : nums) {

            sum += num;
        }

        System.out.println(sum);
    }


}
