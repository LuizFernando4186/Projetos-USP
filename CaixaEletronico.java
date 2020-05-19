/* ACH2001 - Introdução à Programação 
   EACH-USP - Primeiro Semestre de 2020 
   Turma: 2020194  - Professor:  Norton Trevisan Roman 

   Primeiro Exercício-Programação

   Luiz Fernando Conceição dos Santos                   Nº USP: 11840300

   15/04/2020 
*/

/* 
    Caixa eletrônico das Ilhas Weblands, com estoque ilimitado de cédulas de B$50,00, B$10, B$5 e B$1,00.
*/

public class CaixaEletronico {   
// O programa calculará a quatidade mínima de notas que um cliente sacará do "caixa". 
static int n50; // Reservar um valor inteiro na memória e chamando de n50 que seria 50,00 reais.
static int n10; // Reservar um valor inteiro na memória e chamando de n10 que seria 10,00 reais. 
static int n5;  // Reservar um valor inteiro na memória e chamando de n5 que seria 5,00 reais. 
static int n1;  // Reservar um valor inteiro na memória e chamando de n1 que seria 1,00 real. 

static int valor; // Valor que será retirado 
static int Resto; //Variável de Resto na operação

static void fazRetirada(int valor) { 
if (valor <0){  // Caso o valor a ser retirado for menor que 0 ele será executado. 
	n50= -1;   // Se for menor que 0 o resultado vai ser -1 
	n10= -1;
	n5= -1;
	n1= -1;
}
if (valor >= 0) { // Caso a variável valor for maior ou igual que 0 o comando é executado. 
n50=(valor/50); // Primeiro a variável n50 recebe o valor sacado dividido por 50 reais para saber quantas notas de 50 reais o valor sacado vai ter. 
Resto=valor%50; // A variável Resto está recebendo o resto da divisão anterior usando o %. 
n10=Resto/10; // A variável n10 está recebendo a divisão do Resto de n50 e dividindo por 10 reais. 
Resto=Resto%10; // A variável Resto está recebendo o resto da divisão anterior. 
n5=Resto/5; // A variável n5 está recebendo a divisão do Resto anterior dividido por 5 reais. 
Resto=Resto%5; // A variável Resto está recebendo o resto da divisão Resto/5. 
n1=Resto; // A variável n1 caso sobre algo ela receberá o resto de todo o cálculo acima. 

} 

          }
		  
// Apenas para o teste do programa 
public static void main(String[] args) { 

fazRetirada(0);
System.out.println("Notas de 50: "+n50);
System.out.println("Notas de 10: "+n10);
System.out.println("Notas de 5: "+n5);
System.out.println("Notas de 1: "+n1);



}             
         }
