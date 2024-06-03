package br.cefetmg.inf.lp1.contabanco;

import java.util.Scanner;

class contaBanco {
    int numero;
    double saldo;
    String agencia, cliente;
    
    void informacoesConta (){
        //saida de dados
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta"
                           + " em nosso banco, sua agência é " 
                           + agencia + ", conta " + numero +" e seu saldo " 
                           + saldo +" já está disponível para saque.");
    }
}

public class ContaTerminal {
    
    public static void main (String[] Args) {
        //criando objeto da classe Scanner
        Scanner sc = new Scanner (System.in);
        
        //criando objeto da classe contaBanco
        contaBanco conta = new contaBanco();
        
        //solicitando numero da agencia do cliente
        System.out.println("Por favor, digite o número da Agência !");
        conta.numero = sc.nextInt();
        
        //solicitando a agencia bancaria do cliente
        System.out.println("Por favor, digite a Agência !");
        sc.next();
        conta.agencia = sc.nextLine();
        
        //solicitando nome do cliente
        System.out.println("Por favor, digite o nome do cliente !");
        conta.cliente = sc.nextLine();
        
        //solicitando saldo da conta do cliente
        System.out.println("Por favor, digite o saldo da conta !");
        conta.saldo = sc.nextDouble();
        
        conta.informacoesConta();
    }
}