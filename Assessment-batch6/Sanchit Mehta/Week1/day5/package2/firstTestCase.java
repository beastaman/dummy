package com.package2;

import static org.junit.jupiter.api.Assertions.*;
import com.package2.ClassToBeTested;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class firstTestCase {

	private static final Executable IndexOutOfBoundsException = null;
	@Test
	void shouldReturnMaxValue_whenInvoked() {
		assertEquals(5,ClassToBeTested.findMax(new int[] {1,3,2,4,5}));
		
	}
	@Test
	void shouldReturnMinValue_whenInvoked() {
		assertEquals(1,ClassToBeTested.findMin(new int[] {1,3,2,4,5}));
	}
	@Test
	void shouldThrowException_whenInvoked(){
		assertThrows(ClassToBeTested.access(new int[] {1,2,3,4},5),IndexOutOfBoundsException);
	}

	

}
