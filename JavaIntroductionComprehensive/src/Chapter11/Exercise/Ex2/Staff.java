package Chapter11.Exercise.Ex2;

public class Staff extends Employee {
	private String title;
	
	
	@Override
	public String toString() {
		return "Staff 's name is " + this.getName();
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
