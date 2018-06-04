Algoritmo "Lista 02 Exercicio 02 TRIANGULOS IQUILATERO, ISOSCELES E ESCALENO"
// DISCIPLINA  : [LINGUAGEM E LÓGICA DE PROGRAMAÇÃO]
// PROFESSOR   : ALDO HENRIQUE
// DESCRIÇÃO   : TRIANGULOS IQUILATERO, ISOSCELES E ESCALENO
// NOME ALUNO  :  CARLOS ANTONIO CPD 40401
// Data atual  : 02/04/2018
Var

   L1,L2,L3:inteiro

Inicio
   // TRIANGULOS IQUILATERO, ISOSCELES E ESCALENO
   escreval("Informe o 1º lado do triângulo:")
   leia(L1)
   escreval("Informe o 2º lado do triângulo:")
   leia(L2)
   escreval("Informe o 3º lado do triângulo:")
   leia(L3)

   se ((L1+L2>L3) e (L2+L3>L1) e (L3+L1>L2)) entao
      escreval("Os lados formam um triângulo")
      senao
     escreval("os lados informados não formam um triângulo")
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