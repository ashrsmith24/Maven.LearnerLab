package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    LEON("Leon", 1), KRIS("Kris", 2), WIL("Wil", 3), NHU("Nhu", 4);


    final Instructor instructor;
    double timeTheyWork = 0;

    Educator(String name, long id) {
        instructor = new Instructor(id);
        instructor.setName(name);
        Instructors.getInstance().add(instructor);
    }

    private Instructor setName(String name) {
        return setName(name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeTheyWork += numberOfHours;
    }


    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeTheyWork += numberOfHours;


    }
}