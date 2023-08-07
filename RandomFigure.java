import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

abstract class Shape {
    abstract void draw();
}

abstract class Shape3D extends Shape {
    abstract double volume();
}

class Circle extends Shape3D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Отрисовка круга.");
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * 0; // здесь у меня объем круга в трехмерном пространстве равен 0
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Отрисовка квадрата.");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Отрисовка треугольника.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Отрисовка прямоугольника.");
    }
}

class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Отрисовка куба.");
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

class Cylinder extends Shape3D {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Отрисовка цилиндра.");
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class RandomFigure {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Random random = new Random();

        // здесь я генерирую случайные значения для сторон прямоугольника
        double rectangleSideA = random.nextDouble() * 10;
        double rectangleSideB = random.nextDouble() * 10;

        // Генерируем случайные значения для куба и цилиндра
        double cubeSide = random.nextDouble() * 10;
        double cylinderHeight = random.nextDouble() * 10;
        double cylinderRadius = random.nextDouble() * 5;

        shapes.add(new Circle(random.nextDouble() * 5));
        shapes.add(new Square());
        shapes.add(new Triangle());
        shapes.add(new Rectangle());
        shapes.add(new Cube(cubeSide));
        shapes.add(new Cylinder(cylinderHeight, cylinderRadius));

        // здесь я перемешиваю порядок вывода фигур
        Collections.shuffle(shapes);

        for (Shape shape : shapes) {
            shape.draw();

            if (shape instanceof Shape3D) {
                Shape3D shape3D = (Shape3D) shape;
                System.out.println("Объем фигуры: " + shape3D.volume());
            }
        }
    }
}
