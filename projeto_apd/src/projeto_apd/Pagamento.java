/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_apd;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Pagamento {
    
    public void gerarBoleto(){
        int min=100000000;
        int max=999999999;
        
        Random random = new Random();
        
        int numero = random.nextInt((max - min) + 1) + min;
        
        JOptionPane.showMessageDialog(null,"Por favor, anote o número do boleto:\n"+numero);
    }
}
