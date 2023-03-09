package assignment_F1_streams;
import java.util.function.Supplier;
class Rectangle{
    int length=0;
    int width=0;

    public Rectangle(int length, int width) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {

    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }

    public int getArea(){
        return width*length;
    }
}



public class Question4 {
        public static void main(String[] args) {
            Supplier<Rectangle> rectangleFactory = Rectangle::new;
            Rectangle rectangle = rectangleFactory.get();
            rectangle.width = 5;
            rectangle.length = 10;
            System.out.println("Width: " + rectangle.getWidth() + ", Height: " + rectangle.getLength() +
                    ", Area: " + rectangle.getArea());
        }


}
