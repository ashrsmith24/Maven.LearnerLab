package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {


    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double theNumberOfHoursPerLearner = numberOfHours / learners.length;

        for (Learner learner : learners)
            learner.learn(theNumberOfHoursPerLearner);
    }





    public Instructor(long id) {
        super(id);
    }


    }



