package class26;
/*How can you remove all duplicates from ArrayList?

List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");*/


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task3HW {

    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

       LinkedHashSet<String> aLinkedHash = new LinkedHashSet<String>(aList);

        System.out.println(aLinkedHash);

    }
}
