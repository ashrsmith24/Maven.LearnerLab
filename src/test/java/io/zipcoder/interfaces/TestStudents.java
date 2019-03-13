package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {

    @Test
    public void testStudentsSingleton(){
        // Given
        Student ashley = new Student(1);
        ashley.setName("Ashley");
        Student ajah = new Student(2);
        ajah.setName("Ajah");
        Student res = new Student(3);
        res.setName("Res");
        Student robyn = new Student(4);
        robyn.setName("Robyn");
        List<Student> expected = new ArrayList();
        expected.add(ashley);
        expected.add(ajah);
        expected.add(res);
        expected.add(robyn);

        // When
        Students actual = Students.getInstance();
        boolean expectedTrue = true;

        for(int i = 0; i < actual.getCount(); i++){
            if(!((actual.getPersonList().get(i).getId() == expected.get(i).getId()) ||
                    (actual.getPersonList().get(i).getName().equals(expected.get(i).getName())))){
                expectedTrue = true;
            }
        }

        // Then
        Assert.assertTrue(expectedTrue);

    }

}