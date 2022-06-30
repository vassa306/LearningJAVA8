package StringPlaying;

import java.util.Scanner;

public class StringReverse {

    public static String reverseStrings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your string value: \n");
        String a = sc.nextLine();
        String s = "";
        if (s == null) {
            System.out.println("String is null");
        } else {
            for (int i = a.length() - 1; i >= 0; i--) {
                s = s + a.charAt(i);
            }

        }
        return s;

    }
    public static void isPalidrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your string value:");
        String a = sc.nextLine();
            if (a.equalsIgnoreCase(reverseStrings())) {
                System.out.println("is Palidrome");
            } else {
                System.out.println("is not palidrome");
            }
        }

    public static void returnStringLength(String s){
        System.out.println( "length: " + s.length());
    }


    public static void main(String[] args) {
        reverseStrings();
        isPalidrome();
        returnStringLength("car");

    }
}



