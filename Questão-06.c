#include <stdio.h> 

int main() {
    int i;

    i = 0;

    while (i < 10) {
        printf("while: %d\n", i);
        i++;
    }
    do {
        printf("do: %d\n", i);
        i++;
    } while (i < 10);

    return 0;
}
//a) A saída do programa acima seria:
//while: 0
//while: 1
//while: 2
//while: 3
//while: 4
//while: 5
//while: 6
//while: 7
//while: 8
//while: 9
//do: 10

//b)o While a condição é verificada antes de executar o bloco de código. Isso significa que, se a condição for falsa logo no início, o bloco de código não será executado nem uma vez. E o do-while a condição é verificada depois de executar o bloco de código. Portanto, o código será sempre executado pelo menos uma vez, independentemente da condição inicial.
//c)while loop:
//A condição i < 10 é avaliada antes do início de cada iteração.
//No início, i = 0, portanto a condição é verdadeira.
//O laço imprime "while: X" (onde X é o valor de i) e, em seguida, incrementa i.
//O loop continua até que i < 10 se torne falso. Após a última execução, i será igual a 10, então o loop termina.

//do-while loop:
//Quando o controle alcança o do-while, i já foi incrementado para 10.
//O código dentro do bloco do será executado ao menos uma vez antes que a condição seja avaliada.
//A condição i < 10 é verificada após a execução do bloco. Como i = 10, a condição é falsa, e o do-while termina.

//d)O while é usado quando a repetição depende apenas de uma condição lógica e quando a condição depende de algo que muda de forma imprevisível, como a entrada do usuário ou o estado de uma variável. E o for é usado quando você já sabe o número de iterações ou precisa de um contador.