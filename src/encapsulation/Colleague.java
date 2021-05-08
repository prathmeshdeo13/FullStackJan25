package encapsulation;

public class Colleague {

   private int colleagueid;
   private String name;

    public int getColleagueid() {
        return colleagueid;
    }

    public void setColleagueid(int colleagueid) {
        this.colleagueid = colleagueid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Colleague colleague = new Colleague();
        colleague.setColleagueid(86);
        colleague.setName("Aarush");
        System.out.println(colleague.getColleagueid());
        System.out.println(colleague.getName());
    }
}
