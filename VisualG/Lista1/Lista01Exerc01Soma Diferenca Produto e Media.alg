Algoritmo "Soma Diferenca Produto e Media"
// Disciplina  :  [Linguagem e Logica de Programacao]
// Professor   : Aldo Henrique
// Descri��o   : Soma, diferenca, produto e media
// Nome aluno  : Carlos Antonio CPD 40401
// Data atual  : 29/03/2018
Var
   // Se��o de Declara��es das vari�veis
   soma, diferenca, produto, numero1,numero2:inteiro
   media:real

Inicio
   // Soma, diferenca, produto e media
   escreval("Informe dois n�meros e apresente a soma.")
   escreval("Informe o 1� n�mero:")
   leia(numero1)
   escreval("Informe o 2� n�mero:")
   leia(numero2)
   soma<-numero1+numero2
   diferenca<-numero1-numero2
   produto<-numero1*numero2
   media<-(numero1+numero2)/2
   escreval()
   escreval("Resultado - Soma:",soma)
   escreval("Resultado - Diferen�a:",diferenca)
   escreval("Resultado - Produto:",produto)
   escreval("Resultado - Media:",media)
  Fimalgoritmo