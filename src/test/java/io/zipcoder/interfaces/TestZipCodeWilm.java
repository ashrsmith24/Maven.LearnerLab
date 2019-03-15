package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilm {
    @Test
    public void testHostLectureWithTeacher() {
        // Given
        ZipCodeWilm zcw = ZipCodeWilm.getInstance();

        Students expected = Students.getInstance();
        for (Student student : expected.getArray()) {
            student.learn(5);
        }

        Instructor instructor = new Instructor(1L);

        // When
        zcw.hostLecture(instructor, 20);
        Students actual = zcw.getStudents();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testHostLectureWithId(){
        // Given
        ZipCodeWilm zcw = ZipCodeWilm.getInstance();
        Students expected = Students.getInstance();
        for (Student student : expected.getArray()) {
            student.learn(4);
        }

        // When
        zcw.hostLecture(1, 20);
        Students actual =   zcw.getStudents();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testHostLectureWithEducator(){
        // Given
        ZipCodeWilm zcw = ZipCodeWilm.getInstance();
        Students expected = Students.getInstance();
        for (Student student : expected.getArray()) {
            student.learn(5);
        }

        // When
        zcw.hostLecture(Educator.NHU, 20);
        Students actual = zcw.getStudents();

        // Then
        Assert.assertEquals(expected, actual);

    }
}
