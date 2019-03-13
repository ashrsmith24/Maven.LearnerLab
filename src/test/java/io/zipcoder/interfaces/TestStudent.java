package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        // Given
        Student student = new Student(24681012);

        // When
        boolean actual = student instanceof Learner;

        // Then
        Assert.assertTrue(actual);
    }
    @Test
    public  void testInheritance(){
        // Given
        Student student = new Student(24681012);

        //Then
        boolean actual = student instanceof  Person;

        //Then

        Assert.assertTrue(actual);

    }
    @Test
    public void testLearn() {
        //Given
        Student student = new Student(24681012);
        double expected = 4;
        //Then
        student.learn(expected);
        double actual = student.getTotalStudyTime();
        //When
        Assert.assertEquals(expected,actual,.001);
    }
}


