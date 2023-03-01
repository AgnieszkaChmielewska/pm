public class For {
    public static void main(String[] args) {

        int number = 20;
        int liczbaIteracji = 0;
        System.out.println(number % 8);// ile razy number miesci sie w 12, i zwracana jest reszta
        for (int i = 0; i<number;i = i+2){ // i to zmienna sterujaca definiuje kiedy przerwac petle
            System.out.println(i);
            liczbaIteracji= liczbaIteracji+1;
        }
        System.out.println("pętla uruchomiona: "+ liczbaIteracji +" razy");

        for (int i = 0; i<number; i++){
            if (i%5==0){
                System.out.println(i);
            }
        }
    }
}
