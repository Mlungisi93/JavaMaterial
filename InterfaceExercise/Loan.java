package InterfaceExercise;

public abstract class Loan {
    private String type;
    protected double cost;

    public Loan(String type)
    {
        setType(type);
    }
    public abstract void setCost();

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }
}
