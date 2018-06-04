Algoritmo "Lista 02 Exercicio 04 CRESCENTE E DECRESCENTE"
// DISCIPLINA  : [LINGUAGEM E LOGICA DE PROGRAMACAO]
// PROFESSOR   : ALDO HENRIQUE
// DESCRICAO   : CRESCENTE E DECRESCENTE
// NOME ALUNO  : CARLOS ANTONIO CPD 40401
// Data atual  : 02/04/2018
Var

   nota1,nota2,nota3,crescente,decrescente:real
   opcao:caracter

Inicio
   // CRESCENTE E DECRESCENTE
   escreval("Digite nota 1")
   leia (nota1)
   escreval("Digite nota 2")
   leia (nota2)
   escreval("Digite nota 3")
   leia (nota3)
   escreval("Digite C para crescente e D para descrescente")
   leia(opcao)
   se(opcao="C" )entao
      se((nota1<nota2) e (nota1<nota3) e (nota2<nota3))entao
         escreval("A ordem crescente é:", nota1,nota2,nota3)
      senao
         se((nota1<nota2) e (nota1<nota3) e (nota3<nota2))entao
            escreval("A ordem crescente é:",nota1,nota3,nota2)
         senao
            se((nota2<nota1) e (nota2<nota3) e (nota1<nota3))entao
               escreval("A ordem crescente é:",nota2,nota1,nota3)
            senao
               se((nota2<nota1) e (nota2<nota3) e (nota3<nota1))entao
                  escreval("A ordem crescente é:",nota2,nota3,nota1)
               senao
                  se((nota3<nota1) e (nota3<nota2) e (nota1<nota2))entao
                     escreval("A ordem crescente é:",nota3,nota1,nota2)
                  senao
                     se((nota3<nota1) e (nota3<nota2) e (nota2<nota1))entao
                        escreval("A ordem crescente é:",nota3,nota2,nota1)
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   senao
      se(opcao="D")entao
         se((nota1>nota2) e (nota1>nota3) e (nota2>nota3))entao
            escreval("A ordem decrescente é:", nota1,nota2,nota3)
         senao
            se((nota1>nota2) e (nota1>nota3) e (nota3>nota2))entao
               escreval("A ordem decrescente é:",nota1,nota3,nota2)
            senao
               se((nota2>nota1) e (nota2>nota3) e (nota1>nota3))entao
                  escreval("A ordem decrescente é:",nota2,nota1,nota3)
               senao
                  se((nota2>nota1) e (nota2>nota3) e (nota3>nota1))entao
                     escreval("A ordem decrescente é:",nota2,nota3,nota1)
                  senao
                     se((nota3>nota1) e (nota3>nota2) e (nota1>nota2))entao
                        escreval("A ordem decrescente é:",nota3,nota1,nota2)
                     senao
                        se((nota3>nota1) e (nota3>nota2) e (nota2>nota1))entao
                           escreval("A ordem decrescente é:",nota3,nota2,nota1)
                        fimse
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse




Fimalgoritmo