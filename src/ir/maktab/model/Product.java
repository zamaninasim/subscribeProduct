package ir.maktab.model;

import ir.maktab.Observer;
import ir.maktab.Subject;

import java.util.ArrayList;

public class Product implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private String productName;
    private String productType;
    private Integer count;
    private boolean discount;

    public Product(String productName, String productType, Integer count) {
        this.productName = productName;
        this.productType = productType;
        this.count = count;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
        if (count > 0) {
            notifyObservers("count");
        }
    }

    public boolean getDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
        if (discount == true) {
            notifyObservers("discount");
        }
    }

    public void notifyObservers(String notifFor) {
        System.out.println("Notifying to all the subscribers when product change");
        for (Observer ob : observers) {
            if (notifFor.equals("count")) {
                ob.update("available");
            }
            if (notifFor.equals("discount")){
                ob.update("discounted");
            }
        }
    }


    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

}