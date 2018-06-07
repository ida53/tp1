package com.appfactory.tp1;

import org.junit.Assert;
import org.junit.Test;

import com.appfactory.tp1.Application;

public class ApplicationTest {

	@Test
	public void test() {
		final int i=2, j=3;
		final int k = Application.add(i, j);
		
		Assert.assertEquals("Erreur ", k, 5);
	}

}
