import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int numConta = 001;
        int saldo = 0;
        
        System.out.println("Informe seu nome completo: ");
        String novoUsuario = sc.next();

        System.out.println("Bem-vindo: "+ novoUsuario);
        System.out.println("Número da conta: " +numConta);
        System.out.println("Saldo: "+ saldo);

        
        sc.close();
    }
}
