#include <stdio.h>
#include <string.h>

int main()
{
    char nome[50];
    float nota;
    int frequencia;

    // Pergunta primeiro o nome do estudante
    printf("Digite o nome do estudante: ");
    fgets(nome, sizeof(nome), stdin);

    // Remove o '\n' do final do nome, se houver
    nome[strcspn(nome, "\n")] = '\0';

    printf("Digite a nota: ");
    scanf("%f", &nota);

    printf("Digite a frequencia: ");
    scanf("%d", &frequencia);

    if (nota >= 7 && frequencia >= 75)
    {
        printf("\n%s esta APROVADO!! \n", nome);
    }
    else
    {
        printf("\n%s esta REPROVADO!! \n", nome);
    }

    return 0;
}