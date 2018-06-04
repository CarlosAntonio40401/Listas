Algoritmo "Lista 02 Exercicio 03 MEDIA E MAIOR NUMERO DIGITADO"
// DISCIPLINA  : [LINGUAGEM E LÓGICA DE PROGRAMAÇÃO]
// PROFESSOR   : ALDO HENRIQUE
// DESCRIÇÃO   : MEDIA E MAIOR NUMERO DIGITADO
// NOME ALUNO  : CARLOS ANTONIO CPD 40401
// Data atual  : 02/04/2018
Var

   n1,n2,n3,maior,media:real

Inicio
   // MEDIA E MAIOR NUMERO DIGITADO
   escreval("Digite nota 1")
   leia (n1)
   escreval("Digite nota 2")
   leia (n2)
   escreval("Digite nota 3")
   leia (n3)
   se ((n1>n2) e (n1> n3))entao
      maior <-n1
      escreval ("Maior Numero Digitado",maior)
   senao
      se ((n2>n1) e (n2> n3))entao
         maior <-n2
         escreval ("Maior Numero Digitado",maior)
      senao
         maior <-n3
         escreval ("Maior Numero Digitado",maior)
      fimse
   fimse
   media <-(n1+n2+n3)/3
   escreval ("Media dos numeros diritado",media)


Fimalgoritmo