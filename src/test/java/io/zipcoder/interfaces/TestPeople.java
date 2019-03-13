package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    Student ajah;

    @Before
    public void setUp() {
        ajah = new Student(4);
        ajah.setName("Ajah");
    }

    @Test
    public void testAdd() {
        // Given
        List<Student> expected = new ArrayList();
        Students people = Students.getInstance();
        for(Student student : people.getPersonList()){
            expected.add(student);
        }
        expected.add(ajah);

        // When
        people.add(ajah);
        List<Student> actual = people.getPersonList();

        // Then
        Assert.assertEquals(expected, actual);
        people.remove(ajah);

    }

    @Test
    public void testRemoveByPerson() {
        // Given
        List<Student> expected = new ArrayList();
        Students people = Students.getInstance();
        for(Student student : people.getPersonList()){
            expected.add(student);
        }
        Student ashley = expected.get(3);
        expected.remove(ashley);

        // When
        people.remove(ashley);
        List<Student> actual = people.getPersonList();

        //Then
        Assert.assertEquals(expected, actual);
        people.add(ashley);
    }


    @Test
    public void testRemoveById() {
        // Given
        List<Student> expected = new ArrayList();
        Students people = Students.getInstance();
        for(Student student : people.getPersonList()){
            expected.add(student);
        }
        Student ashley = expected.get(3);
        expected.remove(ashley);

        // When
        people.remove(4);
        List<Student> actual = people.getPersonList();

        //Then
        Assert.assertEquals(expected, actual);
        people.add(ashley);
    }
    @Test
    public void testFindById() {
        // Given
        Instructors people = Instructors.getInstance();
        Person expected = people.getPersonList().get(2);

        // When
        Person actual = people.findById(3);

        // Then
        Assert.assertEquals(expected, actual);

    }
}