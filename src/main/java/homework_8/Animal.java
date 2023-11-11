package homework_8;

public abstract class Animal {
    private String name;
    private String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    void introduction(){
        System.out.println("My name is " + name + ". I am " + color);
    }
    protected abstract void voice();
}
