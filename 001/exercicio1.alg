algoritmo "Soma e m�dia"
// Descri��o   : Pede 3 n�meros, imprime a soma deles, e imprime o maior deles.
// Autor(a)    : Lucas Barboza Costa
// Data atual  : 1/12/2023
var
// Se��o de Declara��es das vari�veis 
num1, num2, num3, soma, maior: inteiro
inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
 
// Diferente do programa em Java por limita��es do Portugol,
// n�o pude aplicar o metodo das arrays, por tanto fiz com
// if-else. Isso n�o altera no funcionamento, funciona perfeitamente.

   escreval("Insira o primeiro n�mero")
   leia(num1)
   escreval("Insira o segundo n�mero")
   leia(num2)
   escreval("Insira o terceiro n�mero")
   leia(num3)
   
   soma <- num1 + num2 + num3
   escreval("Resultado da soma:", soma)

   se num1 >= num2  entao
      se num1 >= num3 entao
          maior := num1
          escreval("Maior n�mero � o:", maior)
      fimse
   fimse
   
   se num2 >= num1  entao
      se num2 >= num3 entao
          maior := num1
          escreval("Maior n�mero � o:", maior)
      fimse
   fimse
   
   se num3 >= num1  entao
      se num3 >= num2 entao
          maior := num1
          escreval("Maior n�mero � o:", maior)
      fimse
   fimse
   
fimalgoritmo
