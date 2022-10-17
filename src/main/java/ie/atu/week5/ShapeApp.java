package ie.atu.week5;
import java.util.Scanner;
public class ShapeApp {
    public static void main(String[] args) {
        System.out.println("Please Enter The Width Of The Rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("You Entered : " + length);
    }
}
