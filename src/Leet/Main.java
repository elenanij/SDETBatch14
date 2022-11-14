package Leet;

import java.util.*;

class Main {

    public static void main(String[]args) {

        HashMap<String,String> map = new HashMap<>();

        map.put("ONE","AAA");

        map.put("TWO","BBB");

        map.put("THREE","CCC");

        map.put("FOUR","DDD");

        map.put("FIVE","EEE");




        ArrayList<Map.Entry<String,String>> list = new ArrayList<>(map.entrySet());


        System.out.println("HashMap Before Remove : ");

        for(Map.Entry<String,String> entry: list) {
            System.out.println(entry.getKey()+ " : "+ entry.getValue());

        }


        for(int i =0; i<list.size(); i++) {

            Map.Entry<String,String> entry = list.get(i);

            if (entry.getKey().equals("ONE")||entry.getKey().equals("FOUR")) {

                list.remove(i);

            }

        }

        System.out.println("------------------\nHashMap After Remove :");

        for(Map.Entry<String,String> entry: list) {
            System.out.println(entry.getKey()+ " : "+ entry.getValue());

        }





    }

}