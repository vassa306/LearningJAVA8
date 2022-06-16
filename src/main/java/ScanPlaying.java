import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanPlaying {

    public void theGreatest() {
        Scanner sc = new Scanner(System.in);

        int first;
        System.out.print("Enter number 1: ");
        while (true)
            try {
                first = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Invalid number try again: ");
            }
        int second;
        do {
            System.out.print("Enter number 2: ");
            while (true)
                try {
                    second = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Invalid number try again: ");
                }
        } while (second < 0|| first < 0);
        if (first>second){
            System.out.println("Greatest is " + first);

        }else if(second > first){
            System.out.println("Greatest is " + second);

        }else {
            System.out.println("The same numbers have been entered:" + "\n"  + "First number is " + first + "\n"  + "Second number is: " + second);
        }

    }

    public void sum2Numbers(int num1, int num2) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        while(true) {
            try {
                num1 = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Invalid number try again: ");
            }
        }
            System.out.print("Enter number 2: ");
            while (true){
                try {
                    num2 = Integer.parseInt(scan.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Invalid number try again: ");
                }
            }

        int sum = num1 + num2;
        System.out.println("vysledek je " + sum);

    }

    public void stringParseInt(String a, String b){
       Scanner sc = new Scanner(System.in);
        System.out.println("Insert first number: ");
        a = sc.nextLine();
        System.out.println("Insert second number: ");
        b = sc.nextLine();
       int num = Integer.parseInt(a);
       int num2 = Integer.parseInt(b);

        System.out.println("Inserted numbers are:" + num + "/" + num2);
        }


        public void calculateTriangleArea() {
            double a;
            double b;
            double c = 0;

            Scanner sc = new Scanner(System.in);
            System.out.print("Please, enter A side of a triangle: ");
            while (true) {
                try {
                    a = Double.parseDouble(sc.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Invalid number try again: ");
                }
            }

            System.out.print("Please, enter B side of a triangle: ");
            while (true) {
                try {
                    b = Double.parseDouble(sc.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Invalid number try again: ");

                }
            }

            System.out.print("Please, enter C side of a triangle: ");
            while (true) {
                try {
                    c = Double.parseDouble(sc.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Invalid number try again: ");

                }
            }
                double p = (a + b + c) / 2;
                System.out.println(p);
                double firstside = p - a;
                double secondside = p - b;
                double thirdside = p - c;
                double area = Math.sqrt(p * firstside * secondside * thirdside);

                System.out.println("Triangle area is: " + area);
            }


    public static void main (String[]args){
                    ScanPlaying scanPlaying = new ScanPlaying();
                  //    scanPlaying.theGreatest();
                //    scanPlaying.sum2Numbers(2,3);
               //     scanPlaying.stringParseInt("3" ,"2");
                    scanPlaying.calculateTriangleArea();
                }
            }




