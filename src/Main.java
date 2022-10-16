import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1.1.1
        int[] numberBoxes = new int[3];
        numberBoxes[0] = 1;
        numberBoxes[1] = 2;
        numberBoxes[2] = 3;
        System.out.println(numberBoxes[0]);
        System.out.println(numberBoxes[1]);
        System.out.println(numberBoxes[2]);

        // Задача 1.1.2
        double[] exactWeightGrams = {1.57, 7.654, 9.986};
        System.out.println(exactWeightGrams[0]);
        System.out.println(exactWeightGrams[1]);
        System.out.println(exactWeightGrams[2]);

        // Задача 1.1.3
        int[] penColorBob = {1, 2, 3, 3, 2, 4, 5, 6};
        System.out.println(penColorBob[0]);

        // Задача 2

        int[] numberBoxes1 = new int[3];
        numberBoxes1[0] = 1;
        numberBoxes1[1] = 2;
        numberBoxes1[2] = 3;
        double[] exactWeightGrams1 = {1.57d, 7.654d, 9.986d};
        int[] penColorBob1 = {1, 2, 3, 3, 2, 4, 5, 6};
        for (int q = 0; q < numberBoxes1.length; q++) {
            if (q > 0) {
                System.out.print(", ");
            }
            System.out.print(numberBoxes1[q] + "  ");
        }

        for (int i = 0; i < exactWeightGrams1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(exactWeightGrams1[i] + "  ");
        }

        for (int w = 0; w < penColorBob1.length; w++) {
            if (w > 0) {
                System.out.print(", ");
            }
            System.out.print(penColorBob1[w]);
        }

        System.out.println();

        // Задача 3

        int[] numberBoxes2 = new int[3];
        numberBoxes2[0] = 1;
        numberBoxes2[1] = 2;
        numberBoxes2[2] = 3;
        double[] exactWeightGrams2 = {1.57, 7.654, 9.986};
        int[] penColorBob2 = {1, 2, 3, 3, 2, 4, 5, 6};
        for (int q = numberBoxes2.length - 1; q >= 0; q--) {
            System.out.print(numberBoxes2[q]);
            if (q > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();

        for (int i = exactWeightGrams2.length - 1; i >= 0; i--) {
            System.out.print(exactWeightGrams2[i]);
            if (i > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();

        for (int w = penColorBob2.length - 1; w >= 0; w--) {
            System.out.print(penColorBob2[w]);
            if (w > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();

        // Задача 4
        int[] numberBoxes3 = new int[3];
        numberBoxes3[0] = 1;
        numberBoxes3[1] = 2;
        numberBoxes3[2] = 3;
        for (int a = 0; a < numberBoxes3.length; a++) {
            if (numberBoxes3[a] % 2 != 0) {
                numberBoxes3[a]++;
            }
            if (a > 0) {
                System.out.print(" , ");
            }
            System.out.print(numberBoxes3[a]);
        }
    }
}

















