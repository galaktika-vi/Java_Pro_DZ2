package zoo;

class Cow extends Herbivore {
    public Cow(String name, String color) {
        super(name, color);
    }

    @Override
    void voice() {
        System.out.println(getName() + " мычит");
    }
}
