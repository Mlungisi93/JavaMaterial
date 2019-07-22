package inheritance;

public class UseCollegeCourse {
		
	public static void main(String[] args) {
		System.out.println("CollegeCourse!");
		CollegeCourse course = new CollegeCourse("CollegeCourse Name", 100.00);
		System.out.println("College name = "+course.COLLEGE_NAME);
		System.out.println("CollegeCourse name = "+course.getName());
		System.out.println("CollegeCourse price = "+course.getPrice());
		System.out.println("CollegeCourse price with VAT = "+course.computePrice());
		
		System.out.println("\nLab!");
		Lab lab = new Lab("Lab Name", 100.00);
		System.out.println("College name = "+lab.COLLEGE_NAME);
		System.out.println("Lab name = "+lab.getName());
		System.out.println("Lab price = "+lab.getPrice());
		System.out.println("Lab price with VAT = "+lab.computePrice());
		}
}

class CollegeCourse{

	private String name ;
	private double price;
	protected final String COLLEGE_NAME = "My College's Name";
	
	public CollegeCourse(String name, double price){
		setName(name);
		setPrice(price);
		System.out.println("CollegeCourse constructor called.");
	}
	
	public final String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double computePrice(){
		return price*1.15;
	}
}

class Lab extends CollegeCourse{

	public Lab(String name, double price){
		super(name, price);
		System.out.println("Lab constructor called.");
	}
	
	public double computePrice(){
		return super.computePrice()+25;
	}

}