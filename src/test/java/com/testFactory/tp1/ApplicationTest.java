package com.testFactory.tp1;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

	@Test
	public void test() {
		int i=2, j=3;
		int k = Application.add(i, j);
		
		Assert.assertEquals("Erreur ", k, 5);
	}

}
