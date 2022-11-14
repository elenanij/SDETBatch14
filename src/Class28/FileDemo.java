package Class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        //right click on your file and click copy path reference then click content root

         String path = "Data/config.properties"; //file path

        FileInputStream fileInputStream = new FileInputStream(path); //navigate to the file

        Properties properties = new Properties();

        properties.load(fileInputStream); //load all the data from the file

        System.out.println(properties.getProperty("URL"));









    }
}
