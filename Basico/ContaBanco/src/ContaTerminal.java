import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //comentario
        int numero = 0;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Insira no numero da Conta: \n");
        scanner.nextLine();

        System.out.println("Insira no numero da Agencia: \n");
        agencia = scanner.nextLine();

        System.out.println("Insira Nome do cliente: \n");
        nomeCliente = scanner.nextLine();

        System.out.println("Insira Saldo inicial: \n");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}