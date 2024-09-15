import java.util.Scanner;

public class Q29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range:");
        int row = input.nextInt();
        for(int i = 0;i<row;i++){
            for(int j = 0;j<row;j++){
                if(i == 0 || i == row - 1 || j == 0)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}