public class Tablice {
    public static void main(String[] args) {
        String[] winterMonths = new String[3]; // tablica przechowująca miesiace zimowe
        winterMonths[0] = "grudzuień";
        winterMonths[1] = "styczeń";
        winterMonths[2] = "luty";

//        System.out.println(winterMonths[0]);
//        System.out.println(winterMonths[1]);
//        System.out.println(winterMonths[2]);
//
//        int [] numbers = new int[] {1,2,3};
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//       // System.out.println(numbers[3]); // Exception - Index 3 out of bounds for length 3
//
//        System.out.println(winterMonths.length);
//        System.out.println(numbers.length);
//

        for (int i= 0; i<winterMonths.length; i++){
            System.out.println(winterMonths[i]);
        }
    }

}
