/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movimentacao;

import pagamento.Autorizavel;

/**
 *
 * @author brunoaquino
 */
public class Compra implements Autorizavel{
    
    public double valorTotal;
    public String nomeCliente;
    public String produto;

    @Override
    public double valorTotal() {     
        return this.valorTotal;
    }
    
}
