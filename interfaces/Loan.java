package interfaces;

public abstract class Loan {
    protected String type;
    protected double cost;

    public Loan(String type)
    {
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public abstract void setCost();


}
