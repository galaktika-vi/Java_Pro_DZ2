package zoo;

abstract class Animal {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract void voice();

    void eat(String food) {
        System.out.println(getName() + " ест " + food);
    }

    void jump() {
        System.out.println(getName() + " прыгает");
    }

    void jump(int height) {
        System.out.println(getName() + " прыгает на высоту " + height + " метров");
    }
}
