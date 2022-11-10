import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set radius of a circle: ");
        Circle.radius = scanner.nextInt();
        System.out.println("Area         : " + Math.round(Circle.area()*100.0)/100.0);
        System.out.println("Circumference: " + Math.round(Circle.circumference()*100.0)/100.0);
    }
}