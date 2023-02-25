import java.util.Scanner;

public class Calculatror {
    public static void main(String[] args) {

        Scanner scannerCyfr = new Scanner(System.in);
        System.out.print(" Enter first number");
        double firstNumber = scannerCyfr.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scannerCyfr.nextInt();
        double addition = firstNumber+secondNumber;
        double division = firstNumber / secondNumber;
        double multiplication = firstNumber * secondNumber;
        double subtraction = firstNumber - secondNumber;

        System.out.println("I've added your numbers for you and the result is: " + addition);
        System.out.println("I've divided your numbers for you and the result is: " + division);
        System.out.println("I've multiplied your numbers for you and the result is: " + multiplication);
        System.out.println("I've subtracted your numbers for you and the result is: " + subtraction);
    }
}
