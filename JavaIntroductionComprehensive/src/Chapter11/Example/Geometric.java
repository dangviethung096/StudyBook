package Chapter11.Example;
import java.util.Date;

public class Geometric {
	private String color = "white";
	private Date dateCreated;
	private boolean filled;
	
	public Geometric() {
		dateCreated = new Date();
	}
	/**
	 * Constructor with 2 parameter
	 * @param color
	 * @param filled
	 */
	public Geometric(String color, boolean filled) {
		this();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public boolean getFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "Create date : " + dateCreated + ", color = " + color + ", filled = " + filled;
	}
}
