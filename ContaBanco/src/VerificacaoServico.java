import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];

        boolean contratado = false;
        for (int c = 1 ; c < partes.length; c++ ) {
            if (partes[c].equals(servico)) {
                contratado = true;
                break;
            }
        }
        
        String res = (contratado) ? "Sim" : "Nao";
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        System.out.print(res);
        scanner.close();
    }
}

