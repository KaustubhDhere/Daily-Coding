package coding.practice;

import java.util.Arrays;

public class ReverseString {

    public static void reverseString1(String str) {

        char[] str1 = str.toCharArray();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            char temp = str1[start];
            str1[start] = str1[end];
            str1[end] = temp;

            start++;
            end--;

        }

        System.out.println("ReverseString:  " + new String(str1));
    }


    public static void reverseString2(String str){

        StringBuilder str1 = new StringBuilder();
       str1.append(str);
        System.out.println("Reversing the string using string buider pattern: "+ str1.reverse().toString());

    }

    public static void reverseString3(String str){

        char[] str1=str.toCharArray();

        for(int i = str1.length-1; i >= 0; i--){

            System.out.print(str1[i]);
        }
    }


    public static void main(String[] args) {

        String str = "Hello world";

        System.out.println("str = " + str);
       // ReverseString.reverseString1(str);

//ReverseString.reverseString2(str);
        ReverseString.reverseString3(str);
    }
}
