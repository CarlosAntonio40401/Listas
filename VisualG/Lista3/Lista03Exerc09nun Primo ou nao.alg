Algoritmo "lista03Exe9nun Primo ou nao"
// DISCIPLINA  : [LINGUAGEM E L�GICA DE PROGRAMA��O]
// PROFESSOR   : ALDO HENRIQUE
// DESCRI��O   : LLEIA UM NUMERO N E IMPRIMA SE ELE E PRIMO OU NAO
// NOME ALUNO  : CARLOS ANTONIO CPD 40401

Var

   n,contador,p, divisorPrimo: inteiro
Inicio
//LEIA UM NUMERO N E IMPRIMA SE ELE E PRIMO OU NAO
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

      fimpara
   fimse
   se (contador = 2) entao
            escreval ("O n�mero N: ", n, " � Primo")
            senao
            escreval("O n�mero N:", n, " n�o � primo")
         fimse




Fimalgoritmo