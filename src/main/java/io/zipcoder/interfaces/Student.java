package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime = 0;


    public Student(long id) {
        super(id);
    }

    public static Students getInstance() {
        return null;
    }

    public  void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

}
