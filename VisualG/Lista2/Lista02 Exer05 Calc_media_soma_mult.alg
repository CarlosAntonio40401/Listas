Algoritmo "Lista02 Exer05 Calc_media_soma_mult"
// DISCIPLINA  : [LINGUAGEM E LÓGICA DE PROGRAMAÇÃO]
// PROFESSOR   : ALDO HENRIQUE
// DESCRIÇÃO   : CALCULA A MEDIA, SOMA E MULTIPLICACAO
// NOME ALUNO  : CARLOS ANTONIO CPD 40401
// DATA ATUAL  : 29/03/2018
Var
   // SEÇÃO DE DECLARAÇÕES DAS VARIÁVEIS
   n1,n2,n3,media,soma,mult:real
   opcao:inteiro


Inicio
   // MENU DE OPCÕES DA LISTA DE EXERCICIO 02 QUESTÃO 05
 escreval("Escolha uma opção:")
   escreval("1. media")
   escreval("2. soma")
   escreval("3. multiplicação")
   escreval("4. sair")
   escreval("Digite o número da opção escolhida:")
   leia(opcao)
   se(opcao>=5) entao
      escreval("opcao inválida")
      escreval("Digite o número da opção escolhida:")
      leia(opcao)
   fimse
   enquanto (opcao<4) faca
      escolha(opcao)
         //INFORME TRES NÚMEROS E APRESENTA E MEDIA
      caso 1
         escreval("informe o 1º número:")
         leia(n1)
         escreval("informe o 2º número:")
         leia(n2)
         escreval("informe o 3º número:")
         leia(n3)
         media<- (n1+n2+n3)/3
         escreval("A media é:",media)
         escreval()
         //INFORME TRES NÚMEROS E APRESENTA A SOMA
      caso 2
         escreval("informe o 1º número:")
         leia(n1)
         escreval("informe o 2º número:")
         leia(n2)
         escreval("informe o 3º número:")
         leia(n3)
         soma<- (n1+n2+n3)
         escreval("A soma é:",soma)
         escreval()
         //INFORME TRES DE  NÚMEROS E APRESENTA A MULTIPLICAÇÃO
      caso 3
         escreval("informe o 1º número:")
         leia(n1)
         escreval("informe o 2º número:")
         leia(n2)
          escreval("informe o 3º número:")
         leia(n3)
         mult<- (n1*n2*n3)
         escreval()
         escreval()
         escreval("A Multiplicação é:",mult)
         escreval()
         escreval()


      caso 4

      escreval("opcao inválida")
      fimescolha

 escreval("Escolha uma opção:")
   escreval("1. media")
   escreval("2. soma")
   escreval("3. multiplicação")
   escreval("4. sair")
      escreval("Digite o número da opção escolhida:")
      leia(opcao)
       se(opcao>=5) entao
      escreval("opcao inválida")
      escreval("Digite o número da opção escolhida:")
      leia(opcao)
   fimse
   fimenquanto
Fimalgoritmo