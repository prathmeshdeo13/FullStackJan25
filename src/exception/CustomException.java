package exception;


    public class CustomException {
        public static void main(String[] args) throws Exception{
            int age = 19;

            if(age>18){
                throw new MyException("you can vote");
            }


        }
    }

class MyException extends Exception{


    MyException (String message)
        {
            super(message);
        }
}