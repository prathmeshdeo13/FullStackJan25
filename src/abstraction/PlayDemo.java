package abstraction;

public abstract class PlayDemo {
    public abstract void play();//declaring method.
    public void exercise(){ //defining method.
        System.out.println("Exercise is mandatory");
    }
    public void a(){
        exercise();
    }
}


class Football extends PlayDemo {

    @Override
    public void play() {
        System.out.println("Football Players");
    }

    public static void main(String[] args) {
        Football f = new Football();
        f.play();
        f.exercise();
    }
}


    class Cricket extends PlayDemo {

        @Override
        public void play() {
            System.out.println("Cricket Players");
        }

        public static void main(String[] args) {
        Cricket c = new Cricket();
        c.play();
        c.exercise();
        }

    }

