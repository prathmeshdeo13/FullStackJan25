package assignment;

import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment5 {


    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("HelloWorld.txt");
            String str = ("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod" +
                    " tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam," +
                    " quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
                    " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat ");
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("File is written Successfully");
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
