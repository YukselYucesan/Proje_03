package task02;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.print("A string = ");
        String input= read.nextLine().trim();
        if (isPalindrom(input)) System.out.println("The entered string is polyndromic");
        else System.out.println("The entered string is not polyndromic ");
    }
    public static boolean isPalindrom(String str){
        String opposite="";
        for (int i = str.length()-1; i >= 0; i--) {
            opposite = opposite.concat(String.valueOf(str.charAt(i)));
        }
        return (str.equalsIgnoreCase(opposite));
    }
}
