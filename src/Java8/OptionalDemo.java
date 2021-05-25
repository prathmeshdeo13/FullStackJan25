package Java8;

import java.util.Optional;

public class TpDemo1 {
    public static void main(String[] args) throws  Exception {
        Customer customer = new Customer(1, "Rajesh", "null");
//        System.out.println(customer.getEmail());
//        System.out.println(customer.getEmail().toUpperCase());


        Optional<String> optional4 = Optional.ofNullable(customer.getEmail());
        System.out.println(optional4.orElse("Default Email"));

        Optional<String> optional5 = Optional.ofNullable(customer.getEmail());
        System.out.println(optional5.orElseGet(()->"Get Email"));

        Optional<String> optional6 = Optional.ofNullable(customer.getEmail());
        System.out.println(optional6.orElseThrow(()-> new Exception("Exception")));


    }
}


class Customer{
    int id;
    String name;
    String email;


    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}