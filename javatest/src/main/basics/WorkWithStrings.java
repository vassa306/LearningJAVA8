package main.basics;


import java.util.Locale;

public class WorkWithStrings {
    public static void main(String[] args) {
        String s = " Hello worlds ";
        String a = "Hello Earth ";

        CheckStringContent(s);
        toUppercase(s);
        toLowerCase(s);
        // if String is lesser than int position java threw out of bounds exception
        checkCharPosition(a,10);
    }

   public static void checkCharPosition(String a, int position) {
        String upper = a.trim().toUpperCase();
        String pos = String.valueOf(a.charAt(position));
        StringBuilder builder = new StringBuilder();
        builder.append("this is result" + "\n").append(pos);
        System.out.println(builder.toString());
    }

    public static void toUppercase(String a) {
        String upper = a.trim().toUpperCase();
        System.out.print("string to uppercase is " + upper);
    }

    public static void toLowerCase(String a) {
        String lower = a.trim().toLowerCase();
        System.out.print("string to lowercase is " + lower);
    }

    public static void CheckStringContent(String s) {
        int i = s.trim().length();
        //    int b = s.trim().length();
        boolean a = s.contains("e");
        String o = s.replace("e", "s");
        System.out.print(i + "contains e: " + a + " replace " + o + " length without space ");
    }

}

