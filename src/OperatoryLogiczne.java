public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = 2>1;
        boolean secondValue = false;
        boolean thirdValue = 2<1;
        boolean fourthValue = true;

        //&& opertaor i, zwroci true gdy oba wyrazenia skladowe sa true
        System.out.println("----I----");
        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && fourthValue); //true

        // || lub, zwroci true gdy jedno z wyrazeń skladowych jest true
        System.out.println("----LUB----");
        System.out.println(firstValue || secondValue);//true
        System.out.println(firstValue || fourthValue);//true
        System.out.println(secondValue || thirdValue);//false

        //! negacja - zwraca wartosc przeciwna do wyrazenia przed ktorym sie znajduje
        System.out.println("----NEGACJA----");
        System.out.println(!fourthValue); //false
        System.out.println(!thirdValue); //true
        System.out.println(!(firstValue && fourthValue)); //false
    }
}
