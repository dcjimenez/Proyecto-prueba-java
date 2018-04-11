package tests;

import org.junit.Assert;
import org.junit.Test;
import hola.MyClass;

public class Testing {


	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
		MyClass tester = new MyClass(); // MyClass is tested
				
		// assert statements
		Assert.assertEquals(0, tester.multiply(10, 0));
		Assert.assertEquals(0, tester.multiply(0, 10));
		Assert.assertEquals(0, tester.multiply(0, 0));
	}
	
	@Test
	public void addNumbersTest() {
		MyClass tester = new MyClass(); // MyClass is tested

		// assert statements
		Assert.assertEquals(3, tester.addNumbers(1, 2));		
	}


}
