import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    float saldo;
    Scanner scanner = new Scanner(System.in);
    
    ContaTerminal(){
        System.out.print("Por favor, digite o número da Conta !");
        this.numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência !");
        this.agencia = scanner.next();

        System.out.print("Por favor, digite o seu nome !");
        this.nomeCliente = scanner.next();

        System.out.print("Por favor, digite o seu Saldo !");
        this.saldo = scanner.nextFloat();
    }

    public void infoConta(){
        System.out.printf("Olá  %s, obrigado por criar uma conta em nosso banco, sua agência é  %s, conta %d e seu saldo %.2f já está disponível para saque\n",
            this.nomeCliente , this.agencia , this.numero, this.saldo);
    }

}
