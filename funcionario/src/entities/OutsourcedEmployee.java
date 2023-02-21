package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionaCharge;
	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionaCharge) {
		super(name, hours, valuePerHour);
		this.additionaCharge = additionaCharge;
	}

	public Double getAdditionaCharge() {
		return additionaCharge;
	}

	public void setAdditionaCharge(Double additionaCharge) {
		this.additionaCharge = additionaCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionaCharge * 1.1;
	}
	
	
}
