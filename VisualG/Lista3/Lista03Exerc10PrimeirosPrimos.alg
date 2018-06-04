Algoritmo "Lista03Exerci10 MOSTRE OS PRIMEIRO NUMEROS PRIMOS"
// DISCIPLINA  : [LINGUAGEM E LÓGICA DE PROGRAMAÇÃO]
// PROFESSOR   : ALDO HENRIQUE
// DESCRIÇÃO   : LEIA UM NUMERO N E MOSTRE NA TELA OS N PRIMEIROS NUMEROS PRIMOS
// NOME ALUNO  : CARLOS ANTONIO CPD 40401
// Data atual  : 18/04/2018
Var

   n,contador,p, divisorPrimo: inteiro
Inicio
//LEIA UM NUMERO N E MOSTRE NA TELA OS N PRIMEIROS NUMEROS PRIMOS

   escreval ("Informe o número que deseja identificar se é Primo ou não.")
   leia (n)

   se (n <=0 ) entao

      escreva ("valor nulo e inválido")
   senao
      Para p de 1 ate n passo 1 faca
         contador<-0
         para divisorPrimo de 1 ate p faca
            se (p mod divisorPrimo= 0) entao

               contador<-contador+1
            fimse
         fimpara
         se (contador = 2) entao
            escreval ("O número N: ", p, " é Primo")
         fimse
      fimpara
   fimse




Fimalgoritmo