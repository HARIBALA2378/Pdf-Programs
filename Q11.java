import java.util.Scanner;
public class Q11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = scanner.next();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                int numStart = i + 1;
                StringBuilder numStr = new StringBuilder();
                while (numStart < input.length() && Character.isDigit(input.charAt(numStart))) {
                    numStr.append(input.charAt(numStart));
                    numStart++;
                }
                int repeatCount = Integer.parseInt(numStr.toString());
                for (int j = 0; j < repeatCount; j++) {
                    result.append(ch);
                }
                i = numStart - 1;
            }
        }
        System.out.println(result.toString());
  }
}