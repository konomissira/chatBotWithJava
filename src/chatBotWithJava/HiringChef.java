package chatBotWithJava;

import java.util.Scanner;

public class HiringChef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String yearOfExperience = scanner.next();
        String cuisinePreference = scanner.next();

        /*System.out.println(firstName);
        System.out.println(yearOfExperience);
        System.out.println(cuisinePreference);*/
        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a chef who cooks " + cuisinePreference + " dishes and has " + yearOfExperience + " years of experience.");
    }
}
