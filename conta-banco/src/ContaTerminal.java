import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Informe o número da conta: ");
        int numero = scanner.nextInt();

        
        System.out.println("Digite o número da agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        
        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é: " + agencia + ", conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque");
        
        
    }
}
