package org.example;


import java.util.Objects;

public class Triangle extends GeometryFigure implements Calculation {


  public double length1;
  public double length2;
  public double length3;
  public double height;

  public Triangle(double length1, double length2, double length3, double height) {
    this.length1 = length1;
    this.length2 = length2;
    this.length3 = length3;
    this.height = height;
  }

  public Triangle(double length1, double height) {
    this.length1 = length1;
    this.height = height;
  }

  @Override
  public double area() {
    return (length1*height)/2;
  }

  @Override
  public double perimeter() {
    return length1+length2+length3;
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

  public double getLength3() {
    return length3;
  }

  public void setLength3(double length3) {
    this.length3 = length3;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Triangle triangle = (Triangle) o;
    return Double.compare(triangle.length1, length1) == 0
        && Double.compare(triangle.length2, length2) == 0
        && Double.compare(triangle.length3, length3) == 0
        && Double.compare(triangle.height, height) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(length1, length2, length3, height);
  }

  @Override
  public String toString() {
    return "Triangle{" +
        "length1=" + length1 +
        ", length2=" + length2 +
        ", length3=" + length3 +
        ", height=" + height +
        '}';
  }
}
