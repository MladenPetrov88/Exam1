import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        double countA = 0;
        double countB = 0;
        double countc = 0;
        double countD = 0;
        double avgMark = 0;
        for (int i = 1; i <= students ; i++) {
            double mark = Double.parseDouble(scanner.nextLine());
            avgMark += mark;
            if (mark >= 2 && mark <= 2.99) {
                countA++;
            }
            if (mark >= 3 && mark <= 3.99) {
                countB++;
            }
            if (mark >= 4 && mark <= 4.99) {
                countc++;
            }
            if (mark >= 5) {
                countD++;
            }


        }
        System.out.printf("Top students: %.2f%%%n", countD * 100 / students);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", countc * 100 / students);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", countB * 100 / students);
        System.out.printf("Fail: %.2f%%%n", countA * 100 / students);
        System.out.printf("Average: %.2f", avgMark / students);
    }
}
