package string.stringCompareMethod;

public class CompareToMethod {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "A";
        System.out.println(s1.compareTo(s2));

        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareToIgnoreCase(s4));
    }
}
