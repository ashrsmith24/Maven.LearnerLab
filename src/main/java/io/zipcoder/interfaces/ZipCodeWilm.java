package io.zipcoder.interfaces;

public class ZipCodeWilm {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();
    private final static ZipCodeWilm INSTANCE = new ZipCodeWilm();


    private ZipCodeWilm() {}

    public void hostLecture(Teacher teacher, double numberOfHours){
       teacher.lecture(students.getArray(), numberOfHours);
    }
    public void hostLecture(long id, double numberOfHours){
            Teacher teacher = instructors.findById(id);
           hostLecture(teacher,numberOfHours);
    }
    public void hostLecture(Educator educator, double numberOfHours){
            educator.lecture(students.getArray(),numberOfHours);
    }

    public static ZipCodeWilm getInstance(){
        return INSTANCE;
    }

    public Students getStudents() {
        return students;
    }

}