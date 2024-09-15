import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char charat = scanner.next().charAt(0);
        int asciiValue = (int) charat;
        System.out.println("The ASCII value of " + charat + " is " + asciiValue);
    }
}