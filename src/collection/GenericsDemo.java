package collection;

public class GenericsDemo <T>{

    private T t;

    public void add(T t) {
        this.t = t;
    }


    public T get(){
        return t;
        }

    public static void main(String[] args) {
        GenericsDemo<Integer> obj = new GenericsDemo();
        obj.add(50);
        System.out.println(obj.get());


        GenericsDemo<String> obj1 = new GenericsDemo();
        obj1.add("Kartik");
        System.out.println(obj1.get());
    }
}
