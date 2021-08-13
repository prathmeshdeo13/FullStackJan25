package inhertiance;

import java.util.concurrent.Callable;

public class InheritanceDemo {

    public static void main(String[] args) {
        C c = new C();
        c.A();
        c.C();
    }
}

class A {

    public void A() {
        System.out.println("In method A");
    }
}

class B extends A {

    public void B() {
        System.out.println("In method B");
    }
}

class C extends A {

    public void C() {
        System.out.println("In method C");
    }
}
