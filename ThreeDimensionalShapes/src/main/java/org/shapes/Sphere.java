package org.shapes;

import static org.example.Constant.P;

import java.util.Objects;
import org.example.Calculation;

public class Sphere extends ThreeDimensionalShape implements Calculation {


  public double radius;

  public Sphere(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return 4 * P * Math.pow(radius, 2);
  }

  @Override
  public double perimeter() {
    return 2 * P * radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sphere sphere = (Sphere) o;
    return Double.compare(sphere.radius, radius) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(radius);
  }

  @Override
  public String toString() {
    return "Sphere{" +
        "radius=" + radius +
        '}';
  }
}
