package ch06;

	class Birthday1 {

	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class Birthday {
	public static void main(String args[]) {
		Birthday1 bday = new Birthday1();
		bday.setYear(2000);
		System.out.println(bday);
		bday.printThis();
		
		System.out.println('1'+'2');
	}
}