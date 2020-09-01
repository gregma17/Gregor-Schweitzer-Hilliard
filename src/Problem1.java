import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in pounds:");
        double pounds = sc.nextDouble();
        double kilos = pounds * 0.453592;
        System.out.println(kilos);
    }
}
