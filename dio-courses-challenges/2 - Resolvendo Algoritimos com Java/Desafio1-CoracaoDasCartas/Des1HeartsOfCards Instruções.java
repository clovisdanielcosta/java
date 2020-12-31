// Desafio: O Coração das Cartas

/* 

Detalhes:

É individual e jogado com três pilhas, inicialmente com o mesmo 
número de cartas. Cada carta tem um valor numérico inteiro de 0 até 9. 
O jogador pode, a qualquer momento ver o valor de qualquer carta, 
mas só pode jogar com as cartas que estão no topo das pilhas. 
Em cada rodada, o jogador pode remover qualquer combinação de cartas 
que estejam no topo da pilha (pode escolher 1, 2 ou até 3 cartas) 
cuja soma dos valores seja múltiplo de 3. 
O jogo é ganho quando todas as cartas forem removidas das pilhas. 
Se alguma carta não puder ser removida, perde-se o jogo.  

Entrada
1 - A entrada é composta por várias instâncias. 
2 - Cada instância é iniciada por um inteiro N (0 ≤ N ≤ 100), que identifica o 
número de cartas em cada pilha. 
3 - A entrada termina quando N = 0. 
4 - Cada uma das N linhas seguintes contém três inteiros A, B e C, que descrevem 
5 - os valores numéricos das cartas em um nível da pilha (0 ≤ A, B, C ≤  9). 
6 - As pilhas são descritas do topo até o fundo.

Saída
Para cada instância, imprima uma linha contendo o número 1 se o jogador pode 
ganhar a instância do jogo ou o número 0 se o jogo for impossível.

Exemplo 1:
Entrada
2
1 1 1
2 0 4
Saída
1

Exemplo 2:
3
1 0 0
0 1 0
0 0 0
0
Saída
0

*/