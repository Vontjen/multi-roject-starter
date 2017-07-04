package com.realdolmen.greeting.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by vdabcursist on 04/07/2017.
 */
public class EmployeeTest {

    @Test
    public void shouldWork(){
        assertEquals(true,true);
    }

    @Test
    public void letsTryThis(){
        Employee employee = new Employee();
        assertNotNull(employee);
    }
}
