package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = addtionalCharge;
	}

	public Double getAddtionalCharge() {
		return additionalCharge;
	}

	public void setAddtionalCharge(Double addtionalCharge) {
		this.additionalCharge = addtionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;		// A formula do pagamento da super classe + Acréssimo de 110%
	}
	
	
}
