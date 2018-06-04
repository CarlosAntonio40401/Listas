Algoritmo "Soma Diferenca Produto e Media"
// Disciplina  :  [Linguagem e Logica de Programacao]
// Professor   : Aldo Henrique
// Descrição   : Soma, diferenca, produto e media
// Nome aluno  : Carlos Antonio CPD 40401
// Data atual  : 29/03/2018
Var
   // Seção de Declarações das variáveis
   soma, diferenca, produto, numero1,numero2:inteiro
   media:real

Inicio
   // Soma, diferenca, produto e media
   escreval("Informe dois números e apresente a soma.")
   escreval("Informe o 1º número:")
   leia(numero1)
   escreval("Informe o 2º número:")
   leia(numero2)
   soma<-numero1+numero2
   diferenca<-numero1-numero2
   produto<-numero1*numero2
   media<-(numero1+numero2)/2
   escreval()
   escreval("Resultado - Soma:",soma)
   escreval("Resultado - Diferença:",diferenca)
   escreval("Resultado - Produto:",produto)
   escreval("Resultado - Media:",media)
  Fimalgoritmo