/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pagamento;

/**
 *
 * @author brunoaquino
 */
public interface Operadora {
    
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao);
    
    
}
