//Questão 10-> Uma lista encadeada é uma estrutura de dados em que cada nó contém dois componentes(dados e o endereço do próximo nó).
//A Raiz (aluno_root) contém o endereço do primeiro item da lista, a partir daí, cada elemento vai ter o endereço do próximo elemento, o último aponta para NULL.
//Cada novo elemento inserido passa a ser o último elemento e seu endereço fica armazenado no antigo elemento da lista.Crie um programa em C a partir da seguinte estrutura:
// typedef struct Aluno{
//     char nome[100];
//     int faltas;
//     float nota;
//     struct Aluno *prox; 
// }aluno_t;

// aluno_t*aluno_root;

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Aluno {
    char nome[100];
    int faltas;
    float nota;
    struct Aluno *prox;
} aluno_t;

aluno_t *aluno_root = NULL;

aluno_t* criar_aluno(const char *nome, int faltas, float nota) {
    aluno_t *novo_aluno = (aluno_t *)malloc(sizeof(aluno_t));
    if (novo_aluno == NULL) {
        printf("Erro ao alocar memoria.\n");
        return NULL;
    }
    strncpy(novo_aluno->nome, nome, sizeof(novo_aluno->nome));
    novo_aluno->faltas = faltas;
    novo_aluno->nota = nota;
    novo_aluno->prox = NULL;
    return novo_aluno;
}

void adicionar_aluno(aluno_t **root, const char *nome, int faltas, float nota) {
    aluno_t *novo_aluno = criar_aluno(nome, faltas, nota);
    if (*root == NULL) {
        *root = novo_aluno;
    } else {
        aluno_t *temp = *root;
        while (temp->prox != NULL) {
            temp = temp->prox;
        }
        temp->prox = novo_aluno;
    }
}

void exibir_alunos(aluno_t *root) {
    aluno_t *temp = root;
    while (temp != NULL) {
        printf("Nome: %s", temp->nome);
        printf("Faltas: %d\n", temp->faltas);
        printf("Nota: %.2f\n", temp->nota);
        printf("---------------\n");
        temp = temp->prox;
    }
}

int main() {
    adicionar_aluno(&aluno_root, "Fulano\n", 5, 8.5);
    adicionar_aluno(&aluno_root, "Neymar\n", 8, 9.0);
    adicionar_aluno(&aluno_root, "Alanzoka\n", 12, 4.7);

    printf("Lista de Alunos:\n");
    exibir_alunos(aluno_root);

    aluno_t *temp;
    while (aluno_root != NULL) {
        temp = aluno_root;
        aluno_root = aluno_root->prox;
        free(temp);
    }

    return 0;
}

//Saída-> 
// Nome: Fulano
// Faltas: 5
// Nota: 8.50
// ---------------
// Nome: Neymar
// Faltas: 8
// Nota: 9.00
// ---------------
// Nome: Alanzoka
// Faltas: 12
// Nota: 4.70
// ---------------