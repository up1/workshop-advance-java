package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test public void 
	sayHi_with_Somkiat_shouldBe_Hello_somkiat() {
		// Arrange
		Hello h = new Hello(); 
		
		// Act 
		String actualResult = h.sayHi("Somkiat");
		
		// Assert
		assertEquals("Hello, somkiat", actualResult);
	}

}
