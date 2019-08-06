package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircularBufferTest { 
	
	@Test public void 
	create_buffer_with_size_2_and_add_AB_should_be_full() {
		CircularBuffer buffer = new CircularBuffer();
		buffer.create(2);
		buffer.add("A");
		buffer.add("B");
		assertTrue("Buffer ต้องเต็มนะ", buffer.isFull());
	}
	
	@Test public void 
	create_buffer_with_size_2_and_add_A_should_be_not_full() {
		CircularBuffer buffer = new CircularBuffer();
		buffer.create(2);
		buffer.add("A");
		assertFalse("Buffer ต้องไม่เต็มนะ", buffer.isFull());
	}
	
	@Test public void 
	create_buffer_add_AB_and_read_AB_should_empty() {
		CircularBuffer buffer = new CircularBuffer();
		buffer.create(10);
		buffer.add("A");
		buffer.add("B");
		buffer.read();
		buffer.read();
		assertTrue("Buffer ต้องว่างนะ", buffer.isEmpty());
	}
	
	@Test public void 
	create_buffer_add_AB_and_read_A_should_not_empty() {
		CircularBuffer buffer = new CircularBuffer();
		buffer.create(10);
		buffer.add("A");
		buffer.add("B");
		buffer.read();
		assertFalse("Buffer ต้องไม่ว่างนะ", buffer.isEmpty());
	}
	
	@Test public void 
	create_buffer_add_AB_should_read_AB() {
		CircularBuffer buffer = new CircularBuffer();
		buffer.create(10);
		buffer.add("A");
		buffer.add("B");
		assertEquals("A", buffer.read());
		assertEquals("B", buffer.read());
	}
	
	@Test public void 
	create_buffer_add_A_should_read_A() {
		CircularBuffer buffer = new CircularBuffer();
		buffer.create(10);
		buffer.add("A");
		assertEquals("A", buffer.read());
	}

	@Test public void 
	create_with_size_10_should_be_size_10() {
		CircularBuffer buffer = new CircularBuffer();
		buffer.create(10);
		int actualSize = buffer.size();
		assertEquals(10, actualSize);
	}
	
	@Test public void 
	create_with_size_10_should_be_empty() {
		CircularBuffer buffer = new CircularBuffer();
		buffer.create(10);
		assertTrue("Buffer ต้องว่างนะ", buffer.isEmpty());
	}

}
