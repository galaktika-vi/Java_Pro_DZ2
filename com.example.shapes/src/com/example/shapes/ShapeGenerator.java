package com.example.shapes;

import java.util.Random;

public class ShapeGenerator {
    public void generate() {
        Random random = new Random();
        int shapeType = random.nextInt(3); // Случайное число от 0 до 2

        if (shapeType == 0) {
            Circle circle = new Circle();
            circle.draw();
        } else if (shapeType == 1) {
            Square square = new Square();
            square.draw();
        } else if (shapeType == 2) {
            Triangle triangle = new Triangle();
            triangle.draw();
        } else {
            System.out.println("Неизвестный тип фигуры.");
        }
    }
}
