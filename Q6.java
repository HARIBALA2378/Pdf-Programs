import java.util.Scanner;
class Q6{
    public static void main (String[]args){
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int a = input.nextInt();
        System.out.println("Enter the second value:");
        int b = input.nextInt();
        System.out.println(++a-b--);
        System.out.println(a%b++);
        System.out.println(a*=b+5);
        int x=69>>>2;
        System.out.println(x);
    }
}