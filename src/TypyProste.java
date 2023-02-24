public class TypyProste {
    //liczby staloprzecinkowe
    byte byteNumber = 127; // 1 bajt od -128 do 127
    short shortNumber = 32767; // 2 bajty od -32768 do 32767
    int intNumber = 327648; // 4 bajty od -2 147 483 648 do 2 147 483 647
    long longNumber = 2148000L; // 8 bajty od -2^63  do (2^63)-1, jesli chcemy jawnie przekazac ze liczba typu Long dodajemy L na koncu


    //liczby zmiennoprzecinkowe
    float floatNumber = 4.9934F; // 4 bajty - max ok 6-7 cyfr po przecinku, jesli chcemy jawnie przekazac ze liczba typu float dodajemy F na koncu
    double doubleNumber = 3.9934F; // 8 bajtow - max ok 15 cyfr po przecinku, jesli chcemy jawnie przekazac ze liczba typu double dodajemy D na koncu

    //wartosc logiczna
    boolean prawda = true;
    boolean falsz = false;

    //pojedynczy znak
    char letter = 'A'; // podwojna literka to bedzie juz string 'av' i to juz nie jest typ prosty tylko obiektowy


}

