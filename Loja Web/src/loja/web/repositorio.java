/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.web;

/**
 *
 * @author Usuario
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class repositorio {
 
  public void lerDados(){
      
   String ler="ler.txt";
 
    System.out.printf("\nConteúdo do arquivo texto:\n");
    try {
      FileReader arq = new FileReader(ler);
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine(); 
      
      while (linha != null) {
        System.out.printf("%s\n", linha);
 
        linha = lerArq.readLine(); // lê da segunda até a última linha
      }
 
      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
 
    System.out.println();
    
  }
}
