package ir.maktab.model;

import ir.maktab.Observer;

public class Person implements Observer {

    String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void update(String state) {
        System.out.println("Hello "+personName+", Product is now "+ state +" on website");
    }
}