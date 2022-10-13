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
        double[] exactWeightGrams1 = {1.57, 7.654, 9.986};
        int[] penColorBob1 = {1, 2, 3, 3, 2, 4, 5, 6};
        for (int q : numberBoxes1)
            if (q < numberBoxes1.length) {
                System.out.print(q + ", ");
            } else {
                System.out.print(q + "  ");
            }
        for (double i : exactWeightGrams1)
            if (i < exactWeightGrams1.length) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + "  ");
            }

        for (int w : penColorBob1)
            if (w < penColorBob1.length) {
                System.out.print(w + ", ");
            } else {
                System.out.print(w + "  ");
            }

        System.out.println();

        // Задача 3
        int[] numberBoxes2 = new int[3];
        numberBoxes2[0] = 1;
        numberBoxes2[1] = 2;
        numberBoxes2[2] = 3;
        double[] exactWeightGrams2 = {1.57, 7.654, 9.986};
        int[] penColorBob2 = {1, 2, 3, 3, 2, 4, 5, 6};
        for (int q : numberBoxes2)
            if (q < numberBoxes2.length) {
                System.out.println(q + ", ");
            } else {
                System.out.println(q + "  ");
            }
        for (double i : exactWeightGrams2)
            if (i < exactWeightGrams2.length) {
                System.out.println(i + ", ");
            } else {
                System.out.print(i + "  ");
            }

        for (int w : penColorBob2)
            if (w < penColorBob2.length) {
                System.out.print(w + ", ");
            } else {
                System.out.print(w + "  ");
            }


    }
}




