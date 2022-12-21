package JavaClass.Class23;

public class FileTester {
        public static void main(String[] args) {
            File[] file= {new JavaFiles(), new WordFile(), new PdfFile()};

            for(File files: file) {
                files.open();
            }

        }
    }


