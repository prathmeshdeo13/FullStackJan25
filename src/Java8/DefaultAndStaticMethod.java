package Java8;

public class DefaultAndStaticMethod implements MyInterface6,MyInterface7 {
    public static void main(String[] args) {
        DefaultAndStaticMethod defaultAndStaticMethod = new DefaultAndStaticMethod();
        System.out.println(defaultAndStaticMethod.msg());
        System.out.println(defaultAndStaticMethod.display());
        System.out.println(MyInterface6.send());


    }

    @Override
    public String msg() {
        return "Bonjour";
    }


    @Override
    public String display() {
        return "Au Revoir";
    }


}




interface MyInterface6 {
    String msg();
    default String display() {
        return "Au Revoir";
    }


    static String send() {
        return "En Partager method";
    }
}

    interface MyInterface7 {
        default String display() {
            return "Enchanter";
        }
}
