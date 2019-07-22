package bookInheritance;

public class CollegeCourse {
    private double price;
    private String name;
    protected final String COLLEGE_NAME = "Rosebank College";

    public double computePrice()
    {
        return  price * 1.15;
    }

    public CollegeCourse(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    public final String getName(){
        return  COLLEGE_NAME;
    }



    public void setPrice(double price) {
        this.price = price;
    }
    public String getCourseName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
