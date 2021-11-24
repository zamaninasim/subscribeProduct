package ir.maktab;

import ir.maktab.model.Person;
import ir.maktab.model.Product;

public class Main {
    public static void main(String[] args) {
        Person nasim = new Person("nasim");
        Person ali = new Person("ali");

        Product samsungMobile = new Product("Samsung", "Mobile", 0);

        samsungMobile.registerObserver(nasim);
        samsungMobile.registerObserver(ali);

        samsungMobile.setCount(5);
        System.out.println("********************************");
        samsungMobile.setDiscount(true);

    }
}
