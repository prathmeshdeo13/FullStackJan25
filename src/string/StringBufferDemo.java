package string;

public class StringBufferDemo {
    public static void main(String[] args) {


        String s1="Prathmesh";
        StringBuffer stringBuffer1 = new StringBuffer(s1);
        stringBuffer1.reverse();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Pune");
        System.out.println("Substring->"+stringBuffer1.substring(0,2));
        System.out.println("Substring->"+stringBuffer1.replace(3,6,"A"));
        System.out.println(stringBuffer1);



        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mumbai");
        System.out.println(stringBuilder);
    }
}
