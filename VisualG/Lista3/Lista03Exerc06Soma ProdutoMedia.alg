Algoritmo "Lista3Ex6"

Var

   valor1,valor2,valor3,soma,produto,media : real

Inicio


   escreval("Informe o 1� valor:")
   leia(valor1)
   escreval("Informe o 2� valor:")
   leia(valor2)
   escreval("Informe o 3� valor:")
   leia(valor3)

   enquanto (valor1 < valor2) e ( valor2 < valor3) e (valor1 < valor3) faca


      soma <- (valor1+valor2+valor3)
      produto <- (valor1*valor2*valor3)
      media <- (valor1+valor2+valor3)/3
      escreval ("A soma: ", soma)
      escreval ("O produto: ", produto)
      escreval ("A m�dia: ", media)

      escreval ("Informe 3 valores em ordem crescente: ")

      escreval("Informe o 1� valor:")
      leia(valor1)
      escreval("Informe o 2� valor:")
      leia(valor2)
      escreval("Informe o 3� valor:")
      leia(valor3)

   fimenquanto

Fimalgoritmo