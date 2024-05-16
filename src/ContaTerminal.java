//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o usuário
        // Obter pela scanner os valores digitados no terminal

        System.out.print("Digite seu nome: ");
        String cliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o saldo: ");
        float saldo = scanner.nextFloat();

        // Exibir a mensagem conta criada
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque.");
    }
}