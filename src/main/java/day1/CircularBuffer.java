package day1;

public class CircularBuffer {

	private String[] buffer;
	private int writePointer;
	private int readPointer;

	public void create(int size) {
		buffer = new String[size];
	}

	public int size() {
		return buffer.length; 
	}

	public boolean isEmpty() {
		return readPointer == writePointer;
	}

	public void add(String input) {
		buffer[writePointer++] = input;
	}

	public String read() {
		return buffer[readPointer++];
	}

	public boolean isFull() {
		return writePointer - readPointer == size();
	}

}
