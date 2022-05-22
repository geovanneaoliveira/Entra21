import java.util.Scanner;

public class Ff14 {
    public static void main(String[] args) {
        elseif();
        //switchcase();
    }
    public static void elseif() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a abreviação com 3 letras:");
        String abv = sc.next();
        if (abv.length() != 3)
            System.out.println("Abreviação errada");
        String tank = "PLD WAR DKN GNB";
        String Healer = "WHM SCH AST SAG";
        String Dps = "MNR DRG NJA SMR RPR BRD DNC BLM SMN RDM BEM";

        if (tank.contains(abv))
            System.out.println("TANK");
        else if (Healer.contains(abv))
            System.out.println("Healer");
        else if (Dps.contains(abv))
            System.out.println("DPS");
        else
            System.out.println("Classe inválida");
    }

    public static void switchcase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a abreviação com 3 letras:");
        String abv = sc.next();
        if (abv.length() > 3 || abv.length() < 3)
            System.err.println("Abreviação errada");
        switch (abv) {
            case "PLD", "WAR", "DKN", "GNB":
                System.out.println("TANK");
                break;
            case "WHM", "SCH", "AST", "SAG":
                System.out.println("HEALER");
                break;
            case "MNR", "DRG", "NJA", "SMR", "RPR", "BRD", "DNC", "BLM", "SMN", "RDM", "BEM":
                System.out.println("DPS");
                break;
            default:
                System.out.println("Classe Inválida");

        }
    }
}
