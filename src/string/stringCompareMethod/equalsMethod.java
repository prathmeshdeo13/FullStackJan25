package string.stringCompareMethod;

public class equalsMethod {
    public static void main(String[] args) {
        String s1 = "Manisha";
        String s2 = "manisha";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "";
        if (s3.equals("")){
            System.out.println("name is empty");
        }else{
            System.out.println("name is valid");
        }

    }
}
