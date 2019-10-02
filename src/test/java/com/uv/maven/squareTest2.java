package com.uv.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest2 {

	@Test
	public void test() {
		demoMaven dm = new demoMaven();
		int output=dm.square(3);
		assertEquals(9,output);
	}

}
