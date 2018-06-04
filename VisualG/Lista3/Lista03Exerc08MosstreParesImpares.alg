Algoritmo "Lista03 Exerc08MOSTRE NUMEROS PARES E DEPOIS OS N PRIMEIROS NUMEROS IMPARES"
// DISCIPLINA  : [LINGUAGEM E LÓGICA DE PROGRAMAÇÃO]
// PROFESSOR   : ALDO HENRIQUE
// DESCRIÇÃO   : MOSTRE NUMEROS PARES E DEPOIS OS N PRIMEIROS NUMEROS IMPARES
// NOME ALUNO  : CARLOS ANTONIO CPD 40401
// Data atual  : 18/04/2018
Var
   // Seção de Declarações das variáveis
   n,i,contador:inteiro

Inicio
   // MOSTRE NUMEROS PARES E DEPOIS OS N PRIMEIROS NUMEROS IMPARES
   escreval("Informe o valor de N:")
   leia(n)
   para i de 1 ate n passo 1 faca
      se(i mod 2=0)   entao
         escreval("Os números pares são:",i)
      fimse
   fimpara
   
   escreval("---------------------------------")
   
   para i de 1 ate n passo 1 faca
      se(i mod 2=1)entao
         escreval("Os números impares são:",i)
      fimse
   fimpara

Fimalgoritmo