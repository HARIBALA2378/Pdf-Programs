import java.util.Scanner;

public class Q28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int sum = 0;
        int term = 0;
        for (int i = 1; i <= n; i++){
            term = term * 10 + 1;
            sum += term;
        }
        System.out.println("\nThe Sum is: " + sum);
    }
}