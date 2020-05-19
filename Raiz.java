/* ACH2001 - Introdução à Programação 
   EACH-USP - Primeiro Semestre de 2020 
   Turma: 2020194  - Professor:  Norton Trevisan Roman 

   Primeiro Exercício-Programação

   Luiz Fernando Conceição dos Santos                   Nº USP: 11840300

   06/05/2020 
*/ 

/* 
	Cálculo para raiz quadrada
*/

public class Raiz {
// O programa √x usando o método de aproximação de Newton para calcular a Raiz Quadrada. 

static double Auxiliar(double a) { // Método auxiliar para subtituir o valor absoluto. Retorna um número independente do seu sinal.
        if(a < 0)  // Ativa essa condição quando o a no método while for menor que 0 e retorna o valor de a positivo. 
        a = a * -1;
        return a; 
}

static double raizQuadrada(double a, double epsilon) { 
double chuteAtual; // Primeira Aproximação do Cálculo de Newton. 
double ultimoChute; // Segunda Aproximação do Cálculo de Newton. 

         if (a < 0 || epsilon <= 0  || epsilon >= 1) { // Antes de iniciar os cálculos para aproximação da raiz precisa checar essa condição. 
         return -1;                                    //Se a for menor que 0 ou epsilon for menor ou igual a 0 ou epsilon for maior ou igual a 1. 
}
         if ( a == 0) { // Caso o valor for igual a 0 será retornado o valor 0. 
         return 0;
} 
         chuteAtual = a/2; // Primeira aproximação para se aproximar da raiz quadrada. 

do {
         ultimoChute= chuteAtual; // O Cálculo da primeira aproximação vai ser guardada na variável ultimoChute. 
         chuteAtual = 0.5 * (ultimoChute + a/ultimoChute); /* Neste caso em vez de colocar 1/2 coloquei o 0.5 já calculado, porque,
         o java devolve um número como inteiro e o resultado daria 0 na divisão. */
	
}while  (Auxiliar( chuteAtual - ultimoChute) >= epsilon); // O método Auxiliar está sendo chamado para retornar um valor absoluto.
         return chuteAtual; // Retorna o chuteAtual já calculado. 
}

/* Teste do Programa*/
public static void main(String[] args) {
	{
	    double a = 63;
	    double epsilon = 0.001; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 63;
	    double epsilon = 0.1; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 144;
	    double epsilon = 0.01; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 3.14159;
	    double epsilon = 0.01; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
    }
	{
		double a = 0.14159;
	    double epsilon = 0.01; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 0.003;
	    double epsilon = 0.000001; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = -1;
	    double epsilon = 0.001; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = -12;
	    double epsilon = 0.001; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 100;
	    double epsilon = 0.0000001; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 22;
	    double epsilon = 0.03; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 64;
	    double epsilon = 0.05; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 124.2;
	    double epsilon = 0.005; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 1485;
	    double epsilon = 0.0001; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 2564.35;
	    double epsilon = 0.001; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = -15.35;
	    double epsilon = 0.01; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = Math.PI;
	    double epsilon = 0.001; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 144;
	    double epsilon = 1; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 144;
	    double epsilon = 1.2; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 144;
	    double epsilon = 0; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
	{
		double a = 144;
	    double epsilon = -1.2; // Quanto menor a precisão mais próximo fica da raiz real. 
	    System.out.println("Raiz de : "+a+" = "+raizQuadrada(a, epsilon));
	}
}
}