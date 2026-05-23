public class Question4 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 15);
        Rectangle rect2 = new Rectangle(20, 15);
        Rectangle rect3 = new Rectangle(5, 6);

        System.out.println("Area of " + rect1.length + " x " + rect1.width + " rectangle = " + rect1.calculateArea());
        System.out.println("Area of " + rect1.length + " x " + rect2.width + " rectangle = " + rect2.calculateArea());
        System.out.println("Area of " + rect1.length + " x " + rect3.width + " rectangle = " + rect3.calculateArea());
    }
}

class Rectangle{
    int length;
    int width;

    public Rectangle(int len, int wid){
        this.length = len;
        this.width = wid;
    }

    public int calculateArea(){
        return length * width;
    }
}
