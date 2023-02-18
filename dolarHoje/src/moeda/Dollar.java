package moeda;

public class Dollar {
	public double price;
	public double howMany;
	public double totally;
	
	public void precoDollar(double price) {
		this.price = price;
	}
	
	public void amountDollar(double howMany) {
		this.howMany = howMany;
	}
	
	public double convertDollar(double totally) {
		this.totally = this.howMany * this.price;
		return this.totally;
	}
	
	
}
