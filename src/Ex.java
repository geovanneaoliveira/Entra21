import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        // ^ XOR
        /*System.out.println(var3.length());
        System.out.println(var.charAt(0));
        System.out.println(var3.equals("teste"));
        System.out.println(var3.toLowerCase());
        System.out.println(var3.toLowerCase);
        System.out.println(var3.contains("texto"));
        System.out.println(var3.strip());*/
    }

    public static void ex1() {
        Scanner sc = new Scanner(System.in);
        int valor = 1;
        while (valor != 0) {
            System.out.println("Qual tabuada deseja saber?");
            valor = sc.nextInt();
            if (valor == 0)
                break;
            for (int i = 0; i <= 10; i++) {
                System.out.println(valor * i);
            }
        }
    }

    public static void ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas palavras deseja informar?");
        int np = sc.nextInt();
        System.out.println("Informe cada palavra:");
        String[] palavras = new String[np];
        for (int i = 0; i < np; i++) {
            palavras[i] = sc.next();
        }
        System.out.print("As palavras são: ");
        for (int i = 0; i < np; i++) {
            if (i == 0)
                System.out.print(palavras[i]);
            else
                System.out.print(", " + palavras[i]);
        }
    }
}
