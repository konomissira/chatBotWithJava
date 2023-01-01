package chatBotWithJava;
import java.util.Scanner;

public class RelationelAndLogicalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstChildHeight = scanner.nextInt();
        int secondChildHeight = scanner.nextInt();
        int thirdChildHeight = scanner.nextInt();

        boolean descOrdered = (firstChildHeight >= secondChildHeight) && (secondChildHeight >= thirdChildHeight);
        System.out.println(descOrdered);
    }
}
