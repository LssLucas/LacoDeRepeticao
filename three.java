package Exercicio;
import java.util.*;
public class three {
	/*
	 * 
	 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade,menor=0, maior=0, total=0;
		float  p_menor, p_maior=0;
		Scanner read = new Scanner (System.in);
		
		System.out.println("Digite sua idade");
		idade = read.nextInt();
		while(idade!=-99) {
			if(idade<21) {
				menor+=1;
			}else if(idade>50) {
				maior+=1;
			}
			total+=1;
			System.out.println("Digite sua idade");
			idade = read.nextInt();
		}
		p_menor=(menor/total);
		p_maior=(maior/total);
		System.out.println("Total de idades lidas: "+total+"\nMenores que 21: "+menor+" - representam "+p_menor+"%");
		System.out.println("\nMaiores que 50: "+maior+" - represetam "+p_maior+"%");
	}

}
