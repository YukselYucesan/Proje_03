package task01;

import java.util.Scanner;

public class LetterConversion {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.print("A sentence = ");
        String sentence= read.nextLine();
        String big= CapitalLetterFormat(sentence);
        System.out.println("big = " + big);
        System.out.println("Capital Letter Format = " + CapitalLetterFormat(sentence));
        System.out.println("Lowercase Format = " + LowercaseFormat(sentence));
    }
    public static String CapitalLetterFormat(String str){
        return str.toUpperCase();
    }
    public static String LowercaseFormat(String str){
        return str.toLowerCase();
    }
}
