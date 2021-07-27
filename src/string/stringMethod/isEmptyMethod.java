package string.stringMethod;

public class isEmptyMethod {
    public static void main(String[] args) {
        String s = "";
        System.out.println(s.isEmpty());

        String name = "";
        boolean b= name.isEmpty();
        if (b==true){
            System.out.println("name is empty");
        }
        else
        {
            System.out.println("name is valid");
        }
    }
}
