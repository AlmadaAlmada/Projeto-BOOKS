# Projeto BOOKS
Descrição do Projeto:

Este projeto foi desenvolvido como parte da disciplina de Programação Orientada a Objetos (POO) no curso de Engenharia de Software da Universidade Tecnológica Federal do Paraná (UTFPR). O objetivo principal do projeto é implementar uma aplicação Java com interface gráfica utilizando os componentes do pacote javax.swing. A aplicação permite a consulta de livros através da API REST do Google Books e exibe as informações relevantes dos livros encontrados. Após a busca, a aplicação exibe na tela as seguintes informações sobre o livro:

- Título
- Autores
- Editora
- Disponibilidade de PDF
- Valor
  
Como Executar o Projeto:

Clone este repositório em sua máquina local. Certifique-se de ter o JDK instalado. A aplicação foi desenvolvida usando o Java 19, mas versões posteriores devem funcionar corretamente.

- Compile o código fonte: javac -d bin -sourcepath src src/com/seuprojeto/Main.java
- Execute a aplicação: java -cp bin com.seuprojeto.Main

Na interface gráfica que será exibida, insira o título ou autor de um livro na barra de pesquisa e clique em "Pesquisar". As informações do livro serão exibidas em seguida.

Tecnologias Utilizadas:

- Linguagem de Programação: Java
- Interface Gráfica: javax.swing
- Consumo de API REST: Utilização de bibliotecas Java para realizar requisições HTTP e processar as respostas JSON da API do Google Books.

Contribuidores:

Gabriel Morais Jatobá Coasto - Desenvolvimento
Vinícius Almada dos Santos - Desenvolvimento

Licença:

Este projeto foi desenvolvido para fins educacionais e não possui uma licença específica.



