
# Conversor de Instruções MIPS para Binary

## Descrição do Projeto
Esse projeto foi desenvolvido como parte da disciplina de Arquitetura de Computadores. O objetivo é criar um programa que leia um arquivo com instruções MIPS e gere um novo arquivo com a representação binária correspondente.
### Autor
- Lucas Martins da Silva Cruz

## Estrutura do Projeto
### Classes 
- Main: Esta classe instancia um objeto Da classe `ReaderAndWriter` e chama seu método `reader`, passando o caminho do arquivo a ser lido.
- ReaderAndWriter: Esta classe é responsável por ler as instruções do arquivo. Após ler o arquivo, instancia um objeto da classe `Translator` e passa a linha de instruções que acabou de ler. Em seguida, direciona a resposta da classe 'Translator' para o método `writer`, que escreve as instruções em binário no novo arquivo.
- Translator: Recebe a linha de comandos MIPS, separa instruções e registradores em um vetor e identifica qual o tipo da instrução, através do método `translate`. Após isso, passa para o método `toBinary` da classe que corresponde ao tipo de instrução, r,i ou j. Por fim, retorna uma String com as intruções já traduzidas.
- J: Possui os métodos necessários para transformar uma instrução MIPS tipo j em sua representação binária.
- R: Possui os métodos necessários para transformar uma instrução MIPS tipo r em sua representação binária.
- I: Possui os métodos necessários para transformar uma instrução MIPS tipo i em sua representação binária.
- FixBinary: Responsável por converter números de decimal para binário e adicinao zeros à esquerda, quando necessário.
- Instructions: Possui um `HashMap` para cada tipo de instrução MIPS, tipo r, tipo i ou tipo j. Possue também os métodos necessários para buscar cada instrução.
- Registrars: Possui um `HashMap` com os registradores e os métodos necessários para buscar cada um deles. 

# Instruções para Execução
Coloque as instruções MIPS no arquivo `program.txt` e execute o programa. O programa ira ler as instruções, traduzir para sua representação binária e escrever no arquivo `programOut.txt` o resultado.
