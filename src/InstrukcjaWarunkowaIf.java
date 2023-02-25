public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {
        float a = 10; //dzielna
        float b = 0; //dzielnik
        if (b != 0) {
            float result = a / b;
            System.out.println("wynik dzielenia: " + result);
        } else {
            System.out.println("Second number should be different than 0");
        }

        if (b < a) {
            float result = a / b;
            System.out.println("wynik dzielenia: " + result);
        }
    }
}
