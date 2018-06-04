Algoritmo "LISTA03EXERC07MEDIA FINAL ALUNO TURMA"
// DISCIPLINA  : [LINGUAGEM E LÓGICA DE PROGRAMAÇÃO]
// PROFESSOR   : ALDO HENRIQUE
// DESCRIÇÃO   : LISTA03EXERC07MEDIA FINAL ALUNO TURMA
// NOME ALUNO  : CARLOS ANTONIO CPD 40401
// Data atual  : 17/04/2018
Var

   mediaF,contaMedia,mediaTurma,mediaMaior,menorMedia:real
   contador:inteiro
Inicio
   //MEDIA FINAL ALUNO TURMA
   escreval("Informe a média final do aluno:")
   leia(mediaF)
   mediaMaior<-mediaF
   menorMedia<-mediaF
   enquanto mediaF > 0 faca
      contador<-contador+1
      contaMedia<- (mediaF+contaMedia)

      se (mediaMaior < mediaF) entao
         mediaMaior<-mediaF
      senao
         se (menorMedia > mediaF) entao
            menorMedia<- mediaF
         fimse
      fimse

      escreval("Informe a média final do aluno")
      escreval()
      escreval("Programa encerra quando digitar um valor negativo")
      leia(mediaF)
      escreval()
   fimenquanto
   mediaTurma<-contaMedia/contador
   escreval("Maior:",mediaMaior)
   escreval("Menor:",menorMedia)
   escreval("Media geral:",mediaTurma)



Fimalgoritmo