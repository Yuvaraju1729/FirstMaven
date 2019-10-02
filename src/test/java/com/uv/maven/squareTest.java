package com.uv.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		demoMaven dm = new demoMaven();
		int output=dm.square(5);
		assertEquals(25,output);
	}

}
