/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_apd;

import java.io.IOException;


/**
 *
 * @author Usuario
 */
public class gerenciarProduto extends Produto{
    
    Produto codigoProduto;
    Produto tituloProduto;
    Produto valorProduto;
    
    repositorioProduto rp=new repositorioProduto();
    
    public void setProduto(String codigo, String titulo, String valor) throws IOException{
            super.codigo = codigo;
            super.titulo = titulo;
            super.valor = valor;
            
            rp.gravarProduto(codigo, titulo, valor);
    }
       
    public void getProduto() throws IOException{
        
        
        rp.lerProduto(codigo, titulo, valor);
    }
    
    public void excluirProduto(){
        
    }
}

