Algoritmo "Lista 02 Exercicio 02 TRIANGULOS IQUILATERO, ISOSCELES E ESCALENO"
// DISCIPLINA  : [LINGUAGEM E L�GICA DE PROGRAMA��O]
// PROFESSOR   : ALDO HENRIQUE
// DESCRI��O   : TRIANGULOS IQUILATERO, ISOSCELES E ESCALENO
// NOME ALUNO  :  CARLOS ANTONIO CPD 40401
// Data atual  : 02/04/2018
Var

   L1,L2,L3:inteiro

Inicio
   // TRIANGULOS IQUILATERO, ISOSCELES E ESCALENO
   escreval("Informe o 1� lado do tri�ngulo:")
   leia(L1)
   escreval("Informe o 2� lado do tri�ngulo:")
   leia(L2)
   escreval("Informe o 3� lado do tri�ngulo:")
   leia(L3)

   se ((L1+L2>L3) e (L2+L3>L1) e (L3+L1>L2)) entao
      escreval("Os lados formam um tri�ngulo")
      senao
     escreval("os lados informados n�o formam um tri�ngulo")
   fimse
        se (l1=l2) ou (l2=l3)e (12<>13)entao
      ESCREVA("TRIANGULO ISOSCELES")
   SENAO
     se(l1<>l2) e (l1<>l3) e (l2<>l3)entao
      ESCREVA("TRIANGULO ESCALENO")
      se(l1=l2) e (l2=l3) e (l3=l1)entao
      ESCREVA("TRIANGULO EQUILATERO")
  SENAO
   fimse
   fimse
   fimse




Fimalgoritmo