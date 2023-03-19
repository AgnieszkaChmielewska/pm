public class LiczbyPodzielnePrzezTrzy {
    public static void main(String[] args) {
        int dzielna = 3;

        for (int i = 0; i < 101; i++) {
            if (i % dzielna == 0) {
                System.out.println(i);
            }
        }
    }
}
