package dogInterface;

public abstract class Animal {

    protected String name;

    public Animal(String name) {

        setName(name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public abstract void speak();
}
