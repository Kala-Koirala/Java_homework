public class Question9 {
    public static void main(String[] args) {
        Circle c1 = new Circle(12.5);
        Circle c2 = new Circle(6.7);
        System.out.printf("Circumference of circle of radius " + c1.radius + " = %.2f\n",  c1.calcualteCircumference());
        System.out.printf("Area of circle of radius " + c1.radius + " = %.2f\n",  c1.calculateArea());

        System.out.printf("Circumference of circle of radius " + c2.radius + " = %.2f\n", c2.calcualteCircumference());
        System.out.printf("Circumference of circle of radius " + c2.radius + " = %.2f\n", c1.calculateArea());
    }
}

class Circle{
    final double PI = 3.14159;
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calcualteCircumference(){
        return 2 * PI * radius;
    }

    public double calculateArea(){
        return PI * radius *radius;
    }
}