import java.util.Scanner;

public class acoes{ 

public static void main(String[]args) {
double n1,n2,q1,q2; 	

Scanner input = new Scanner(System.in); 
System.out.println("Qual foi o valor da sua primeira compra colega ");
n1 = input.nextDouble(); 
System.out.println("E a quantidade colega ");
q1 = input.nextDouble();
System.out.println("Agora preciso saber o valor da segunda compra ");
n2 = input.nextDouble();
System.out.println("Qual seria a quantidade dessa compra agora ");
q2 = input.nextDouble();

double r1 = n1*q1;
double r2 = n2*q2;
double r3 = r1+r2;
double r4 = r3 / (q1+q2); 

System.out.println(" Sua media e " + r4);
}
}