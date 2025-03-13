//Questão 5-> a)Explique o funcionameno de um vetor e como ele é tratado no C.
//Um vetor (array) em C é uma estrutura de dados que armazena vários elementos do mesmo tipo em posições consecutivas da memória. Ele funciona como uma lista de valores, acessíveis por um índice numérico.
//Exemplo de tratamento de Vetor(Cálculo da média das valores do vetor):
#include <stdio.h>
int main(){
    int v[5];
    float m;

    v[0]= 50;
    v[1]= 40;
    v[2]= 30;
    v[3]= 20;
    v[4]= 10;

    m=(v[0]+ v[1] + v[2] +v[3] + v[4]) / 5;
    printf("Resultado: %f\n", m);
    
}
//Saída -> Resultado: 30.000000

//b)Explique o que uma string e como ela é tratada em C
//Em C, string são caracteres armazenados em um vetor de char.são armazenados de forma contígua na memória, e o último caractere sempre será \0, indicando o final da string. Existem vários tipos de tratamentos como: leitura, modificações de string e outros tipos de tratamento que podem acontecer através de funções da biblioteca <string.h>.
//Exemplo de tratamento de uma string(obtendo o Tamanho da String):
#include <stdio.h>
#include <string.h>

int main() {
    char nome[] = "Carlos";
    printf("Tamanho da string: %lu\n", strlen(nome));  
    return 0;
}
//saída-> Tamanho da string: 6