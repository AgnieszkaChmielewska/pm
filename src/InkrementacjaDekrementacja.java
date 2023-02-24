public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        //inkrementacja zwieksza wartosc o 1
        //sa dwa typy post inkrementacja i preinkrementacja

        int a = 0;

        //post inkrementacja
        System.out.println("POSTINKREMENTACJA");
        int b = a++; // przypisujemy do zmiennej b wartosc zmiennej a, nastepnie wartosc zmiennej a jest inkrementowana
        System.out.println(b);
        System.out.println(a);

        //pre inkrementacja
        System.out.println("PREINKREMENTACJA");
        a=0;
        int c = ++a; // przypisujemy do zmiennej b wartosc zmiennej a, nastepnie wartosc zmiennej a jest inkrementowana
        System.out.println(c);
        System.out.println(a);


        int d = 5;
        //post dekrementacja
        System.out.println("POSTDEKREMENTACJA");
        int e = d--; // przypisujemy do zmiennej b wartosc zmiennej a, nastepnie wartosc zmiennej a jest inkrementowana
        System.out.println(d); //5
        System.out.println(e); //4

        //pre inkrementacja
        System.out.println("PREDEKREMENTACJA");
        d=5;
        int f = --d; // przypisujemy do zmiennej b wartosc zmiennej a, nastepnie wartosc zmiennej a jest inkrementowana
        System.out.println(d); //4
        System.out.println(f); //4
    }
}
