import java.util.Scanner;

public class RightAngleTrianglePattern {

    public static void main(String[] args) {
        System.out.println("Program started \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("*  ");

            }
            System.out.println();
        }
    }
}
