//Questão 08->Acerca de alocação dinâmica de memória. Responda:
//a) Qual o comportamento da função free?
//A função free libera o espaço de memória previamente alocado por malloc, calloc ou realloc. Isso devolve a memória ao sistema, tornando-a disponível para futuras alocações.

//b) Após chamar free, o ponteiro pode ser utilizado?
//O ponteiro não deve ser acessado, pois ele agora aponta para uma área de memória inválida.

//c) O que causa vazamentos de memória?
//Ocorrem quando a memória alocada dinamicamente não é liberada (com free) antes que seu ponteiro seja perdido ou reutilizado. Isso faz com que essa memória permaneça ocupada, mesmo que não seja mais necessária.

//d) O que a instrução malloc retorna quando não consegue realizar a alocação?
//Retorna um ponteiro NULL

//e) Explique a instrução calloc.
//aloca memória para um número específico de elementos e inicializa todos os bytes com zero, útil para evitar valores não inicializados.

//f) Qual a diferença entre as instruções malloc e calloc?
//Malloc não inicializa a memória alocada (os valores contêm lixo) e requer apenas o tamanho total em bytes.
//Calloc inicializa a memória com zeros e precisa do número de elementos e o tamanho de cada elemento.

//Questão 09-> Crie um programa em C que carregue dinamicamente(via malloc) um novo aluno, carregue os dados dele e exiba em um printf.
//Apresente também se ele foi ou não aprovado.
//Sobre a seguinte Estrutura:
//typedef struct Aluno {
//     char nome[100]
//     int faltas;
//     float nota;
// }aluno_t;

#include <stdio.h>
#include <stdlib.h>

typedef struct Aluno {
    char nome[100];
    int faltas;
    float nota;
} aluno_t;

int main() {
    aluno_t *aluno = (aluno_t *)malloc(sizeof(aluno_t));
    if (aluno == NULL) {
        printf("Erro ao alocar memoria.\n");
        return 1;
    }

    printf("Digite o nome do aluno: ");
    fgets(aluno->nome, sizeof(aluno->nome), stdin);

    printf("Digite o numero de faltas: ");
    scanf("%d", &aluno->faltas);

    printf("Digite a nota do aluno: ");
    scanf("%f", &aluno->nota);

    printf("\nInformacoes do Aluno:\n");
    printf("Nome: %s", aluno->nome);
    printf("Faltas: %d\n", aluno->faltas);
    printf("Nota: %.2f\n", aluno->nota);

    if (aluno->nota >= 5.0 && aluno->faltas <= 10) {
        printf("Situacao: Aprovado\n");
    } else {
        printf("Situacao: Reprovado\n");
    }

    free(aluno);

    return 0;
}
