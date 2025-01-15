import java.util.Scanner;

public class RightAngleTrianglePatternWithSameNumber {
    public static void main(String[] args) {
        System.out.println("Program started \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
