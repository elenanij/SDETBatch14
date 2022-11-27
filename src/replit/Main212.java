
package replit;

import java.io.FileNotFoundException;
import java.io.FileInputStream;

class Main212 {

    static void read() throws FileNotFoundException {

        String path = "C:\\Users\\elena\\IdeaProjects\\JavaBatch14\\Data\\Book.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);


    }

    public static void main(String[]args) {

        try{
            read();
        }

        catch (FileNotFoundException fnfe) {

            System.out.println("java.io.FileNotFoundException:  (No such file or directory)");
        }

    }


}
