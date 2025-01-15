import java.util.Scanner;

/**
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 */
public class ReverseRightAngleTrianglePatternUsingNumber {

    public static void main(String[] args) {

        System.out.println("Program started \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
