import java.util.Locale;

public class TypyObiektowe {
    public static void main(String[] args) {

        //Typy obiektowe: przechowuja aktualna wartosc i umozliwiaja wykonanie akcji (wywolanie metod) na tych danych
        //nazwy typow obiektowych odpowiadaja nazwom typow prostych
        // po co typy obiektowe odpowiadające typom prostym – bo kolekcje nie mogą przechowywać typów prostych tylko obiektowe

        //liczby staloprzecinkowe
        Byte byteNumber = 127; // 1 bajt od -128 do 127
        Short shortNumber = 32767; // 2 bajty od -32768 do 32767
        Integer intNumber = 327648; // 4 bajty od -2 147 483 648 do 2 147 483 647
        Long longNumber = 2148000L; // 8 bajty od -2^63  do (2^63)-1, jesli chcemy jawnie przekazac ze liczba typu Long dodajemy L na koncu

        //liczby zmiennoprzecinkowe
        Float floatNumber = 4.9934F; // 4 bajty - max ok 6-7 cyfr po przecinku, jesli chcemy jawnie przekazac ze liczba typu float dodajemy F na koncu
        Double doubleNumber = 3.9934D; // 8 bajtow - max ok 15 cyfr po przecinku, jesli chcemy jawnie przekazac ze liczba typu double dodajemy D na koncu

        //wartosc logiczna
        Boolean prawda = true;
        Boolean falsz = false;

        //pojedynczy znak
        Character letter = 'A'; // podwojna literka to bedzie juz string 'av' i to juz nie jest typ prosty tylko obiektowy

        //ciągi znaków – string
        String hello = "Hello ";
        String name = "Aga";
        System.out.println(hello.charAt(2)); //znajduje ltere o indeksie zero w zmiennej hello
        System.out.println(hello.toLowerCase(Locale.ROOT));
        System.out.println(hello.toUpperCase());
        System.out.println("Length before trim " + hello.length());
        System.out.println("Length after trim " + hello.trim().length());
        System.out.println(hello.concat(" " + name));
        System.out.println(hello.hashCode());
        System.out.println(hello.getClass());

        System.out.println(intNumber.toString());


    }
}