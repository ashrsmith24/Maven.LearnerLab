package io.zipcoder.interfaces;

public class Person  {
    final long id;
    private String name;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person(long id) {
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void learn(double numberOfHours) {

    }

}
