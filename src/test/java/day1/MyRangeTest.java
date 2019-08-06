package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyRangeTest { 
	
	@Test public void 
	case_01() {
		MyRange range = new MyRange("[1,5]");
		assertEquals("1,2,3,4,5,", range.show());  
	}
	
	@Test public void 
	end_with_include_and_5_should_return_5() {
		MyRange range = new MyRange("[1,5]");
		assertEquals(5, range.getEnd());  
	}
	
	@Test public void 
	end_with_exclude_and_5_should_return_4() {
		MyRange range = new MyRange("[1,5)");
		assertEquals(4, range.getEnd()); 
	}
	
	@Test public void 
	start_with_include_and_1_should_return_1() {
		MyRange range = new MyRange("[1,5]");
		assertEquals(1, range.getStart()); 
	}
	
	@Test public void 
	start_with_exclude_and_1_should_return_2() {
		MyRange range = new MyRange("(1,5]");
		assertEquals(2, range.getStart()); 
	}

	@Test public void 
	start_with_include() {
		MyRange range = new MyRange("[1,5]");
		assertTrue(range.startWithInclude()); 
	}
	
	@Test public void 
	start_with_exclude() {
		MyRange range = new MyRange("(1,5]");
		assertFalse(range.startWithInclude());
	}
	
	@Test public void 
	end_with_include() {
		MyRange range = new MyRange("[1,5]");
		assertTrue(range.endWithInclude());
	}
	
	@Test public void 
	end_with_exclude() {
		MyRange range = new MyRange("[1,5)");
		assertFalse(range.endWithInclude());
	}

}
