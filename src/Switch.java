public class Switch {
    public static void main(String[] args) {
        String danie = "Pizza";
// sprawdzam wartosc zmiennej danie,
        switch (danie) {
            case "Pizza":
                System.out.println("Cena to: 22 zł ");
                break;
            case "Frytki":
                System.out.println("Cena to: 9 zł ");
                break;
            case "Default":
                System.out.println("Brak dania");

        }
    }
}
