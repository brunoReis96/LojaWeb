/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_apd;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Usuario
 */
public class teste {
    public static void main(String[] args) throws IOException {
      
    /*String nome="Bruno";
    String n="B";
    
           try (FileWriter arq = new FileWriter("C:\\Users\\Usuario\\Desktop\\APD\\produto.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.println(nome + n);
           }        
 */
    Pagamento p=new Pagamento();
    p.gerarBoleto();
  /*  
        Scanner ler = new Scanner(System.in);
    
    int i, n;
 
    System.out.printf("Informe o número para a tabuada:\n");
    n = ler.nextInt();
 
    FileWriter arq = new FileWriter("C:\\Users\\Usuario\\Desktop\\APD\\tabuada.txt");
    PrintWriter gravarArq = new PrintWriter(arq);
 
    gravarArq.printf("+--Resultado--+%n");
    for (i=1; i<=10; i++) {
      gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
    }
    gravarArq.printf("+-------------+%n");
 
    arq.close();
 
    System.out.printf("\nTabuada do %d foi gravada com sucesso em \"d:\\tabuada.txt\".\n", n);
  }
    
JPanel panel = new JPanel();
JTextField field1 = new JTextField(10);
panel.add(field1);
JTextField field2 = new JTextField(10);
panel.add(field2);
int value = JOptionPane.showConfirmDialog(null, panel, "Enter text", JOptionPane.OK_CANCEL_OPTION);
if (value == JOptionPane.OK_OPTION)
{
    // OK was pressed
    String s1 = field1.getText();
    String s2 = field2.getText();
    // handle them
}
  */

}

}

