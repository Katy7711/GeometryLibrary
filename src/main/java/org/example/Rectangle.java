package org.example;


import java.util.Objects;

public class Rectangle extends GeometryFigure implements Calculation {


  public double length1;
  public double length2;

  public Rectangle(double length1, double length2) {
    this.length1 = length1;
    this.length2 = length2;
  }

  @Override
  public double area() {
    return length1*length2;
  }

  @Override
  public double perimeter() {
    return (length1+length2)*2;
  }

  public double getLength1() {
    return length1;
  }

  public void setLength1(double length1) {
    this.length1 = length1;
  }

  public double getLength2() {
    return length2;
  }

  public void setLength2(double length2) {
    this.length2 = length2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return Double.compare(rectangle.length1, length1) == 0
        && Double.compare(rectangle.length2, length2) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(length1, length2);
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "length1=" + length1 +
        ", length2=" + length2 +
        '}';
  }
}
