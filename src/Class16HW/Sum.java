package Class16HW;
//Create a method that will accept an array as parameters and will return a sum of all elements from that array.
// Method should be visibly only within same package and accessible by the creating an instance of the class.

public class Sum {

    int sum(int[] array) {

        int arrSum = 0;

        for(int i=0; i<array.length; i++) {

            arrSum += array[i];
        }

        return arrSum;

    }
}
