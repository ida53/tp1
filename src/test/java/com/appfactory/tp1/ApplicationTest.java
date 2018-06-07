package com.appfactory.tp1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.appfactory.tp1.Application;

public class ApplicationTest {	

    @Before
    public void setup() {
        System.out.println("Pre-test");
    }

    @After
    public void teardown() {

    }

	@Test
	public void test() {
		final int i=2, j=3;
		final int k = Application.add(i, j);		
		Assert.assertEquals("Erreur ", k, 5);
	}

}
