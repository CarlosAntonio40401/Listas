Algoritmo "Lista03Exer03 Somas 1-ate50-99"
// DISCIPLINA  : [LINGUAGEM E L�GICA DE PROGRAMA��O]
// PROFESSOR   : ALDO HENRIQUE
// DESCRI��O   : SOMAS 01 ATE 50/99
// NOME ALUNO  : CARLOS ANTONIO CPD 40401
Var
   numero1,numero2:inteiro
   soma:real

Inicio
   // SOMAS 01 ATE 50/99

   numero1<-1
   numero2<-1
   para numero1 de numero1 ate 50 passo 1 faca

      soma<- soma+(numero2/numero1)
         escreval("Resultado", numero2,"/",numero1,"=",soma)
      numero2<- numero2+2
   fimpara
   escreval("Soma:",soma)



Fimalgoritmo