package string.stringMethod;

public class trimMethod {
    public static void main(String[] args) {
        String s = "  Kavita";
        System.out.println(s.trim());

        String s1 ="    Leena";
        if (s1.trim().length()==0){
            System.out.println("name is empty");
        }else {
            System.out.println("name is valid");
        }
    }
}
