package zoo;

class Dog extends Predator {
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    void voice() {
        System.out.println(getName() + " лает");
    }
}
