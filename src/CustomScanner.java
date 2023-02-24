import java.util.Scanner;

//pobieranie danych od uzytkownika
public class CustomScanner {
    public static void main(String[] args) {
        Scanner scannerImion = new Scanner(System.in); // tworze obiekt scannerImion korzystajac z klkasy dostarczonej przez Jave Scanner, ktory pobierze dana
        System.out.println("Proszę podaj swoje imię");
        String userName = scannerImion.nextLine(); // pobieramy do zmiennej userName o typie string wartosc tekstowa / metoda nextLine zwroci wartosc o typie String
        System.out.print("Hi " + userName+"!");


        Scanner scannerCyfr = new Scanner(System.in);
        System.out.print(" Enter first number");
       int firstNumber = scannerCyfr.nextInt();
       System.out.println("Enter second number");
       int secondNumber = scannerCyfr.nextInt();
       int addition = firstNumber+secondNumber;
        System.out.println("I added your numbers for you and the result is: " + addition);
    }
}
