package Shapes;

public class PrintShape {

    static int n = 5;
    static int p;

    public static void square(int n) {
        /*rows*/
        for (int i = 1; i <= n; i++) {
            /*columns*/
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void incTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            /*columns*/
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void decTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            /*columns*/
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n-1; j++) {
                System.out.print("   ");

            }
            for (int j = 1; j < i; j++) {
                System.out.print("*" + "  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }

        public static void pyramids() {
            int i;
            int space = 0;
            int rows = 5;
            int star = 0;


            for (i = 1; i <= rows; i++) {
                for (space = 1; space <= rows - i; space++) {
                    //4,3,2,1

                    System.out.print(" " + "  ");
                }
                //while 9==9 print stars
                while (star != (2 * i - 1)) {
                    // print * and space
                    System.out.print("*" + "  ");
                    star++;
                }
                star = 0;
                System.out.print("\n");
            }
        }



    public static void main(String[] args) {
        square(n);
        System.out.println();
        incTriangle(n);
        System.out.println();
        decTriangle(n);
        triangle(n);
        System.out.println();
        pyramids();
    }

}
