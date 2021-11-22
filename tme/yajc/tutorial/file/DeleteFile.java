package tme.yajc.tutorial.file;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("my-first-file-with-content.txt");
        if (file.exists()) {
            System.out.println("File exists, going to delete it...");
        } else {
            System.out.println("File does not exist");
        }
        if (file.delete()) {
            System.out.println("File has been deleted");
        } else {
            System.out.println("Cannot delete the file");
        }
    }
}
