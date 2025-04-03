//Questão 11-> Sobre algumas estruturas de dados, responda:
//a) Qual a diferença entre as estruturas pilha e fila?
// A pilha funciona no esquema LIFO (Last In, First Out), ou seja, o último elemento a entrar é o primeiro a sair. E a Fila funciona no esquema FIFO (First In, First Out), ou seja, o primeiro elemento a entrar é o primeiro a sair.

//b) Quais as vantagens da fila? Quais suas desvantagens?
// Útil para gerenciamento de tarefas em ordem, como processamento de dados ou controle de filas de espera, mas dependendo da implementação podem ser menos eficientes como em filas estáticas o espaço pode ser subutilizado.

//c) Quais as vantagens da pilha? Quais suas desvantagens?
// Excelente para gerenciar tarefas onde o último elemento precisa ser processado primeiro, mas Não permite acesso direto a elementos intermediários e requer cuidado ao lidar com overflow ou underflow, especialmente em pilhas implementadas com arrays.

//d) Quais as suas aplicações?
// Avaliação de expressões (exemplo: expressão pós-fixada).
// Gerenciamento de chamadas recursivas.
// Desfazer/refazer em editores de texto.
// Gestão de filas de impressão.
// Agendamento de processos no sistema operacional.
// Modelagem de sistemas de filas, como atendimento bancário ou tráfego de rede
//e) Qual a diferença deles para a lista?
// Diferentemente de pilhas e filas, listas podem ser usadas para inserções ou exclusões em qualquer posição e são estruturas mais flexíveis, permitindo acesso a qualquer elemento. Além disso listas podem ser implementadas como listas encadeadas ou listas estáticas (arrays), enquanto pilhas e filas possuem restrições em como os elementos são adicionados/removidos.
