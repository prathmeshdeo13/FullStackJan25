package interFace;

public interface RBI {
     void interest();

     void rule();
}

class SBI implements RBI{

    @Override
    public void interest() {

    }

    @Override
    public void rule() {

    }

    public static void main(String[] args) {

        RBI rbi=new SBI();
        rbi.interest();
        rbi.rule();
    }
}