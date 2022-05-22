import java.util.Scanner;

public class Lista22 {
    public static void main(String[] args) {
        //System.out.println(areaqua(10,10));
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        //ex16();
        //ex17();
        //ex18();
        //ex19();
        //ex20();
        //ex21();
        //ex22();
    }

    public static int areaqua(int a,int b) {
        int areaquadrado= a*b;
        return areaquadrado;
    }

    public static void ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um número para ser subtraído");
        int a = sc.nextInt();
        System.out.println(--a);
    }

    public static void ex3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o tamanho da base do retângulo:");
        double base = sc.nextInt();
        System.out.println("Escreva agora o tamanho da altura do retângulo:");
        double altura = sc.nextInt();
        double area = base * altura;
        double perimetro = (2 * base) + (2 * altura);
        System.out.println("A área do retângulo é:");
        System.out.println(area);
        System.out.println("O perímetro do retânngulo é:");
        System.out.println(perimetro);
    }

    public static void ex4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anos");
        int anos = sc.nextInt();
        System.out.println("Meses");
        int meses = sc.nextInt();
        System.out.println("Dias");
        int dias = sc.nextInt();
        int anosdias = anos * 365;
        int mesesdias = meses * 30;
        System.out.println(anosdias + mesesdias + dias);
    }

    public static void ex5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o número total de eleitores:");
        int eleitores = sc.nextInt();
        System.out.print("Total de votos brancos:");
        int brancos = sc.nextInt();
        System.out.print("Total de votos nulos:");
        int nulos = sc.nextInt();
        int validos = eleitores - (brancos + nulos);
        int perval = (validos * 100) / eleitores;
        int perbra = (brancos * 100) / eleitores;
        int pernul = (nulos * 100) / eleitores;
        System.out.printf("Total de votos válidos: %d\n", validos);
        System.out.printf("Percentual de votos válidos: %d\n", perval);
        System.out.println("Percentual de votos brancos:");
        System.out.println(perbra);
        System.out.println("Percentual de votos nulos:");
        System.out.println(pernul);
    }

    public static void ex6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o salário:");
        double salario = sc.nextDouble();
        System.out.println("Escreva o percentual de reajuste:");
        double reajuste = sc.nextDouble();
        double salrea = salario * ((reajuste + 100) / 100);
        System.out.printf("O salário reajustado é R$%.2f", salrea);
    }

    public static void ex7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o custo de fábrica:");
        double fabcust = sc.nextDouble();
        double dist = fabcust * 0.28;
        double imp = fabcust * 0.45;
        double total = fabcust + dist + imp;
        System.out.printf("O preço final do carro é: %.2f", total);
    }

    public static void ex8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos carros você vendeu?");
        int carros = sc.nextInt();
        System.out.println("Qual o valor total das vendas?");
        double vendas = sc.nextDouble();
        System.out.println("Qual seu salário fixo?");
        double salario = sc.nextDouble();
        System.out.println("Qual a comissão por carro vendido?");
        double comissao = sc.nextDouble();
        double saltotal = salario + (comissao * carros) + 0.05 * vendas;
        System.out.printf("O salário final é: %.2f", saltotal);
    }

    public static void ex9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva uma temperatura em Fahrenheit para conversão:");
        double fah = sc.nextDouble();
        double celsius = (5 * (fah - 32)) / 9;
        System.out.printf("A temperatura em celsius é %.1f", celsius);
    }

    public static void ex10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a primeira nota:");
        double n1 = sc.nextDouble();
        System.out.println("Escreva a segunda nota:");
        double n2 = sc.nextDouble();
        System.out.println("Escreva a terceira nota:");
        double n3 = sc.nextDouble();
        double notaf = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
        System.out.printf("A nota final é: %.1f", notaf);
    }

    public static void ex11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int num = sc.nextInt();
        if (num > 10)
            System.out.println("É maior que 10!");
        else if (num == 10)
            System.out.println("É 10!");
        else
            System.out.println("É menor que 10!");
    }

    public static void ex12() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número:");
        int num = sc.nextInt();
        if
        (num >= 0) System.out.println("É positivo!");
        else
            System.out.println("É negativo!");
    }

    public static void ex13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas maçãs foram compradas?");
        int macas = sc.nextInt();
        double total;
        if
        (macas >= 12) total = macas * 1.00;
        else
            total = macas * 1.30;
        System.out.printf("O custo total das maçãs foi de: R$%.2f", total);
    }

    public static void ex14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Em que ano estamos?");
        int atual = sc.nextInt();
        System.out.println("Diga seu ano de nascimento:");
        int nasc = sc.nextInt();
        if
        (atual - nasc >= 16) System.out.println("Você poderá votar este ano!");
        else
            System.out.println("Você não poderá votar este ano!");
    }

    public static void ex15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        int v1 = sc.nextInt();
        System.out.println("Informe o segundo valor:");
        int v2 = sc.nextInt();
        if (v1 > v2) System.out.printf("O maior valor é: %d", v1);
        else System.out.printf("O maior valor é: %d", v2);
    }

    public static void ex16() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        int v1 = sc.nextInt();
        System.out.println("Informe o segundo valor:");
        int v2 = sc.nextInt();
        if (v1 < v2) System.out.printf("Em ordem crescente: %d %d", v1, v2);
        else System.out.printf("Em ordem crescente: %d %d", v2, v1);
    }

    public static void ex17() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a hora de início do jogo:");
        int ini = sc.nextInt();
        System.out.println("Informe a hora do fim do jogo:");
        int fim = sc.nextInt();
        int total;
        if (ini < fim)
            total = fim - ini;
        else
            total = 24 - ini + fim;
        System.out.printf("A duração do jogo foi de %d horas.", total);
    }

    public static void ex18() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as horas trabalhadas no mês:");
        int horas = sc.nextInt();
        System.out.println("Informe o salário por hora:");
        double salario = sc.nextDouble();
        double saltotal;
        int extra = horas - 160;
        if (horas / 4 > 40) saltotal = salario * horas + extra * salario * 1.5;
        else saltotal = salario * horas;
        System.out.printf("O salário final é de: R$%.2f", saltotal);
    }

    public static void ex19() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu sexo?");
        String sexo = sc.nextLine();
        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();
        System.out.println("Qual sua altura?");
        String masc = "Masculino";
        String fem = "Feminino";
        double altura = sc.nextDouble();
        double pesoideal;
        if (sexo.equals("Masculino")) {
            pesoideal = (72.7 * altura) - 58;
        } else {
            pesoideal = (62.1 * altura) - 44.7;
        }
        System.out.printf("O peso ideal é %.2f kg", pesoideal);
    }

    public static void ex20() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu salário fixo?");
        double salario = sc.nextDouble();
        System.out.println("Qual o valor total de vendas?");
        double vendas = sc.nextDouble();
        double bonus;
        double ult;
        if (vendas <= 1500)
            bonus = vendas * 0.03;
        else {
            ult = vendas - 1500;
            bonus = 1500 * 0.03 + ult * 0.05;
        }
        System.out.printf("O salário total é: %.2f", salario + bonus);
    }

    public static void ex21() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o número da conta?");
        int conta = sc.nextInt();
        System.out.println("Digite seu saldo.");
        double saldo = sc.nextDouble();
        System.out.println("Débito");
        double debito = sc.nextDouble();
        System.out.println("Crédito");
        double credito = sc.nextDouble();
        double saldoatual = saldo - debito + credito;
        System.out.printf("O saldo atual é R$%.2f\n", saldoatual);
        if (saldoatual >= 0)
            System.out.println("Saldo positivo");
        else
            System.out.println("Saldo Negativo");
    }

    public static void ex22() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantidade em estoque?");
        int estoque = sc.nextInt();
        System.out.println("Qual a a quantidade máxima?");
        int estmax = sc.nextInt();
        System.out.println("Qual a quantidade mínima?");
        int estmin = sc.nextInt();
        double med = (estmax + estmin) / 2;
        if (estoque >= med)
            System.out.println("Não efetuar compra!");
        else
            System.out.println("Efetuar compra!");
    }
}
