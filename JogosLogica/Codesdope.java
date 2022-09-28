import java.util.Scanner;

public class Codesdope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual exercício?");
        int exercicio = sc.nextInt();
        switch (exercicio) {
            case 1:
                System.out.println("Qual a altura?");
                int altura = sc.nextInt();
                System.out.println("Qual o comprimento?");
                int comprimento = sc.nextInt();
                if (altura == comprimento)
                    System.out.println("É um quadrado!");
                else
                    System.out.println("É um retângulo!");
                break;
            case 2:
                System.out.println("Digite o primeiro número");
                int n1 = sc.nextInt();
                System.out.println("Digite o segundo número");
                int n2 = sc.nextInt();
                if (n1 > n2)
                    System.out.println("O maior é " + n1);
                else
                    System.out.println("O maior é %d" + n2);
                break;
            case 3:
                System.out.println("Quantas unidades foram compradas?");
                int quantidade = sc.nextInt();
                if (quantidade > 1000)
                    System.out.println("O valor total é R$" + quantidade * 90);
                else
                    System.out.println("O valor total é R$" + quantidade * 100);
                break;
            case 4:
                double bonus;
                System.out.println("Qual seu salário?");
                double salario = sc.nextDouble();
                System.out.println("Quantos anos de serviço você tem?");
                int anos = sc.nextInt();
                if (anos > 5)
                    bonus = salario * 0.05;
                else
                    bonus = 0;
                System.out.printf("O seu bônus é de R$%.2f\n", bonus);
                break;
            case 5:
                System.out.println("Escreva sua nota:");
                int nota = sc.nextInt();
                if (nota>=80)
                    System.out.println("A");
                else if (nota>=60 && nota<80)
                    System.out.println("B");
                else if (nota>=50 && nota<60)
                    System.out.println("C");
                else if (nota >=45 && nota<50)
                    System.out.println("D");
                else if (nota>=25 && nota<45)
                    System.out.println("E");
                else
                    System.out.println("F");
                break;
            case 6:
                System.out.println("Idade da primeira pessoa");
                int id1 = sc.nextInt();
                System.out.println("Idade da segunda pessoa");
                int id2 = sc.nextInt();
                System.out.println("Idade da terceira pessoa");
                int id3 = sc.nextInt();
                int menor=0;
                int maior=0;
                if(id1>id2 && id1>id3)
                    maior = id1;
                else if (id2>id1 && id2>id3)
                    maior = id2;
                else
                    maior = id3;
                if(id1<id2 && id1<id3)
                    menor = id1;
                else if (id2<id1 && id2<id3)
                    menor = id2;
                else
                    menor = id3;
                System.out.println("O maior valor é "+maior);
                System.out.println("O menor valor é "+menor);
                break;
            case 7:
                System.out.println("Escreva um número");
                int num = sc.nextInt();
                System.out.println(Math.abs(num));
                break;
            case 8:
                System.out.println("Número de aulas totais");
                int aulas = sc.nextInt();
                System.out.println("Número de aulas presente");
                int presenca = sc.nextInt();
                System.out.println("Porcentagem de presença");

                if (aulas*0.75>presenca)
                    System.out.println();
                break;
            case 9:
                int i = 10;

        }
    }
}
