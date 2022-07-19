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
            for (int j = i; j <= n - 1; j++) {
                System.out.print("    ");

            }
            for (int j = 1; j < i; j++) {
                System.out.print("#" + "   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("$" + "   ");
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

    public static void rightTriangle(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("        ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("8" + "    ");
            }
            System.out.println("-");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("        ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("^" + "    ");

            }
            System.out.println("-");
        }

    }

    public static void printTriangleBorder(int n) {
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n / 2 + 1 || j == n / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }


    }

    public static void printdiagonal(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();

        }
    }

    public static void hollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                if (i == 2 || j == 2 || i == n || j == n) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("  ");
        }
        for (int i = 5; i <= n; i++) {
            for (int j = 5; j <= n; j++) {
                if (i == 4 || j == 4 || i == n || j == n) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println(" ");
        }


    }

    public static void printHillPatern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println(" ");
        }
        System.out.println(" : ! : ! : ! : ! : ! : ! : ! : !");
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("    ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*   ");

            }
            for (int j = i; j < n - 1; j++) {
                System.out.print("*   ");

            }
            System.out.println("  ");
        }
    }

    public static void sum(int n) {
        int sums = 0;
        for (int i = 0; i < n; i++) {
            sums = sums + i;

        }
        System.out.println("sum is: "+ sums);
    }


    public static void main(String[] args) {
        square(n);
        System.out.println();
        incTriangle(n);
        System.out.println();
        decTriangle(n);
        triangle(n);
        System.out.println();
        System.out.println();
        System.out.println("Triangle");
        rightTriangle(n);
        System.out.println();
        pyramids();
        System.out.println();
        printTriangleBorder(n);
        System.out.println();
        printdiagonal(n);
        hollowSquare(n);
        printHillPatern(n);
        System.out.println();
        sum(n);
    }


}
