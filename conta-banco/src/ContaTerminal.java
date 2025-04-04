import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Digite o numero da agencia: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o nome do cliente: ");
        String nome_cliente = scanner.nextLine();

        System.out.println("Digite o saldo contido: (ex:9999,99)");
        double saldo = scanner.nextDouble();


        System.out.printf("Olá %s, sua agência é %s, conta %d e seu saldo é %.2f reais.%n", 
                  nome_cliente, agencia, numero, saldo);
        scanner.close();
    }
}



