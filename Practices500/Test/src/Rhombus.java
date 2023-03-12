/**
 *   **********
 *   ****  ****
 *   ***    ***
 *   **      **
 *   *        *
 *   **      **
 *   ***    ***
 *   ****  ****
 *   **********
 */
public class Rhombus {
    public static void main(String[] args) {
                //上半部分
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 6 - i; j++) {
                        System.out.print("*");
                    }

                    for (int j = 1; j <= i - 1; j++) {
                        System.out.print("  ");
                    }


                    for (int j = 1; j <= 6 - i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                //下半部分
                for (int i = 2; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    for (int j = 1; j <= 5 - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }