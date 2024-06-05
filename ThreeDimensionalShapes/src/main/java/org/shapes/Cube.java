package org.shapes;

import java.util.Objects;
import org.example.Calculation;

public class Cube extends ThreeDimensionalShape implements Calculation {

  public double sideLength;

  public Cube(double sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public double area() {
    return 6* Math.pow(sideLength, 2);
  }

  @Override
  public double perimeter() {
    return 12 * sideLength;
  }

  public double getSideLength() {
    return sideLength;
  }

  public void setSideLength(double sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cube cube = (Cube) o;
    return Double.compare(cube.sideLength, sideLength) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(sideLength);
  }

  @Override
  public String toString() {
    return "Cube{" +
        "sideLength=" + sideLength +
        '}';
  }
}
