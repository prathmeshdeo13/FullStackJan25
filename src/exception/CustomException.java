package exception;


public class CustomException {
    public static void main(String[] args) {
        int age = 19;
        try {
            if (age > 18) {
                throw new MyException("you can vote");
            }else {
                throw new MyException("You cannot vote");
            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}

class MyException extends Exception {


    MyException(String message) {
        super(message);
    }
}