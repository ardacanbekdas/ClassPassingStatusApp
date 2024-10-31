package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class ClassPassingStatusApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int math, biology, chemical, music, physical;

        System.out.print("Please enter your Math score: ");
        math = input.nextInt();

        System.out.print("Please enter your biology score: ");
        biology = input.nextInt();

        System.out.print("Please enter your Chemical score: ");
        chemical = input.nextInt();

        System.out.print("Please enter your Music score: ");
        music = input.nextInt();

        System.out.print("Please enter your Physical score: ");
        physical = input.nextInt();

        double average = ((math + biology + chemical + music + physical) / 5.0);

        if (math > 100 || math < 0 || biology > 100 || biology < 0 || chemical > 100 || chemical < 0 || music > 100 || music < 0 || physical > 100 || physical < 0) {
            System.out.println("You have entered an invalid score.");
        } else if (average >= 55.0) {
            System.out.println("Your average is = " + average);
            System.out.println("You have successfully completed the class");
        } else {
            System.out.println("Your average is = " + average);
            System.out.println("You failed the class");
        }

    }
}


