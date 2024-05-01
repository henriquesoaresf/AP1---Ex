package matriz_1;

import java.util.Scanner;

public class Matriz_1 {

    public static void main(String[] args) {

        //int mat[][] = {{1, 2, 3, 4}, {5, 6}};

        int mat [][] = new int [2][];
        mat[0] = new int [4];
        mat[1] = new int [2];
        
        Scanner ler = new Scanner(System.in);
        
        
        for (int i = 0; i < mat.length; i++){
            System.out.printf("%d - linha \n", i + 1);
            for (int j = 0; j < mat[i].length; j++){
                System.out.println("Entre com um número: ");
                mat[i][j] = ler.nextInt();
         }  
        }
        
        //for(i = 0; i < mat.length; i++){
          
          //System.out.printf("%d linha: ", (i+1));
          // for (j=0; j<mat[i].length; j++)
          //{
               
              //System.out.printf("%d ", mat[i][j]);
               
           //}
            // System.out.println("\n");
            // }
 
    }
}
