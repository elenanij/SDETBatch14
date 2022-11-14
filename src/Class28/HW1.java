package Class28;

/*Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map*/

import java.util.HashMap;

public class HW1 {

    public static void main(String[] args) {

        HashMap <Integer, String> building = new HashMap<>();

        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Gucci");
        building.put(4, "Facebook");
        building.put(5, "Discord");
        building.put(6, "Tiffany");
        building.put(7, "Amazon");


        int buildingSize = building.size();

        System.out.println("size = " + buildingSize);

        building.replace(4, "Meta");

        building.remove(7);

        System.out.println(building);




    }
}
