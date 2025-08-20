import java.text.DecimalFormat;
import java.util.Scanner;

public class DescontoInteligente {
    private static double valorDesconto( double valorOriginal, double desconto ){
        return valorOriginal * (desconto/100);
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Leia o valor original do produto:
        Double valorOriginal = scanner.nextDouble();
        // TODO: Leia a porcentagem de desconto:        
        Double desconto = scanner.nextDouble();
        // TODO: Verifique se o desconto está dentro de um intervalo válido:
        if( desconto < 0 || desconto > 100){
            System.out.println("Desconto invalido\n");
            return;
        }
            // TODO: Calcule o valor final do produto:
            Double valorFinal = valorOriginal - valorDesconto(valorOriginal, desconto);
            
            // Formata e exibe o valor com duas casas decimais
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(valorFinal));
        

        scanner.close();
    }
}