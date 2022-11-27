package replit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main209 {


        public static void main(String[]args) {

            List<Map<String, Object>> dataList = new ArrayList<>();

            Map<String, Object> appleMap = new HashMap<>();

            appleMap.put("Items", "Apple");
            appleMap.put("Price", "20.00");
            appleMap.put("Quantity", "10");

            dataList.add(appleMap);

            Map<String, Object> orangeMap = new HashMap<>();

            appleMap.put("Items", "Orange");
            appleMap.put("Price", "21.99");
            appleMap.put("Quantity", "10");

            dataList.add(orangeMap);


            for (Map<String, Object> map : dataList) {

                Object item = map.get("Items");
                Object price = map.get("Price");
                Object quantity = map.get("Quantity");

                try {

                    Double.valueOf(price.toString());

                    Integer.valueOf(quantity.toString());

                } catch (NumberFormatException n) {
                    System.out.println("NOT A NUMBER!!");
                }


            }
        }}

