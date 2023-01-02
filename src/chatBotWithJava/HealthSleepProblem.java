package chatBotWithJava;

import java.util.Scanner;

/**
 * Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep.
 * She decided to follow TV recommendations and keep track of how many hours she spends sleeping.
 *
 *You are given three numbers: A, B and H. According to TV, one should sleep at least A  hours per day,
 * but no more than B hours. H is how many hours Ann sleeps.
 *
 * Task: If Ann sleeps less than A hours, print "Deficiency". If she sleeps more than B hours, print "Excess".
 * If her sleep fits the recommendations, print "Normal".
 *
 * Input format: three numbers A, B, H, where A is always less than or equal to B
 *
 * .
 */

public class HealthSleepProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initialized the three numbers
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        if (H < A ) {
            System.out.println("Deficiency");
        } else if (H > B) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}
