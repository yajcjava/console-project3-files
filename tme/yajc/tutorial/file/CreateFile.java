package tme.yajc.tutorial.file;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        // Create a file object which is an abstract representation of a file
        // After creating a new file object, the file is not created on disk
        File file = new File("my-first-file.txt");
        // Invoke createNewFile to create a new file on disk
        // This method gives us a flag to check if the file is created
        boolean fileCreated = file.createNewFile();
        if (fileCreated) {
            // output a message when the file is created
            System.out.println("A new file has been created.");
        } else {
            // output a message when the file already created
            System.out.println("A file already exists.");
        }
    }
}
