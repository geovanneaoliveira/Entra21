import java.util.Scanner;
public class Jogodavelha {
    public static void main(String[] args) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        boolean winner = false;
        boolean valida = false;
        String[][] tabuleiro = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        while (!winner) {
            System.out.print("Escolha a posição da O: ");
            int pos = sc.nextInt();
            int[] p1 = posicao(pos);
            int pi = p1[0];
            int pj = p1[1];
            if (tabuleiro[pi][pj] == "O" || tabuleiro[pi][pj] == "X") {
                while (!valida) {
                    System.out.println("Posição inválida! Jogue novamente.");
                    System.out.print("Escolha a posição do O: ");
                    pos = sc.nextInt();
                    int pt[] = posicao(pos);
                    pi = pt[0];
                    pj = pt[1];
                    if (tabuleiro[pi][pj] != "O" && tabuleiro[pi][pj] != "X") {
                        valida = true;
                    }
                }
            }
            tabuleiro[pi][pj] = "O";
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (j < 2)
                        System.out.print(tabuleiro[i][j]);
                    else
                        System.out.println(tabuleiro[i][j]);
                }
            }
            if (tabuleiro[0][0].equals(tabuleiro[0][1]) && tabuleiro[0][1].equals(tabuleiro[0][2]) && tabuleiro[0][0].equals("O") ||
                    tabuleiro[1][0].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[1][2]) && tabuleiro[1][0].equals("O") ||
                    tabuleiro[2][0].equals(tabuleiro[2][1]) && tabuleiro[2][1].equals(tabuleiro[2][2]) && tabuleiro[2][0].equals("O") ||
                    tabuleiro[0][0].equals(tabuleiro[1][0]) && tabuleiro[1][0].equals(tabuleiro[2][0]) && tabuleiro[0][0].equals("O") ||
                    tabuleiro[0][1].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][1]) && tabuleiro[0][1].equals("O") ||
                    tabuleiro[0][2].equals(tabuleiro[1][2]) && tabuleiro[1][2].equals(tabuleiro[2][2]) && tabuleiro[0][2].equals("O") ||
                    tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][2]) && tabuleiro[0][0].equals("O") ||
                    tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][0]) && tabuleiro[0][2].equals("O")) {
                winner = true;
                System.out.println("Vitória da O!!!");
                break;
            } else counter++;
            if (counter == 9) {
                System.out.println("Velha!");
                break;
            }
            System.out.print("Escolha a posição do X: ");
            pos = sc.nextInt();
            int p2[] = posicao(pos);
            pi = p2[0];
            pj = p2[1];
            if (tabuleiro[pi][pj] == "O" || tabuleiro[pi][pj] == "X") {
                while (!valida) {
                    System.out.println("Posição inválida! Jogue novamente.");
                    System.out.print("Escolha a posição do X: ");
                    pos = sc.nextInt();
                    int pt[] = posicao(pos);
                    pi = pt[0];
                    pj = pt[1];
                    if (tabuleiro[pi][pj] != "O" && tabuleiro[pi][pj] != "X") {
                        valida = true;
                    }
                }
            }
            tabuleiro[pi][pj] = "X";
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (j < 2)
                        System.out.print(tabuleiro[i][j]);
                    else
                        System.out.println(tabuleiro[i][j]);
                }
            }
            if (tabuleiro[0][0].equals(tabuleiro[0][1]) && tabuleiro[0][1].equals(tabuleiro[0][2]) && tabuleiro[0][0].equals("X") ||
                    tabuleiro[1][0].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[1][2]) && tabuleiro[1][0].equals("X") ||
                    tabuleiro[2][0].equals(tabuleiro[2][1]) && tabuleiro[2][1].equals(tabuleiro[2][2]) && tabuleiro[2][0].equals("X") ||
                    tabuleiro[0][0].equals(tabuleiro[1][0]) && tabuleiro[1][0].equals(tabuleiro[2][0]) && tabuleiro[0][0].equals("X") ||
                    tabuleiro[0][1].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][1]) && tabuleiro[0][1].equals("X") ||
                    tabuleiro[0][2].equals(tabuleiro[1][2]) && tabuleiro[1][2].equals(tabuleiro[2][2]) && tabuleiro[0][2].equals("X") ||
                    tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][2]) && tabuleiro[0][0].equals("X") ||
                    tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][0]) && tabuleiro[0][2].equals("X")) {
                winner = true;
                System.out.println("Vitória do X!!!");
                break;
            } else counter++;
        }
    }
    public static int[] posicao(int pos){
        int pi = 0;
        int pj = 0;
        switch (pos) {
            case 1 -> {
                pi = 0;
                pj = 0;
            }
            case 2 -> {
                pi = 0;
                pj = 1;
            }
            case 3 -> {
                pi = 0;
                pj = 2;
            }
            case 4 -> {
                pi = 1;
                pj = 0;
            }
            case 5 -> {
                pi = 1;
                pj = 1;
            }
            case 6 -> {
                pi = 1;
                pj = 2;
            }
            case 7 -> {
                pi = 2;
                pj = 0;
            }
            case 8 -> {
                pi = 2;
                pj = 1;
            }
            case 9 -> {
                pi = 2;
                pj = 2;
            }
        }
        int[] posicoes = {pi,pj};
        return posicoes;
    }
}