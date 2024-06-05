package org.util;

import org.example.Circle;
import org.example.GeometryFigure;
import org.example.Rectangle;
import org.example.Triangle;

public class FigureStringName {


  public GeometryFigure geometryFigure;

  public FigureStringName(GeometryFigure geometryFigure) {
    this.geometryFigure = geometryFigure;
  }

  public String figures() {
      if (geometryFigure.getClass().equals(Circle.class)) {
        return "круг";
      }
      if (geometryFigure.getClass().equals(Rectangle.class)) {
        return "прямоугольник";
      }
      if (geometryFigure.getClass().equals(Triangle.class)) {
        return "треугольник";
      }
      return "не найдено";
  }
}
