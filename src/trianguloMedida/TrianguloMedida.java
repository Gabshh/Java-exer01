package trianguloMedida;

import java.util.Scanner;

public class TrianguloMedida {

	public static void main(String[] args) {
		// Measures

		Scanner leitor = new Scanner(System.in);
		int lado1;
		int lado2;
		int lado3;
		
		System.out.print("Qual a medida do 1º lado?");
		lado1 = leitor.nextInt();
		System.out.print("Qual a medida do 2º lado?");
		lado2 = leitor.nextInt();
		System.out.print("Qual a medida do 3º lado?");
		lado3 = leitor.nextInt();
		
		leitor.close();
		
		if (lado1 + lado2 < lado3) {
			System.out.println();
			System.out.println("As medidas fornecidas não caracterizem um triângulo!!");
		}else {
			//below the line!
			if (lado1 == lado2 & lado2 != lado3) {
				System.out.println();
				System.out.println("Seu triângulo é Isósceles!");
				
			}else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				System.out.println();
				System.out.println("Seu triângulo é Escaleno!");
				
			}else if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
				System.out.println();
				System.out.println("Seu triângulo é Equilátero!");
			
			}
			
			
			}
			
		}
		
	}

