package org.util;

import org.example.Circle;
import org.example.Rectangle;
import org.example.Triangle;

public class Main {

  public static void main(String[] args) {
    Circle circle = new Circle(5);
    Circle circle1 = new Circle(10);
    Triangle triangle = new Triangle(5, 5);
    Triangle triangle1 = new Triangle(5, 5);
    Rectangle rectangle = new Rectangle(1, 2);
    FigureStringName figureStringName = new FigureStringName(circle1);
    System.out.println(figureStringName.figures());

  }
}