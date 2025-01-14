package coding.practice;

import java.util.Scanner;

public class SwapToNumber {

    public static void   swapNum(int x,int y){

        System.out.println("\n Before swapping x = " + x +"\n Before swapping y = " + y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("\n After swapping x = " + x + "\n After swapping  y = " + y+"\n");
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter X number :");
        int x= sc.nextInt();
        System.out.print("Enter Y number :");
        int y= sc.nextInt();

        swapNum( x, y);
    }
}
