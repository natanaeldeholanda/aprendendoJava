package aprendendoJava;

import java.util.Scanner;


public class ApredendoJava {
	
		
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("==================================");
			System.out.println("     Cadastro de Clientes");
			System.out.println("==================================");
			
			System.out.print("Digite o primeiro nome: ");
			String nome1 = teclado.next();
			System.out.print("Agora digite a primeira idade: ");
			int idade1 = teclado.nextInt();
			System.out.print("Digite o segundo nome: ");
			String nome2 = teclado.next();
			System.out.print("Agora digite a segunda idade: ");
			int idade2 = teclado.nextInt();
			System.out.print("Digite o terceiro nome: ");
			String nome3 = teclado.next();
			System.out.print("Agora digite a terceira idade: ");
			int idade3 = teclado.nextInt();
					
			System.out.println("==================================");
			System.out.println("     Relatorio de Clientes");
			System.out.println("==================================");
			
			System.out.printf("%s -> %d" + " anos\n", nome1 , idade1);
			System.out.printf("%s -> %d" + " anos\n", nome2 , idade2);
			System.out.printf("%s -> %d" + " anos\n", nome3 , idade3);
			
			teclado.close();
		}
	
	}

