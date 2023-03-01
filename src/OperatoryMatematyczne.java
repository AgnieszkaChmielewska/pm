//operatory matematyczne umozliwiaja wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        double thirdNumber = 4;
        double fourthNumber = 6;

        int addition = firstNumber + secondNumber; //10
        int additionShortcut= firstNumber+= secondNumber; // skrot dodawania first number + second number

        int subtraction = firstNumber - secondNumber; // -2
        int subtractionShortcut= firstNumber-= secondNumber; // skrot odejmowania first number + second number

        int multiplication = firstNumber * secondNumber; //24
        int multiplicationShortcut= firstNumber*= secondNumber; // skrot mnozenia first number + second number

        int division = firstNumber / secondNumber; //0
        double divisionDouble = firstNumber / secondNumber; // 0,0 poniewaz do dzialania dostarczamy inta, aby otrzymac wynik z wartoscia po przecinku musi byc dostarczona choc jedna zmienna o typie zmiennoprzecinkowy
        double divisionDoubleOnDoubleNumber1 = thirdNumber / secondNumber; // 0,666
        double divisionDoubleOnDoubleNumber2 = firstNumber / fourthNumber; // 0,666
        double divisionDoubleOnDoubleNumber3 = thirdNumber / fourthNumber; // 0,666
        double divisionShortcut = thirdNumber/=fourthNumber; // 0,666


        int modulo = secondNumber % firstNumber; // ile razy firstNumber miesci sie w secondNumber i jak zostanie reszta, czyli 4 miesci sie raz w 6 i reszta to 2, modulo zwroci 2
        //int moduloShortcut = secondNumber %= firstNumber;

        System.out.println("Addition result: " + addition);
        System.out.println("Addition result: " + additionShortcut);
        System.out.println();
        System.out.println("Subtraction result: " + subtraction);
        System.out.println("Subtraction result: " + subtractionShortcut);
        System.out.println();
        System.out.println("Multiplication result: "+ multiplication) ;
        System.out.println("Multiplication result: "+ multiplicationShortcut) ;
        System.out.println();
        System.out.println("Division result: " + division + " / all numbers are int type");
        System.out.println("Division result: " +divisionDouble + " / variables are int type and result double type");
        System.out.println("Division result: " + divisionDoubleOnDoubleNumber1 + " / result and first variable is double type, second variable is int type");
        System.out.println("Division result: " + divisionDoubleOnDoubleNumber2 + " / result and second variable is double type, first variable is int type");
        System.out.println("Division result: " + divisionDoubleOnDoubleNumber3 + " / all numbers are double type");
        System.out.println("Division result: " + divisionShortcut);
        System.out.println();
        System.out.println("Modulo result: " + modulo);
        //System.out.println("Modulo result: " + moduloShortcut);
    }
}
