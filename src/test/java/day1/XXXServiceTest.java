package day1;

import static org.junit.Assert.*;

import org.junit.Test;

class StubX1 implements X1Repository {
	public String get() {
		return "somkiat";
	}
}

class SpyX1 implements X1Repository {
	boolean called = false;
	public String get() {
		called = true;
		return "xxxx";
	}
}

public class XXXServiceTest {
	
	@Test
	public void test_spy() {
		SpyX1 spyX1 = new SpyX1();
		 
		XXXService service = new XXXService(); // Constructor injection
		service.setX1(spyX1); // Property/setter injection
		service.todo(); // Method injection
		assertTrue(spyX1.called);
	}

	@Test
	public void test() {
		X1Repository stubX1 = new StubX1();
		 
		XXXService service = new XXXService(); // Constructor injection
		service.setX1(stubX1); // Property/setter injection
		String result = service.todo(); // Method injection
		assertEquals("somkiat", result);
	}

}
