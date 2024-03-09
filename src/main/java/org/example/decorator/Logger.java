package org.example.decorator;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static final String FILE_PATH = "log.txt";

    public static void log(String message) {
        try {
            FileWriter writer = new FileWriter(FILE_PATH, true);
            writer.write(message + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
