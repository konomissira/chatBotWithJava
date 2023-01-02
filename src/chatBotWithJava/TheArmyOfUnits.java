package chatBotWithJava;
import java.util.Scanner;

public class TheArmyOfUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int armyOfUnits = scanner.nextInt();
        if (armyOfUnits < 1) {
            System.out.println("no army");
        } else if(armyOfUnits >= 1 && armyOfUnits <= 19) {
            System.out.println("pack");
        } else if (armyOfUnits >= 19 && armyOfUnits <= 249) {
            System.out.println("throng");
        } else if (armyOfUnits >= 249 && armyOfUnits <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
