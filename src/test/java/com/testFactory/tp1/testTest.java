package com.testFactory.tp1;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class testTest {

	@Test
	void test() {
		int i=3 , j=3;
		
		int k = test.add(i,j);
		
		Assert.assertEquals("Erreur!! ", k, 6); 
		
		
	}

}
