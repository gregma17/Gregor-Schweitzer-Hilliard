import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.println("Enter 3 integers: ");
        for (int i = 0; i <numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max)
            max = numbers[i];
        }

        System.out.print(max);

    }
}
