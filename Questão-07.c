//Questão 07->Acerca de Manipulação de Arquivos.
//a)Explique os diferentes modos de abertura de arquivos
// Os modos são especificados como uma string no segundo argumento da função fopen. Eles incluem:

// Modo de Leitura (r):Abre o arquivo para leitura. O arquivo deve existir; caso contrário, ocorre um erro.

// Modo de Escrita (w):Abre o arquivo para escrita. Se o arquivo já existir, ele será sobrescrito. Se não existir, será criado.

// Modo de Acrescentar (a):Abre o arquivo para adicionar conteúdo no final (append). Se o arquivo não existir, ele será criado.

// Modo de Leitura e Escrita (r+):Abre o arquivo para leitura e escrita. O arquivo deve existir; caso contrário, ocorre um erro.
// (w+): Abre o arquivo para leitura e escrita. O conteúdo existente será apagado. Se o arquivo não existir, ele será criado.
// (a+): Abre o arquivo para leitura e escrita. O conteúdo é adicionado ao final (não pode sobrescrever). Se o arquivo não existir, ele será criado.

// Os modos binários são similares aos modos acima, mas são usados para arquivos que não contêm texto (como arquivos de imagem, áudio, etc).
// Modos Binários:Para abrir em modo binário, adicione o caractere b:
// rb: Leitura binária.
// wb: Escrita binária (sobrescreve o conteúdo existente).
// ab: Acrescentar em binário.
// r+b ou rb+: Leitura e escrita binária.
// w+b ou wb+: Leitura e escrita binária, sobrescrevendo.
// a+b ou ab+: Leitura e escrita binária, adicionando no final.


//b) Explique o funcionamento das funções fgets, fprintf, fread, fwrite
// fgets Lê uma linha de texto de um arquivo.
// fprintf Escreve um texto formatado em um arquivo, é similar ao printf, mas direciona a saída para um arquivo.
// fread Lê dados binários de um arquivo armazena em  um buffer.
// fwrite Escreve dados binários em um arquivo gravando blocos de dados a partir de um buffer para um arquivo.