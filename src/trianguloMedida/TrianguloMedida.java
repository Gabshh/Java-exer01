package trianguloMedida;

import java.util.Scanner;

public class TrianguloMedida {

	public static void main(String[] args) {
		// Measures

		Scanner leitor = new Scanner(System.in);
		int lado1;
		int lado2;
		int lado3;
		
		System.out.print("Qual a medida do 1� lado?");
		lado1 = leitor.nextInt();
		System.out.print("Qual a medida do 2� lado?");
		lado2 = leitor.nextInt();
		System.out.print("Qual a medida do 3� lado?");
		lado3 = leitor.nextInt();
		
		leitor.close();
		
		if (lado1 + lado2 < lado3) {
			System.out.println();
			System.out.println("As medidas fornecidas n�o caracterizem um tri�ngulo!!");
		}else {
			//below the line!
			if (lado1 == lado2 & lado2 != lado3) {
				System.out.println();
				System.out.println("Seu tri�ngulo � Is�sceles!");
				
			}else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				System.out.println();
				System.out.println("Seu tri�ngulo � Escaleno!");
				
			}else if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
				System.out.println();
				System.out.println("Seu tri�ngulo � Equil�tero!");
			
			}
			
			
			}
			
		}
		
	}

