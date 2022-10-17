package ie.atu.week5;
import java.util.Scanner;
public class ShapeApp {
    public static void main(String[] args) {
        //created first  instance of rectangle
        System.out.println("Please Enter The Length Of The Rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        Rectangle shapeRect = new Rectangle();
        shapeRect.setLength(length);
        System.out.println("You Entered : " + shapeRect.getLength());

        System.out.println("Please Enter The Width Of The Rectangle");
        double width = input.nextDouble();
        shapeRect.setWidth(width);
        System.out.println("You Entered : " + shapeRect.getWidth());

            //created second instance of rectangle
            Rectangle shapeRect2 = new Rectangle();
            System.out.println("Please Enter The Length Of The Rectangle");
            double length2 = input.nextDouble();
            shapeRect2.setLength(length2);
            System.out.println("You Entered : " + shapeRect2.getLength());

            System.out.println("Please Enter The Width Of The Rectangle");
            double width2 = input.nextDouble();
            shapeRect2.setWidth(width2);
            System.out.println("You Entered : " + shapeRect2.getWidth());

            Rectangle shapeRect3 = new Rectangle(23, 67);
            System.out.println("You entered for length : " + shapeRect3.getLength());
        System.out.println("You entered for width : " + shapeRect3.getWidth());

    }
}
