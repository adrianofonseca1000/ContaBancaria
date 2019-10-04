/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.account;

/**
 *
 * @author 11311089
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciando o objeto 1
        //Nome_da_classe_nome_da_variavel = new Nome_da_classe 
        
        Account a = new Account("Adriano");
       // exibe o valor inicial do nome(null)
        System.out.printf("O nome inicial é:\n" + a.getName());
                
                //Solicita e lê o nome
                System.out.println("Por favor entre com o nome da conta:\n");
                String theName = input.nextLine(); //lê uma linha de texto
                a.setName(theName); //insere o nome (theName) em myAccount
                System.out.println(); // gera saída de uma linha em branco
                
                //exibe o nome armazenado no objeto myAccount
                System.out.println(); 
                
                System.out.printf("Nome do objeto myAccount é:\n" + a.getName());        
        
        //Instanciando objeto 2
        Account a2 = new Account("");
        a.setName ("104");
        a.setNome  ("Caixa");
        a.setSite  ("www.caixa.com.br");
        a2.icluir();
        a2.excluir();
        a2.editar();
        a2.pesquisar();
        a2.adicionarAgencia();
        a2.adicionarCliente();        
        
        
    }
    
}
