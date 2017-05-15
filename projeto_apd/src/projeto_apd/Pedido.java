/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_apd;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Pedido {
    int codigo;
    Date data;
    double valor;
    Produto codigoProduto;
    Pagamento boleto=new Pagamento();
    
    public void gerarPagamento(){
        boleto.gerarBoleto();
    }
}
