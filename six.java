package Exercicio;
import java.util.*;
public class six {
	/*
	 * 6- Escrever um programa que receba vários números inteiros no teclado. E no
	final imprimir a média dos números múltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)*/
	static Random random = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float  media, n, i=0,j=0, qtdd=0;
		do {
			n = random.nextInt(9);
			if(n%3==0) {
				j+=n;
				i+=1;
			}
			qtdd+=1;
			System.out.print(n+", ");
		}while(n!=0);
		media=j/i;
		System.out.println("\nQtdd total: "+qtdd+"\nQtdd de nº %3==0: "+i+"\nSoma dos nº %3==0: "+j+"\nMedia: "+media);
	}

}
