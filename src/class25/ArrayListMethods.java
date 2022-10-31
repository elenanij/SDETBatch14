package class25;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLiner");
        makeUpItem.add("lipstick");

        ArrayList<String> cosmetics = new ArrayList<>();

        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("lotion");

        ArrayList<String> beautyProducts = new ArrayList<>();
        //adds everything from make up items to beauty products

        beautyProducts.addAll(makeUpItem);
        beautyProducts.addAll(cosmetics);
        System.out.println("beautyProducts = " + beautyProducts);
//remove
        beautyProducts.remove("lotion");
        //removeAll - from object in ()
        beautyProducts.removeAll(cosmetics);
        System.out.println("beautyProducts = " + beautyProducts);
        //clear - removes everything from ArrayList

        beautyProducts.clear();
        System.out.println("beautyProducts = " + beautyProducts);



    }
}
