package Exercicio;
import java.util.*;
public class five {
	/*
	 * 
	 * 5- Crie um programa que leia um n�mero do teclado at� que encontre um
	n�mero igual a zero. No final, mostre a soma dos n�meros
	digitados.(DO...WHILE)
	 * 
	 * */
	static Random random = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, soma=0;
		do {
			n = random.nextInt(9);
			soma+=n;
		}while(n!=0);
		System.out.println("Soma: "+soma);
	}

}
