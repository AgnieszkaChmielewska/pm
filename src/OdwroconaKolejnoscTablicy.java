public class OdwroconaKolejnoscTablicy {
    public static void main(String[] args) {
        String[] colors = new String[5];

        colors[0] = "pink";
        colors[1] = "red";
        colors[2] = "black";
        colors[3] = "yellow";
        colors[4] = "grey";
//
        for (int i = colors.length; i > 0; i--) {
            System.out.println(colors[i-1]);
        }

        System.out.println("new -----way-----");
        System.out.println(colors.length/2);

        for (int i=0; i<(colors.length/2); i++){
            String temp = colors[i];
            System.out.println(    colors[i] = colors[colors.length-1-i]);
            System.out.println(    colors[colors.length-1-i] = temp );
        }

        System.out.println("new -----way-----");
        System.out.println(colors.length);
        for (int i=0; i<colors.length; i++){
            System.out.println(colors[i]);
        }
    }
}
