package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {

    @Test
    public void getInstanceTest() {
        Instructors instructors = Instructors.getInstance();
        Integer expected = 4;

        Integer actual = instructors.personList.size();

        Assert.assertEquals(expected,actual);
    }

}

