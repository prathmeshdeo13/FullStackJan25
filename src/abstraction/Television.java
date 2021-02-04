package abstraction;

public abstract class Television {
    public abstract void ON();

}

class TataSky extends Television {
    @Override
    public void ON() {
        System.out.println("tatasky is giving 15% off for 1 month");
    }

    public static void main(String[] args) {

        TataSky tatasky = new TataSky();
        tatasky.ON();
    }

    static class Videocon extends Television {
        @Override
        public void ON() {
            System.out.println("Videocon is giving 14.3% off for 1 month");
        }

        public static void main(String[] args) {
            Videocon videocon = new Videocon();
            videocon.ON();
        }

    }
}

