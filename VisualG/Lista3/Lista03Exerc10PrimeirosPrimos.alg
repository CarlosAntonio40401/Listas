Algoritmo "Lista03Exerci10 MOSTRE OS PRIMEIRO NUMEROS PRIMOS"
// DISCIPLINA  : [LINGUAGEM E L�GICA DE PROGRAMA��O]
// PROFESSOR   : ALDO HENRIQUE
// DESCRI��O   : LEIA UM NUMERO N E MOSTRE NA TELA OS N PRIMEIROS NUMEROS PRIMOS
// NOME ALUNO  : CARLOS ANTONIO CPD 40401
// Data atual  : 18/04/2018
Var

   n,contador,p, divisorPrimo: inteiro
Inicio
//LEIA UM NUMERO N E MOSTRE NA TELA OS N PRIMEIROS NUMEROS PRIMOS

   escreval ("Informe o n�mero que deseja identificar se � Primo ou n�o.")
   leia (n)

   se (n <=0 ) entao

      escreva ("valor nulo e inv�lido")
   senao
      Para p de 1 ate n passo 1 faca
         contador<-0
         para divisorPrimo de 1 ate p faca
            se (p mod divisorPrimo= 0) entao

               contador<-contador+1
            fimse
         fimpara
         se (contador = 2) entao
            escreval ("O n�mero N: ", p, " � Primo")
         fimse
      fimpara
   fimse




Fimalgoritmo