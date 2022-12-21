package JavaClass.Class23;

public abstract class File {
   abstract  void open();
    void edit() {
        System.out.println("Editing the File");

    }
    void close() {
        System.out.println("Closing the file");
    }
}
class JavaFiles extends File {
    void open() {
        System.out.println("To open Java Files, we need a Java file uploaded");
    }
}
class WordFile extends File{
    void open() {
        System.out.println("To open Word Files, we need a Word file uploaded");
    }
}
class PdfFile extends File{
    void open() {
        System.out.println("To open Pdf Files, we need a Pdf file uploaded");
    }
}

