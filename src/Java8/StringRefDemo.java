package Java8;

public class StringRefDemo {
    public static void main(String[] args) {
    MyInterface11 myInterface11 = StringRefDemo::capFirstLetter;
    myInterface11.capFirstLetter("kiara");
    }

  private static String capFirstLetter(String Str){
         char[] arr = Str.toCharArray();
         arr[0]=Character.toUpperCase(arr[0]);
         String up=new String(arr);
         System.out.println(up);
         return up;
  }

    }


interface MyInterface11 {
   String capFirstLetter(String Str);
}


