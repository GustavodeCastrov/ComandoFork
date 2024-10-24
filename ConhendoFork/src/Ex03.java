/*Cálculo de Potência: Calcule e imprima o valor de um número elevado a uma potência 
 * fornecida pelo usuário.
 *
 *Dev: Gustavo de Castro
 *22/10/2024
 */

import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int result = 1;
		
		System.out.println("Digite um número: ");
		int num = sca.nextInt();
		System.out.println("Digite o valor da potência: ");
		int poten = sca.nextInt();
		
		if(poten == 0) {
			result = 1;
		}
	
		else {
			for(int i = 1; i <= poten; i++) {
				result *= num;
			}
		}
		System.out.println("O valor da potência é: "+result);
		sca.close();
	}
}
