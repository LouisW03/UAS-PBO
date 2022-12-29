// Shape interface with getArea() method
interface Shape {
    double getArea();
  }
  
  // Abstract Shape class with protected radius field and constructor
  abstract class AbstractShape implements Shape {
    protected double radius;
    
    public AbstractShape(double radius) {
      this.radius = radius;
    }
  }
  
  // Circle class that extends AbstractShape and implements getArea()
  class Circle extends AbstractShape {
    public Circle(double radius) {
      super(radius);
    }
  
    @Override
    public double getArea() {
      return Math.PI * radius * radius;
    }
  }
  
  // Rectangle class that implements Shape and has width and height fields
  class Rectangle implements Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
    }
    
    @Override
    public double getArea() {
      return width * height;
    }
  }