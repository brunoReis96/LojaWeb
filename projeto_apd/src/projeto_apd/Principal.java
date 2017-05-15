/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_apd;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      gerenciarProduto gp =new gerenciarProduto();
      Pedido pd= new Pedido();
      
       boolean sis=true;
        while(sis==true){
         int tipo_usuario=Integer.parseInt(JOptionPane.showInputDialog(
                                     "Informe o código de usuário de sistema:\n\n"+
                                     "1- Cliente\n"+
                                     "2- Administrador\n\n")
         );

         switch(tipo_usuario){
             case 1:
                 JOptionPane.showMessageDialog(null, "Seja bem vindo Cliente");
                 sis=false;
                 //String p=JOptionPane.showInputDialog("Informe o código de usuário de sistema");
                 //JOptionPane.showMessageDialog(null,gp.getCodigo());
                 
                 pd.gerarPagamento();
             break;

             case 2:
                 boolean teste=true;
                 while(teste==true){
                 JTextField username = new JTextField();
                 JTextField password = new JPasswordField();
                 Object[] message1 = {
                    "Usuário:", username,
                    "Senha:", password
                };

                int option = JOptionPane.showConfirmDialog(null, message1, "Login", JOptionPane.OK_CANCEL_OPTION);
                
                if (option == JOptionPane.OK_OPTION) {
                    if (username.getText().equals("admin") && password.getText().equals("1234")) {
                        JOptionPane.showMessageDialog(null, "Seja bem vindo Administrador");
                        teste=false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha e usuário incorreta", "Error", JOptionPane.ERROR_MESSAGE);
                        teste=true;
                    }
                }
                }
                 sis=false;
                 int opc=Integer.parseInt(JOptionPane.showInputDialog(
                                     "Informe a ação:\n\n"+
                                     "1- Cadastrar Produto\n"+
                                     "2- Alterar Produto\n"+
                                     "3- Excluir Produto\n")
                );
                switch (opc){ 
                     case 1:
                         JTextField t1 = new JTextField();
                         JTextField t2 = new JTextField();
                         JTextField t3 = new JTextField();
                         
                         Object[] message = {
                            "Codigo:", t1,
                            "Titulo:", t2,
                            "Valor:", t3     
                            };
                         int result = JOptionPane.showConfirmDialog(null, message, "Informe os dados dos produtos", JOptionPane.OK_CANCEL_OPTION);
                            /*if (result == JOptionPane.OK_OPTION) {
                                System.out.println("x value: " + t1.getText());
                                System.out.println("y value: " + t2.getText());
                                System.out.println("y value: " + t3.getText());
                            }*/
                            
                         String codigo = t1.getText();
                         String titulo = t2.getText();
                         String valor = t3.getText();
                         
                         gp.setProduto(codigo,titulo,valor);
                         
                     break;
                     case 2:
                         gp.getProduto();
                     break;
                    case 3:
                         gp.getProduto();
                     break;
                     default:
                        JOptionPane.showMessageDialog(null, "Código não encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                     break;    
                }       
             break;
             default:
                 JOptionPane.showMessageDialog(null, "Código não encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                 sis=true;
         }
       }   
    }
    
}
