Algoritmo "lista03Exe9nun Primo ou nao"
// DISCIPLINA  : [LINGUAGEM E LÓGICA DE PROGRAMAÇÃO]
// PROFESSOR   : ALDO HENRIQUE
// DESCRIÇÃO   : LLEIA UM NUMERO N E IMPRIMA SE ELE E PRIMO OU NAO
// NOME ALUNO  : CARLOS ANTONIO CPD 40401

Var

   n,contador,p, divisorPrimo: inteiro
Inicio
//LEIA UM NUMERO N E IMPRIMA SE ELE E PRIMO OU NAO
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

      fimpara
   fimse
   se (contador = 2) entao
            escreval ("O número N: ", n, " é Primo")
            senao
            escreval("O número N:", n, " não é primo")
         fimse




Fimalgoritmo