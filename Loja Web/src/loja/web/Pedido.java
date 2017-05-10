/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.web;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Pedido extends Produto{
    int numeroPedido;
    Date dataPedido;
    int valorPedido;
    Produto produto = new Produto();
    
    public void gerarBoleto(){
        Random gerador=new Random();
        
        for(int i=0;i<10;i++){
            System.out.println(gerador.nextInt()*1);
        }
    }
}
