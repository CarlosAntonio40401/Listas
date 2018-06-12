/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtoressobrecarga;

/**
 *
 * @author Carlos Antonio
 */
public class TesteProfessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        criacao do objeto 1
     Professor professor1=new Professor("Jose Ruan", "Fisica", 
             new Data(56, 65,56), 14);
     
     professor1.imprimir_dados();
     
//     criacao do objeto 2
Professor professor2=new Professor("Carlos ", "Portugues", 
             new Data(9, 10,12), 14); 

professor2.imprimir_dados();

//      criacao do objeto 3
Professor professor3=new Professor("Jose ", "Inglês", 
             new Data(8, 11,12), 14); 

professor3.imprimir_dados();
    }
    
}
