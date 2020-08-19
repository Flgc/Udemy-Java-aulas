package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	//Standard constructor
	public HourContract() {
	}

	//Arguments constructors generator
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	//Get and Sets generator
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	// Class methods
	
	public double totalValue() {
		return valuePerHour * hours;
	}
	
}
