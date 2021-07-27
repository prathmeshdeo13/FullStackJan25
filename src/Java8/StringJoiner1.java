package Java8;

import java.util.StringJoiner;

public class StringJoiner1 {
    public static void main(String[] args) {


        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("R");
        stringJoiner.add("A");
        stringJoiner.add("M");

        System.out.println(stringJoiner);

        StringJoiner stringJoiner1 = new StringJoiner(",","[","]");
        stringJoiner1.add("S");
        stringJoiner1.add("I");
        stringJoiner1.add("T");
        stringJoiner1.add("A");
        stringJoiner1.add("A");

        System.out.println(stringJoiner1);
    }
}
