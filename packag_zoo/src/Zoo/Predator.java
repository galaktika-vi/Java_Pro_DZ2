package zoo;

class Predator extends Animal {
    public Predator(String name, String color) {
        super(name, color);
    }

    @Override
    void voice() {
        System.out.println(getName() + " рычит");
    }

    @Override
    void eat(String food) {
        if (food.equals("мясо")) {
            System.out.println(getName() + " не может есть мясо, он хищник!");
        } else {
            System.out.println(getName() + " ест " + food);
        }
    }
}
