package try_catch;
public class TrycatchDemo {

    public static void main(String[] args) {
        try {
            int i = 20;
            int j = 0;
            int k = i / j;

           // System.out.println(k);
            //String s = null;
          //  int sle = s.length();
        }catch(ArithmeticException a){
            System.out.println("ArithmeticException:"+a);
        } catch (Exception e) {
            System.out.println("Exception:"+e);
        }finally {

            System.out.println("Hello");
        }

    }
    }


