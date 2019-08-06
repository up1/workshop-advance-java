package day1;

public class XXXService {
	
	private X1Repository x1;
	
	public String todo() {	
		String result1 = x1.get();
		return result1;
	}

	public void setX1(X1Repository x1) {
		this.x1 = x1;
	}

}
