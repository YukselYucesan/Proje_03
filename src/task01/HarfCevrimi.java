package task01;

import java.util.Scanner;

public class HarfCevrimi {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.print("A sentence = ");
        String sentence= read.nextLine();
        String big=buyukHarfFormati(sentence);
        System.out.println("big = " + big);
        System.out.println("BÜYÜK HARF FORMATI = " + buyukHarfFormati(sentence));
        System.out.println("küçük harf formatı = " + kucukHarfFormati(sentence));
    }
    public static String buyukHarfFormati(String str){
        return str.toUpperCase();
    }
    public static String kucukHarfFormati(String str){
        return str.toLowerCase();
    }
}
