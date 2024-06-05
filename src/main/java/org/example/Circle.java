package org.example;


import static org.example.Constant.P;

import java.util.Objects;

public class Circle extends GeometryFigure implements Calculation {

  private double r;

  public Circle(double r) {
    this.r = r;
  }

  @Override
  public double area() {
    return (P * Math.pow(r, 2));
  }

  @Override
  public double perimeter() {
    return 2 * P * r;
  }

  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Circle circle = (Circle) o;
    return Double.compare(circle.r, r) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(r);
  }

  @Override
  public String toString() {
    return "Circle{" +
        "r=" + r +
        '}';
  }
}
