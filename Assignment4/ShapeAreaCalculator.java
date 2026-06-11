public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        shape[0] = new Rectangle(5, 10);
        shape[1] = new Circle(5);
        shape[2] = new Triangle(5, 10);

        for (Shape sh : shape){
            sh.calculateArea();
        }
    }
}

abstract class Shape{
    public abstract void calculateArea();
}

class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle: " +  (length * breadth));
    }
}

class Circle extends Shape{
    int radius;

    public Circle(int r){
      this.radius = r;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius) );
    }
}

class Triangle extends Shape{
    int height;
    int breadth;

    public Triangle(int h, int b){
        this.height = h;
        this.breadth = b;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of triangle: " + ((height * breadth)/2));
    }
}
