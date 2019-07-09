package Chapter11.Exercise.Ex2;

import java.util.Date;

public class Employee extends Person {
	private String office;
	private String salary;
	private Date dateHired;
	
	
	/**
	 * @return the office
	 */
	public String getOffice() {
		return office;
	}
	/**
	 * @param office the office to set
	 */
	public void setOffice(String office) {
		this.office = office;
	}
	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}
	/**
	 * @return the dateHired
	 */
	public Date getDateHired() {
		return dateHired;
	}
	/**
	 * @param dateHired the dateHired to set
	 */
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	
}
