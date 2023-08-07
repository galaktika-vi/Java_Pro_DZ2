package zoo;

class Herbivore extends Animal {
    public Herbivore(String name, String color) {
        super(name, color);
    }

    @Override
    void voice() {
        System.out.println(getName() + " издает звуки");
    }

    @Override
    void eat(String food) {
        if (food.equals("мясо")) {
            System.out.println(getName() + " не может есть мясо, он травоядное!");
        } else {
            System.out.println(getName() + " ест " + food);
        }
    }
}
