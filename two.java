package Exercicio;
import java.lang.*;
import java.util.Random;
public class two {
	/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
	static Random random = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, par=0, impar=0;
		int v[] = new int [11];
		for(i=0;i<11;i++) {
			v[i] = random.nextInt(9);			
			if(i%2 == 0) {
				par+=1;
			}else {
				impar+=1;
			};
			System.out.println(v[i]+" ");
		};
		System.out.println("Qtdd de n� pares: "+par+"\nQtdd de n� �mpares: "+impar);
	}

}
