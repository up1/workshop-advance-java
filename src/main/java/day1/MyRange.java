package day1;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class MyRange {

	private String input;

	public MyRange(String input) {
		this.input = input;
	}

	public boolean startWithInclude() {
		return this.input.startsWith("["); 
	}

	public boolean endWithInclude() {
		return this.input.endsWith("]");
	}

	public int getStart() {
		if(startWithInclude()) {
			return convertFromASCIItoInt(this.input.charAt(1));
		}
		return convertFromASCIItoInt((char) (this.input.charAt(1) + 1));
	}

	private int convertFromASCIItoInt(char _input) {
		return _input - 48;
	}

	public int getEnd() {
		if(endWithInclude()) { 
			return convertFromASCIItoInt(
				this.input.charAt(input.length()-2));
		}
		return convertFromASCIItoInt(
				(char) (this.input.charAt(input.length()-2) -1));
	}

	public String show() {
		String result = "";
		int start = getStart();
		int end = getEnd();
		for (int i = start; i<=end; i++ ) {
			result += i + ",";
		}
		return result;
	}

}
