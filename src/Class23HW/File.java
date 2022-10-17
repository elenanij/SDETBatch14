package Class23HW;
/*Create a class File that will have the following behaviors: open, edit, close.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc*/

abstract class File {
    abstract void open();
    void edit(){
        System.out.println("Editing the file");
    };
    void close(){
        System.out.println("Closing the file");
    };
}
 class JavaFile extends File {

    @Override

    void open() {

        System.out.println("Open .java file in Notepad");
    }
}
class WordFile extends File {

    @Override

    void open() {

        System.out.println("Make sure Microsoft is installed and Open the file in Microsoft Word");
    }
}
class PdfFile extends File {
    @Override

    void open() {

        System.out.println("Make sure PDF reader is installed and open the file in PDF reader");
    }
}
class Tester {
    public static void main(String[] args) {

        File[] arr = {new JavaFile(), new WordFile(), new PdfFile()};

        for (File obj : arr) {

            obj.open();

        }
    }
}



