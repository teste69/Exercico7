/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercico01;

/**
 *
 * @author ifnmg
 */
public class Pessoa {
        private String nome,endereço,telefone;
        public Pessoa(String n,String e,String t){
        setNome(n);
        setEnd(e);
        setTel(t);
    }
    
    void setNome(String n){ this.nome=n;}
    String getNome(){ return this.nome;}
    
    void setEnd(String e){ this.endereço=e;}
    String getEnd(){ return this.endereço;}
    
    void setTel(String t){ this.telefone=t;}
    String getTel(){ return this.telefone;}
}
    
