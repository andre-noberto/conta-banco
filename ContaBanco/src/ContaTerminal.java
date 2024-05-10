import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);        
    
        System.out.println("Olá! Por favor digite o número de sua agência: ");
        int agencia = scanner.nextInt();
            
        //String nome = scanner.next();
            
        System.out.println("Digite o número da sua conta: ");
        int conta = scanner.nextInt();
            
        //String sobrenome = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        double saldo = 100.50;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", sua conta é " + conta + ". Você já tem o saldo de " + saldo + " disponível para saque." );
    }
    
}
