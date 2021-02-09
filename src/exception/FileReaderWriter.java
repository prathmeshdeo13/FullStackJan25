package exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("FHDemo2");
            fileWriter.write("Today is Saturday");
            System.out.println("File is  written successfully");
            fileWriter.close();


            FileReader fileReader = new FileReader("FHDemo2");
            int i = fileReader.read();
            System.out.println(" i value= " + i);
            while (i != -1) {
                System.out.print((char) i);
                i=fileReader.read();
            }
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}