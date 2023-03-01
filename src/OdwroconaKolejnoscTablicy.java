public class OdwroconaKolejnoscTablicy {
    public static void main(String[] args) {
        String[] colors = new String[5];

        colors[0] = "pink";
        colors[1] = "red";
        colors[2] = "black";
        colors[3] = "yellow";
        colors[4] = "grey";

        for (int i = colors.length; i > 0; i--) {
            System.out.println(colors[i-1]);
        }
    }
}
