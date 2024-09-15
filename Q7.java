import java.util.Scanner;
class Q7{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  value:");
        int a = input.nextInt();
        System.out.println(a+=a++ + ++a + --a + a--);
    }
}