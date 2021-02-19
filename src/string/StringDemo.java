package string;

public class StringDemo {
    public static void main(String[] args) {

        char [] arr = {'C','o','d','e','k','u','l'};
        String s = new String(arr);
        System.out.println(s);

        String s1 = new String("Pune");
        String s2="Mumbai";
        s2.concat("Pune");
        s2=s2.concat("Pune"); // String literal
        System.out.println(s2);






        String a1 = "Prathmesh";
        String a2 = "Prathmesh";
        String a3= new String("Patya");
        String a4 = new String("Patya");
        System.out.println(a3==a4); // reference
        System.out.println(a4.equals(a3)); // content
    }

}
