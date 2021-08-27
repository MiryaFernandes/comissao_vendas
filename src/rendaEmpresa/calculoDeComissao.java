package rendaEmpresa;

import java.util.Scanner;


public class calculoDeComissao {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		String nome;
		double anos, vendas;
		
		
		System.out.print("Nome do(a) vondedor(a): ");
		nome = leitor.next();
		
		System.out.println("Anos de trabalho: ");
		anos = leitor.nextDouble();
		
		System.out.println("Total de vendas: ");
		vendas = leitor.nextDouble();
		
		leitor.close();
		
		if (vendas < 20000 && vendas > 10000 && anos >= 1) { 
			
			double por1 = vendas*5/(100); 
			System.out.println(nome + "a sua comissão será: " + por1);
					
		} else if (vendas >= 20000 && anos >= 1) { 
			
		    double por2 = vendas*10/(100);
		    System.out.println(nome + "a sua comissão será: " + por2);
		
			}  else {
				
				double por3 = vendas*3/(100);
				System.out.println(nome + " sua comissão será: " + por3);				
				
			}
	
}
	
}
