import java.util.Scanner;

public class ReverseRightAngleTrianglePattern {

    public static void main(String[] args) {

        System.out.println("Program started \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {

            for (int j = n; j > n - i; j--) {

                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
