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
public class Fornecedor extends Pessoa {
      
    private double valorCredito,valorDivida;
    
    public Fornecedor(String n,String e,String t,double vc,double vd){
        super(n,e,t);
        setVC(vc);
        setVD(vd);
    }   
    
    void setVC(double c){ this.valorCredito=c;}
    double getVC(){ return this.valorCredito;}

    void setVD(double d){ this.valorDivida=d;}
    double getVD(){ return this.valorDivida;}

    double obterSaldo(){
        return this.valorCredito-this.valorDivida;
    }
}
    

