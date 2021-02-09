package inhertiance;

public class Calculator {

    public static void main(String[] args) {
     Multiplication multiplication =new Multiplication();
     multiplication.i=(4);
     multiplication.j=(5);
     multiplication.multi();


        multiplication.sub();
        System.out.println("Subtraction  ="+multiplication.k);

        multiplication.multi();
        System.out.println("Multiplication ="+multiplication.k);

    }
}



class Addition {
    int i, j, k;

    public void add() {
        k = i + j;
    }
}


class Subtraction extends Addition{

    public void sub(){
        k=i-j;
    }
}

class Multiplication extends Subtraction {

    public void multi() {

        k = i * j;

    }
}