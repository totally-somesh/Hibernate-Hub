package pojos;

public enum Course {
DAC(1050000),DMC(10000),DITISS(90000),DBDA(80000);

	
	private double fees;

	private Course(double fees) {
		this.fees = fees;
	}
	
}