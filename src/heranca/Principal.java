/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author Adriano Fonseca
 */
public class Principal {
    public static void main(String[] args) {
        pessoaFisica c1 = new pessoaFisica(); //Objeto da classe
        c1.nome = "Jose";
        c1.endereco = "Rua Tal";
        c1.cpf = "";
        c1.validarEndereco();
        
        pessoaJuridica c2 = new pessoaJuridica();
        c2.cnpj = "";
        c2.validarEndereco();
    }
    
}
