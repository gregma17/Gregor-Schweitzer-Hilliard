import java.util.Scanner;


public class Problem3 {
    public static void CreateDup (int[] integers){
        int[] dups = new int[5];
        for(int i = 0; i < integers.length; i++){
            dups[i] = 2 * integers[i];
            System.out.print(dups[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        CreateDup(numbers);

    }
}
