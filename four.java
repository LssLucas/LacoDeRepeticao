package Exercicio;
import java.util.*;
public class four {
	/*
	 * 
	 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
	psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	pessoas, calcule e mostre: (WHILE)
	 o número de pessoas calmas;
	 o número de mulheres nervosas;
	 o número de homens agressivos;
	 o número de outros calmos;
	 o número de pessoas nervosas com mais de 40 anos;
	 o número de pessoas calmas com menos de 18 anos.
	 * 
	 * */
	static Random random = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float idade [] = new float [150];
		float s [] = new float [150];
		float outros [] = new float [150];
		int i=0, outras_s;
		float s1, s2, s3, s4, s5, s6, o_1=0, m_1=0, h_3=0, s3_o1=0, o2_i40=0, o1_i18=0;
		while(i<150) {
			idade[i] = random.nextInt(100);
			s[i] = random.nextInt(3)+1;
			outros [i] = random.nextInt(3)+1;
			if(outros[i]==1) {
				o_1++;
			}
			if(s[i]==1 && outros[i]==2) {
				m_1++;
			}
			if(s[i]==2 && outros[i]==3) {
				h_3++;
			}
			if(s[i]==3 && outros[i]==1) {
				s3_o1++;
			}
			if(outros[i]==2 && idade[i]>40) {
				o2_i40++;
			}
			if(outros[i]==1 && idade[i]<18) {
				o1_i18++;
			}
			i++;
		}
		s1 = (o_1/i)*100;
		s2 = (m_1/i)*100;
		s3 = (h_3/i)*100;
		s4= (s3_o1/i)*100;
		s5= (o2_i40/i)*100;
		s6= (o1_i18/i)*100;
		System.out.println("\nPessoas calmas: "+o_1+" representam "+s1+"%\nMulheres nervosas: "+m_1+" representam "+s2+"%\nHomens agressivos: "+h_3+" representam "+s3+"%\nOutros calmos: "+s3_o1+" representam "+s4+"%\nPessoas nervosas >40: "+o2_i40+" representam "+s5+"%\nPessoas calmas <18: "+o1_i18+" representam "+s6+"%");
	}

}
