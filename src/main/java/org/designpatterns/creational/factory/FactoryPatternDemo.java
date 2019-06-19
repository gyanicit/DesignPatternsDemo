package org.designpatterns.creational.factory;
public class FactoryPatternDemo {

   public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();

      //get an object of Circle and call its draw method.
      Shape shape = shapeFactory.getShape("SQUARE");//CIRCLE, RECTANGLE, SQUARE

      //call draw method of Circle
      shape.draw();
   }
}