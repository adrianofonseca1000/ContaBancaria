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
public class pessoaJuridica extends Cliente{
    String cnpj;
      
    @Override
    boolean validarEndereco(){
        super.validarEndereco(); //Validando endereço da classe Pai
        return false;
    
    }
}