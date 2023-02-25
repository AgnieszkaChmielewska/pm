public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {
        int number = 17;

        if (number > 10) {
            System.out.println("numer wiekszy od 10");
        } else if (number == 0) {
            System.out.println("Liczba rowna zero");
        } else if (number > 0) {
            System.out.println("Liczba dodatnoa");
        } else if (number < -5) {
            System.out.println("Liczba mniejsza od -5");
        } else {
            System.out.println("żaden warunek nie zostal spelniony");
        }
    }
}
