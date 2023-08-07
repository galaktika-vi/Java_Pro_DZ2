package zoo;

public class ZooTest {
    public static void main(String[] args) {
        Animal lion = new Predator("Лев", "Желтый");
        Animal zebra = new Herbivore("Зебра", "Черно-белая");
        Animal tom = new Cat("Том", "Серый");
        Animal fido = new Dog("Фидо", "Коричневый");
        Animal betsy = new Cow("Бетси", "Черно-белый");
        Animal mary = new Lamb("Мэри", "Белый");

        lion.voice();
        lion.eat("мясо");
        lion.jump();

        zebra.voice();
        zebra.eat("трава");
        zebra.jump(2);

        tom.voice();
        tom.eat("рыба");
        tom.jump(1);

        fido.voice();
        fido.eat("кость");
        fido.jump(3);

        betsy.voice();
        betsy.eat("трава");
        betsy.jump();

        mary.voice();
        mary.eat("трава");
        mary.jump();
    }
}
