package vetorparam;

import java.util.Scanner;

public class Principal_V_Param {

    public static void main(String[] args) {
        
        Scanner lerNum = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);
        
        
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = lerNum.nextInt();
        
        String nomes[] = new String [tamanho];
        
        for (int i = 0; i < nomes.length; i++) 
        {
            System.out.printf("Informe o %d nome: \n", i + 1);
            
            nomes[i]= lerString.nextLine();
        }
            
         System.out.println("\n");
         
         for (int i = 0; i < nomes.length; i++) 
        {
            System.out.printf("%d nome: %s \n",i + 1, nomes[i]);
        }
        
         lerNum.close();
         lerString.close();
  }   
}
