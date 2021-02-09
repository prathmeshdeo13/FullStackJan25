package filehandling;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileHandling {

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("FHDemo.txt");
            String Str = ("Today is Friday");
            byte[] arr = Str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("File is written Successfully");
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("FHDemo.txt");
            int i=fileInputStream.read();
            while(i!=-1){
                System.out.print((char)i);
            i=fileInputStream.read();
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}

