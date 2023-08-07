package zoo;

class Cat extends Predator {
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    void voice() {
        System.out.println(getName() + " мяукает");
    }
}
