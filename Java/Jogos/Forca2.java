
import java.util.Scanner;

public class Forca2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valida = false;
        boolean dicval = false;
        String erros = "";
        int contexec = 0;
        int contador = 0;
        int contfim = 0;
        int contdicas = 0;
        boolean acertou = false;
        System.out.println();
        System.out.println("Jogo da forca!!!");
        String[][] forca = {{"-", "_", "_", "_", "_", "-", "-"}, {"-", "|", "-", "-", "-", "-", "-"},
                {"-", "|", "-", "-", "-", "-", "-"}, {"-", "|", "-", "-", "-", "-", "-"}};
        String[][] forcapreen = {{"-", "_", "_", "_", "_", "-", "-"}, {"-", "|", "-", "-", "o", "-", "-"},
                {"-", "|", "-", "<", "|", ">", "-"}, {"-", "|", "-", "/", "-", "\\", "-"}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    System.out.println(forcapreen[i][j]);
                } else {
                    System.out.print(forcapreen[i][j]);
                }
            }
        }
        System.out.println();
        System.out.print("Informe a palavra: ");
        String palavra = sc.nextLine().toUpperCase();
        char[] teste = new char[palavra.length()];
        char[] palver = new char[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == ' ') {
                teste[i] = ' ';
                palver[i] = ' ';
            } else {
                teste[i] = '_';
                palver[i] = palavra.charAt(i);
            }
        }
        System.out.print("Quantas dicas deseja informar? (0-3): ");
        int numdicas = sc.nextInt();
        if (numdicas < 0 || numdicas > 3) {
            while (!dicval) {
                System.out.println("Quantidade inválida, informe novamente: ");
                numdicas = sc.nextInt();
                if (numdicas >= 0 && numdicas <= 3) {
                    dicval = true;
                }
            }
        }
        sc.nextLine();
        String[] dicas = new String[numdicas];
        if (numdicas > 0) {
            for (int i = 0; i < numdicas; i++) {
                System.out.printf("Dê a dica número %d: ", i + 1);
                dicas[i] = sc.nextLine();
            }
        }
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
        System.out.println("Jogo da Forca! \\o/");
        System.out.println("Adivinhe a palavra, você tem 6 tentativas, boa sorte :)!");
        System.out.println("Escreva DICA para solicitar uma dica.");
        if (numdicas > 0 && numdicas!=1) {
            System.out.printf("Você pode pedir %d dicas!\n",numdicas);
        } else if(numdicas==1){
            System.out.printf("Você pode pedir %d dica!\n",numdicas);
        }else{
            System.out.println("Mas que pena! Você não recebeu dicas hehe.");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6)
                    System.out.println(forca[i][j]);
                else
                    System.out.print(forca[i][j]);
            }
        }
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == ' ')
                System.out.print(" ");
            else
                System.out.print("_");
        }
        System.out.println();
        String letinf = "";
        while (acertou) {
            System.out.print("\nInforme uma letra: ");
            String tentativa = sc.next();
            if (tentativa.equalsIgnoreCase("DICA")) {
                if (contdicas < numdicas) {
                    System.out.printf("A dica número %d é: %s\n", contdicas+1, dicas[contdicas]);
                    contdicas++;
                    continue;
                } else {
                    System.out.println("Não tem mais dicas!");
                    continue;
                }
            }
            if (tentativa.length() > 1) {
                while (tentativa.length() != 1) {
                    System.out.print("Expressão inválida, informe apenas 1 caractere: ");
                    tentativa = sc.next();
                }
            }
            tentativa = tentativa.toUpperCase();
            if (letinf.contains(tentativa)) {
                while (!valida) {
                    System.out.print("Letra já utilizada! Tente novamente: ");
                    tentativa = sc.next();
                    if (!letinf.contains(tentativa)) {
                        valida = true;
                    }
                }
                valida = false;
            }
            letinf = letinf.concat(tentativa);
            if (palavra.contains(tentativa)) {
                for (int i = 0; i < palavra.length(); i++) {
                    char test = tentativa.charAt(0);
                    if (palavra.charAt(i) == test) {
                        teste[i] = test;
                        contfim = 0;
                        for (int j = 0; j < palavra.length(); j++) {
                            if (palver[j] == teste[j])
                                contfim++;
                        }
                    }
                }
            } else {
                erros = erros.concat(tentativa + " ");
                contador++;
                switch (contador) {
                    case 1:
                        forca[1][4] = "o";
                        break;
                    case 2:
                        forca[2][4] = "|";
                        break;
                    case 3:
                        forca[2][3] = "<";
                        break;
                    case 4:
                        forca[2][5] = ">";
                        break;
                    case 5:
                        forca[3][3] = "/";
                        break;
                    case 6:
                        forca[3][5] = "\\";
                        break;
                }
            }
            System.out.println();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 7; j++) {
                    if (j == 6) {
                        System.out.println(forca[i][j]);
                    } else {
                        System.out.print(forca[i][j]);
                    }
                }
            }
            for (int i = 0; i < palavra.length(); i++) {
                System.out.print(teste[i]);
            }
            System.out.println();
            System.out.print("Caracteres errados: ");
            System.out.println(erros);
            if (contador == 6) {
                System.out.println("\nForca!!! :(");
                break;
            }
            if (contfim == palavra.length()) {
                System.out.println("\n \\o/ Vitória!!! \\o/");
                break;
            }
            contexec++;
        /*-____--;
          -|--o--;
          -|-<|>-;
          -|-/-\-;*/
        }
    }
}
