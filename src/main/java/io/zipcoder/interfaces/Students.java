package io.zipcoder.interfaces;


public final class Students extends People<Student> {

    public final static Students INSTANCE = new Students();


    private Students() {
        Student ashley = new Student(2);
        ashley.setName("Ashley");
        Student ajah = new Student(4);
        ajah.setName("Ajah");
        Student robyn = new Student(6);
        robyn.setName("Robyn");
        Student res = new Student(8);
        res.setName("Res");


        add(ashley);
        add(ajah);
        add(robyn);
        add(res);
    }

    public static Students getInstance() {
        return INSTANCE;

    }

    @Override
    public Student[] getArray() {
        return getPersonList().toArray(new Student[0]);

    }

}


