package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperationTest {

	@Test
	void testAdd() {
		Operation op = new Operation();
		int result = op.add(100, 200);
		assertEquals(300, result);
	}

	@Test
	void testSub() {
		Operation op = new Operation();
		int result = op.sub(200, 100);
		assertEquals(100, result);
	}

}
