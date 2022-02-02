import java.util.Scanner;
import java.util.Timer;

public class Operacao {

	
	Timer timer1 = new Timer();

	public static void main(String[] args) {
		
		
		Cliente Weslen = new Cliente();
		Weslen.setNome("Weslen Lima");
		
		Conta cc = new ContaCorrente(Weslen);
		Conta poupanca = new ContaPoupanca(Weslen);
		
		System.out.println("                    °°°° Bem vindo ao Bank °°°°"); 
		System.out.println("             °°°° Qual operação deseja efetuar hoje? °°°°\n\n");
		
		Scanner teclado = new Scanner(System.in);	
		System.out.println("Qual operação gostaria de efetuar?");	
		System.out.println("1-Depósito");
		System.out.println("2-Saque");
		System.out.println("3-transferir");
		System.out.println("4-Imprimir Extrato");
		System.out.println("5-Sair");
		int resposta = teclado.nextInt();
		
		
		switch(resposta) {
		
		case 1: System.out.println("Qual valor gostaria de depositar?\n");
			double valorDeposito = teclado.nextInt();
			cc.depositar(valorDeposito);
			
			
			System.out.println("Gostaria de imprimir o extrato?"); 
			System.out.println("1-Para sim");
			System.out.println("2-Para não");
			int resposta1 = teclado.nextInt();
				if (resposta1 == 1) {
					cc.imprimirExtrato();
				} 	else if (resposta1 == 2) {
						System.out.println("Saindo........\n"); break;
				} 	else {
						System.out.println("Opção inválida"); break;
				
			}
				
		case 2: System.out.println("Qual valor gostaria de sacar?\n");
			int valorSaque = teclado.nextInt();
			cc.sacar(valorSaque);
			
			System.out.println("Gostaria de imprimir o extrato?"); 
			System.out.println("1-Para sim");
			System.out.println("2-Para não");
			int resposta2 = teclado.nextInt();
			if (resposta2 == 1) {
				cc.imprimirExtrato();
			} 	else if (resposta2 == 2) {
					System.out.println("Saindo........\n"); break;
			} 	else {
					System.out.println("Opção inválida"); break;
			
		}			
			
			
		case 3: System.out.println("Qual valor gostaria de Transferir?\n");
			int valorTransferir = teclado.nextInt();
			cc.transferir(valorTransferir, poupanca); 
			poupanca.imprimirExtrato(); break;
			
			
		case 4: System.out.println("Imprimindo Extrato......\n");		
			cc.imprimirExtrato();
			poupanca.imprimirExtrato(); break;
			
		case 5: System.out.println("Saindo........\n");	break;
		
		default: System.out.println("Opção Invalida");
		
		
		}				
		
	}	

}
