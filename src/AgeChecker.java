import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner ageChecker = new Scanner(System.in);
        System.out.println("Podaj swoj wiek");
        int userAge = ageChecker.nextInt();

        if (userAge < 18) {
            System.out.println("Nie moge sprzedać Ci alkoholu");
            int roznicaWieku = 18 - userAge;
            if (roznicaWieku == 1) {
                System.out.println("Zapraszamy do sklepu za rok");
            } else if (roznicaWieku > 1 && roznicaWieku <= 4) {
                System.out.println("Zapraszamy do sklepu za " + roznicaWieku + " lata");
            } else {
                System.out.println("Zapraszamy do sklepu za " + roznicaWieku + " lat");
            }
        } else {
            System.out.println("Zapraszamy do zakupow");
        }
    }
}