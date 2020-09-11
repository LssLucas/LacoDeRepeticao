package Exercicio;
import java.lang.*;
public class one {
	/*
	 * 1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
	obtemos resto = 5. (FOR)
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, cont=0;
		for(i=1000;i<2000;i++) {
			if(i%11 == 5) {
				cont++;
				System.out.println("O numero "+i+"/11 resta 5");
			};
		};
		System.out.println(cont+" numeros atendem o requisito");
	}

}
