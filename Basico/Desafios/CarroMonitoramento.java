import java.util.Scanner;

public class CarroMonitoramento {

    // TODO: Crie o método estático que verifica se o carro está apto:
    public static boolean verificaAptidão(int anoFabricação, int anoAtual) {
        // TODO: Calcule a idade do carro:
        int idade = anoAtual - anoFabricação;
        // TODO: Verifique se o carro tem até 10 anos:
        return idade <= 10;
    }

public static void main(String[] args) {
    // Criando o scanner para entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Lendo os dados de entrada
    String modelo = scanner.nextLine();
    int anoFabricacao = scanner.nextInt();
    int anoAtual = scanner.nextInt();

    // TODO Implemente a chamada do método para verificar se o carro está apto:
    String resultado = String.format("%s: %s",modelo, verificaAptidão(anoFabricacao,anoAtual) ? "Apto" : " Nao apto" ) ;
    // Exibindo o resultado
    System.out.println(resultado);

    scanner.close();
}
}