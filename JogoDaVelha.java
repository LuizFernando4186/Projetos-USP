/* ACH2001 - Introdução à Programação 
   EACH-USP - Primeiro Semestre de 2020 
   Turma: 2020194  - Professor:  Norton Trevisan Roman 

   Terceiro Exercício-Programação

   Luiz Fernando Conceição dos Santos                   Nº USP: 11840300

   01/06/2020 
*/ 

/*
	Jogo da Velha - programa para verificar o status de um jogo.
	
	Lista de Status calculado:
	0 - Jogo não iniciado: o tabuleiro está 'vazio', isto é sem peças X e O;
    1 - Jogo encerrado1: o primeiro jogador (que usa as peças X) é o ganhador;
    2 - Jogo encerrado2: o segundo jogador (que usa as peças O) é o ganhador;
    3 - Jogo encerrado3: empate - todas as casas do tabuleiro estão preenchidas com X e O, mas nenhum dos jogadores ganhou;
    4 - Jogo já iniciado e em andamento: nenhuma das alternativas anteriores.	
*/

public class JogoDaVelha {
	static final char pecaX = 'X';
	static final char pecaY = 'O';
	static final char espacoVazio = ' ';

	/*
		Determina o status de uma partida de Jogo da Velha
		
		Entrada:
			tabuleiro - matriz 3x3 de caracteres representando uma partida valida de Jogo da Velha
			
		Saída:
			um inteiro contendo o status da partida (valores válidos de zero a quatro)
	*/
	static int verificaStatus(char[][] tabuleiro) {
		int status = -1;
		int vazio = 0; 
		int vencedor1 = 1; 
		int vencedor2 = 2; 
		int empate = 3; 
		int andamento = 4; 
		
    // Primeiramente antes de iniciar a checagem do status do jogo precisa verificar se o tabuleiro está vazio. 
    if ( tabuleiro[0][0]==' ' && tabuleiro[1][0]==' ' && tabuleiro[2][0]==' '
    && tabuleiro[0][1]==' ' && tabuleiro[1][1]==' ' && tabuleiro[2][1]==' '
    && tabuleiro[0][1]==' ' && tabuleiro[1][1]==' ' && tabuleiro[2][1]==' '){
	
	status = vazio;	
	return status; 
    }
    //Checar X verticalmente
    if(tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro [2][0] == 'X'){ // Na matriz [L][C] se for igual a peça 'X' é vitória do jogador 1.
	    status = vencedor1; 
        return status;
    }
     else if(tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X'){ // Na matriz [L][C] se for igual a peça 'X' é vitória do jogador 1.
	   status = vencedor1; 
	   return status;
     }
     else if(tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X'){ // Na matriz [L][C] se for igual a peça 'X' é vitória do jogador 1.
		status = vencedor1; 
        return  status;
    }

     //Checar X horizontalmente
     else if(tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X'){ // Na matriz [L][C] se for igual a peça 'X' é vitória do jogador 1.
    status = vencedor1;  
    return  status;
    }
    else if(tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X'){ // Na matriz [L][C] se for igual a peça 'X' é vitória do jogador 1.
    status = vencedor1; 
    return status;
    } 
    else if(tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X'){ // Na matriz [L][C] se for igual a peça 'X' é vitória do jogador 1.
    status = vencedor1; 
    return status;
    }
    //Checar X diagonalmente
    else if(tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X'){ // Na matriz [L][C] se for igual a peça 'X' é vitória do jogador 1.
    status = vencedor1; 
    return status;
    }
    else if(tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X'){ // Na matriz [L][C] se for igual a peça 'X' é vitória do jogador 1.
    status = vencedor1; 
    return status;
    }
    //Checar O verticalmente 
    if(tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro [2][0] == 'O'){ // Na matriz [L][C] se for igual a peça 'O' é vitória do jogador 2. 
    status = vencedor2; 
    return status;
    }
    else if(tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O'){ // Na matriz [L][C] se for igual a peça 'O' é vitória do jogador 2. 
    status = vencedor2;
    return status;
    }
    else if(tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O'){ // Na matriz [L][C] se for igual a peça 'O' é vitória do jogador 2. 
    status = vencedor2;
    return status;
    }

    //Checar O horizontalmente
    if(tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O'){ // Na matriz [L][C] se for igual a peça 'O' é vitória do jogador 2. 
    status = vencedor2;
    return status;
    }
    else if(tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O'){ // Na matriz [L][C] se for igual a peça 'O' é vitória do jogador 2. 
    status = vencedor2;
    return status;
    }
    else if(tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O'){ // Na matriz [L][C] se for igual a peça 'O' é vitória do jogador 2. 
    status = vencedor2; // Status está recebendo o valor do vencedor 2 que é a peça O.
    return status;
    }

    //Checar O diagonalmente
    if(tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O'){
    status = vencedor2; // Status está recebendo o valor do vencedor 2 que é a peça O.
    return status;
    }
    else if(tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O'){
    status = vencedor2; // Status está recebendo o valor do vencedor 2 que é a peça O. 
    return status; 
    }
    //verificar se tem empate
    if(tabuleiro[0][0]!=' ' && tabuleiro[1][0]!=' ' && tabuleiro[2][0]!=' ' // Nas posições [L][C] precisam ser diferente de espaço vazio. 
    && tabuleiro[0][1]!=' ' && tabuleiro[1][1]!=' ' && tabuleiro[2][1]!=' '
    && tabuleiro[0][1]!=' ' && tabuleiro[1][1]!=' ' && tabuleiro[2][1]!=' '){
	status = empate; // Status está recebendo o valor de empate. 
	return status; 
}

{
	status = andamento; // Nenhuma das opções anteriores retorne status em andamento. 
	return status; 
}
}
	

	//TESTE DO PROGRAMA 
	
	public static void main(String[] args) {
		char[][] tab0 = {{'X','O',' '},{'O','X',' '},{' ',' ','X'}};
		char[][] tab1 = {{'X','X','O'},{'O','O','X'},{'X','O',' '}};
		char[][] tab2 = {{'O','X','X'},{'X','O','X'},{' ',' ','O'}};
		char[][] tab3 = {{'O','X','X'},{'X','O','O'},{'O','X','X'}};
		char[][] tab4 = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};

		System.out.println("Status calculado: " + verificaStatus(tab0));
		System.out.println("Status esperado para o tabuleiro0: 0\n");

		System.out.println("Status calculado: " + verificaStatus(tab1));
		System.out.println("Status esperado para o tabuleiro1: 1\n");

		System.out.println("Status calculado: " + verificaStatus(tab2));
		System.out.println("Status esperado para o tabuleiro2: 2\n");
		
		System.out.println("Status calculado: " + verificaStatus(tab3));
		System.out.println("Status esperado para o tabuleiro1: 3\n");
		
		System.out.println("Status calculado: " + verificaStatus(tab4));
		System.out.println("Status esperado para o tabuleiro4: 4\n");
		

	}

}