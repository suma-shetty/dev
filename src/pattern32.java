public class pattern32 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == 1  || k == 1 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5 - i; k++) {
                if (i == 4 || k == 1 || k == 5 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
                System.out.println();
            }
        }
    }



