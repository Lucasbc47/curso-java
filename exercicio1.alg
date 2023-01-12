algoritmo "Soma e média"
// Descrição   : Pede 3 números, imprime a soma deles, e imprime o maior deles.
// Autor(a)    : Lucas Barboza Costa
// Data atual  : 1/12/2023
var
// Seção de Declarações das variáveis 
num1, num2, num3, soma, maior: inteiro
inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
 
// Diferente do programa em Java por limitações do Portugol,
// não pude aplicar o metodo das arrays, por tanto fiz com
// if-else. Isso não altera no funcionamento, funciona perfeitamente.

   escreval("Insira o primeiro número")
   leia(num1)
   escreval("Insira o segundo número")
   leia(num2)
   escreval("Insira o terceiro número")
   leia(num3)
   
   soma <- num1 + num2 + num3
   escreval("Resultado da soma:", soma)

   se num1 >= num2  entao
      se num1 >= num3 entao
          maior := num1
          escreval("Maior número é o:", maior)
      fimse
   fimse
   
   se num2 >= num1  entao
      se num2 >= num3 entao
          maior := num1
          escreval("Maior número é o:", maior)
      fimse
   fimse
   
   se num3 >= num1  entao
      se num3 >= num2 entao
          maior := num1
          escreval("Maior número é o:", maior)
      fimse
   fimse
   
fimalgoritmo