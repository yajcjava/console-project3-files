package tme.yajc.tutorial.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileWithContent {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("my-first-file-with-content.txt");
        Files.writeString(path, "I'm the file content :)\n");
    }
}
