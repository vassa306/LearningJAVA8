package main.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class numbers {
    static int generateNumber(int max) {
        return (int) Math.round(Math.random() * max);
    }

    static List<Integer> generateList(int count, int max) {
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            array.add(generateNumber(max));
        }
        return array;
    }

    //prochazeni listu
    static void numberInInterval(List<Integer> list, int min, int max, int expected) {
        List<Integer> indexes = new ArrayList<Integer>();
        List<Integer> array = new ArrayList<Integer>();

        for (int number :
                list) {
            if (number <= max && number > min) {
                indexes.add(number);
                for (int i : indexes) {
                    //System.out.println("this is numbers in interval" + i);
                    if (i == max) {
                        System.out.println("max value found in list: " + i);
                    } else {
                        System.out.println("");
                    }
                    if (i == expected) {
                        i = i - 1;
                        System.out.println("expected value found in list: " + i);
                    }
                }
            }
        }
    }
   // if x > pole get i  x = list.get(i) it means min value found
    public static int minNumber(List<Integer>list) {
        int x = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (x > list.get(i)){
                x = list.get(i);
            }
        }
        return x;
    }

    public static void minNumberVypis(List<Integer>list){
        System.out.println("nejmensi cislo je " + minNumber(list));

    }

    // Function to demonstrate printing pattern
    public static void printTriangle(int n) {
        int rows = 10, i, space, star = 0;

        for (i = 1; i <= rows; i++) {
            // Printing spaces

            for (space = 1; space <= rows - i; space++) {

              System.out.print(" / ");
            }
            while (star != (2 * i - 1)) {
                System.out.print("*");
                star++;

            }
            star = 0;
            // move to next row
            System.out.print("\n");
        }


    }

    public static void printDiamond(){
        //pocet radku
        int row = 10;
        //pocet iteraci sloupce
        int i;
        //pocet radku
        int j;
        int space = row -1;

        for (j = 1; j<= row; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 3; i++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
       space = 1;
        for (j = 1; j<= row - 1; j++)
       {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
           space++;

               for (i = 1; i<= 2 * (row - j) - 1; i++)
           {
                System.out.print("*");
            }
            System.out.println("");
       }
    }




        // Driver Function






    public static void main(String[] args) {
        List<Integer> numbers = generateList(7, 20);
        numberInInterval(numbers, 8, 15, 10);

        List<Integer> pole;
        pole = generateList(20, 20);
        minNumberVypis(pole);

        int [] array = {4,5,6,7,28,3,1,0, -4};
        int init = array[0];
        for(int i = 0; i< array.length; i++){
            if(init>array[i]){
                init=array[i];

            }

        }
        System.out.println("minimal value is " + init);

        printTriangle(7);

        printDiamond();
    }

}








