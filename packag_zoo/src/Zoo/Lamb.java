package zoo;

class Lamb extends Herbivore {
    public Lamb(String name, String color) {
        super(name, color);
    }

    @Override
    void voice() {
        System.out.println(getName() + " блеет");
    }
}
