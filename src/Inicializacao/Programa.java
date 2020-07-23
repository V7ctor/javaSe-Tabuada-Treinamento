package Inicializacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número: ");
		int n = sc.nextInt();
		
		System.out.println("Tabuada do "+n);
		for (int i = 1; i <= 10; ++i) {
			System.out.println(n + "x"+ i + " = " + (n * i));
		}
		
		sc.close();
	}

}
