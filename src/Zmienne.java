//zarezerwowane miejsce w pamieci z okreslonym typem danych
public class Zmienne {
    public static void main(String[] args) {
        //deklaracja zmiennej / typ zmiennej / nazwa zmiennej
        String name;
        int number = 1;
        int numberTwo = 2;
        int result = number+numberTwo;

        //przypisanie wartosci do zmiennej
        name = "Aga";
        System.out.println(name);
        System.out.println(result + " wartosc zmiennej przed nadpisaniem wartosci zmiennej");
        result=6;
        System.out.println(result + " wartosc zmiennej po nadpisaniu wartosci zmiennej");

    }

}
