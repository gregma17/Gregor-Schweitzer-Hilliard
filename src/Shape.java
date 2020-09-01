import java.util.Scanner;

public class Shape {
    public static void main(String[] args){
        Circle A = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        A.setRadius(radius);

        Points B = new Points();

        System.out.print("Enter x coordinate: ");
        double x = sc.nextDouble();
        B.setX(x);
        System.out.print("Enter Y coordinate: ");
        double y = sc.nextDouble();
        B.setY(y);
        A.computeArea();
    }
}
