package class26;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {


    public static void main(String[] args) {

            LinkedList<String> linkedList=new LinkedList<>();

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                linkedList.add(0,"Test");
            }

            long endTime = System.currentTimeMillis();

            System.out.println("LinkedList "+(endTime-startTime));

            ArrayList<String> arrayList=new ArrayList<>();
            long startTimeA = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                arrayList.add(0,"Test");
            }

            long endTimeA = System.currentTimeMillis();

            System.out.println("ArrayList "+(endTimeA-startTimeA));



        long startTimeG = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }

        long endTimeG = System.currentTimeMillis();

        System.out.println("LinkedList Get "+(endTimeG-startTimeG));


        long startTimeAG = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }

        long endTimeAG = System.currentTimeMillis();

        System.out.println("ArrayList Get "+(endTimeAG-startTimeAG));


    }
    }

