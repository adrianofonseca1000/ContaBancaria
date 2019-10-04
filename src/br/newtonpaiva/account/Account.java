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
public class Account {
    
    private String name;
    private double balance;
    private double deposit;
    
    public Account(String codigo, String nome, String site){
        System.out.println("Contrutor executado");
        this.name = name;
        this.balance = balance = 10.00;
        this.deposit = deposit;

    }
    
    public    void icluir(){
        System.out.println(getNome() + "metodo incluir");

    }
    
    public    void excluir(){
        System.out.println(getNome() + "metodo ecluir");
        
    }

    public    void editar(){
        System.out.println(getNome() + "metodo editar");
        
    }

    public    void pesquisar(){
        System.out.println(getNome() + "metodo pesquisar");
        
    }    
    
    public    void adicionarAgencia(){
        System.out.println(getNome() + "metodo adiciona agencia");
        
    }
    
    public    void adicionarCliente(){
        System.out.println(getNome() + "metodo adicionar cliente");
        
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    /**
     * @return the balance
     */
    public double getNome() {
        return balance;
    }
   /**
     * @return the deposit
     */
    public double getSite() {
        return deposit;
    }

    /**
     * @param site the deposit to set
     */
    public void setSite(String site) {
        this.deposit = deposit;
    }
    
}