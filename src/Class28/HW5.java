package Class28;

/*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000*/

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HW5 {

    public static void main(String[] args) {

        Map<String, Integer> salary = new HashMap<>();

        salary.put( "John Smith", 100000);
        salary.put("Joe Goldberg",19000);
        salary.put("Jill Robin",85000);
        salary.put("Samantha Jones",70000);
        salary.put("Jane Doe",95000);

        var pay = salary.values();

        for(var entry: salary.entrySet()){

            if(entry.getValue().equals(Collections.max(pay))) {

                System.out.println(entry.getKey()+"=$"+ entry.getValue());
            }
        }

        //OR

        System.out.println("______________");

        var iterator = salary.entrySet().iterator();

        Integer maxSalary = 0;
        String maxKey ="";

        while(iterator.hasNext()) {

            var entry = iterator.next();

            if(entry.getValue() > maxSalary) {

                maxSalary = entry.getValue();

                maxKey = entry.getKey();

            }
        }

        System.out.println(maxKey+ "=$" + salary.get(maxKey));

    }
}
