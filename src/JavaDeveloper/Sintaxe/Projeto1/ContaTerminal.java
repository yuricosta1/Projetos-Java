package JavaDeveloper.Sintaxe.Projeto1;

import java.util.Scanner;

public class ContaTerminal {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();
        System.out.println("Por favor, digite seu nome: ");
        conta1.cliente = scan.nextLine();
        System.out.println("Usuário: " + conta1.cliente + ", Por favor, digite o número da Agência: ");
        conta1.agencia = scan.nextLine();
        System.out.println("Usuário: " + conta1.cliente + ", Por favor, digite o número da sua conta: ");
        conta1.numero = scan.nextInt();
        conta1.saldo = 237.48;
        System.out.println("Olá " + conta1.cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        conta1.agencia  + ", o numero da sua conta é " + conta1.numero + " e seu saldo é de " + conta1.saldo +
        " já está disponível para saque");
    }
}
