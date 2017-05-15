/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_apd;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class repositorioProduto{
    
   public void gravarProduto(String codigo, String titulo, String valor) throws IOException{
        try (FileWriter arq = new FileWriter("C:\\Users\\Usuario\\Desktop\\APD\\produto.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.println(codigo+";"+titulo+";"+valor);
            JOptionPane.showMessageDialog(null, "Produto cadastrado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Produto não pode ser cadastrado", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
  }
   
   public void lerProduto(String codigo, String titulo, String valor) throws IOException{
        try {   
            //abre o arquivo   
            FileReader arq = new FileReader("C:\\Users\\Usuario\\Desktop\\APD\\produto.txt");   
            BufferedReader lerArq = new BufferedReader(arq);
            //lendo a primeira linha
            String linha = lerArq.readLine();

            //ArrayListe para armazenar os objetos da leitura
            ArrayList produtos = new ArrayList();

            //a variavel linha recebe o valor 'null' quando chegar no final do arquivo
            while (linha != null){
                //Criando o objeto p2 da classe produto
                Produto p2 = new Produto();
                //criando um array que recebe os atributos divididos pelo split
                String[] atributos = linha.split(";");

                //Se quiser usar outro separado use:
                //String[] atributos = linha.split(Pattern.quote("|"));

                //passando os "atributos" da array para o objeto p2
                p2.codigo = atributos[0];
                p2.titulo = atributos[1];
                p2.valor = atributos[2];
                //adicionando objeto p2 no ArrayList a
                produtos.add(p2);
                //capturando a proxima linha
                linha = lerArq.readLine();
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Produto não pode ser cadastrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}