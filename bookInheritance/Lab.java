package bookInheritance;

public class Lab extends CollegeCourse {

    public Lab(String name, double price)
    {
        super(name, price);

    }

    @Override
    public double computePrice()
    {
        return  super.computePrice() + 25;
    }
}
