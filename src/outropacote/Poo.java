/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outropacote;

import br.newtonpaiva.account.Account;

/**
 *
 * @author 11311089
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciando o objeto 1
        //Nome_da_classe_nome_da_variavel = new Nome_da_classe 
        
        Account b = new Account("341", "Itau", "www.itau.com.br");
        b.setName ("341");
        b.setNome  ("Itau");
        b.setSite  ("www.itau.com.br");
        
        b.icluir();
        b.excluir();
        b.editar();
        b.pesquisar();
        b.adicionarAgencia();
        b.adicionarCliente();        
        
        //Instanciando objeto 2
        Account b2 = new Account("341", "Caixa", "www.caixa.com.br");
        b.setName ("341");
        b.setNome  ("Caixa");
        b.setSite  ("www.caixa.com.br");
        
        b2.icluir();
        b2.excluir();
        b2.editar();
        b2.pesquisar();
        b2.adicionarAgencia();
        b2.adicionarCliente();        
        
        
    }
    
}
