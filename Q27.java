import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter first string:");
       String string1=input.nextLine();
       System.out.println("Enter Second string:");
       String string2=input.nextLine();
       System.out.println(string1.indexOf(string2));
    }
}
       