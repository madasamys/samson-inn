package org.jeyam.samson.consumer.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author: madasamy
 * @version: 0.1
 */
public class StudentTest
{

    private Student student;

    @Before
    public void setUp()
    {
        student = new Student("foo", "bar", 23);
    }

    @Test
    public void testToString()
    {
        System.out.println("--setUp--");
        String result = student.toString();
        assertTrue(result.contains("foo"));
    }


}
