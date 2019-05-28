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
public class Teste {
     public static void main(String[]args){
        Pessoa p1=new Pessoa("Rodrigo","Rua: treze X numero:266","(66)9666-6999");
        Fornecedor f1=new Fornecedor("Enzo","Dona Clara - Rua 8","(61) 3404-0014",1.87,1.71);
        Empregado e1=new Empregado("O proximo numero","É uma frase >.<","01110110 01100101 01101001 01101111 00100000 01100011 01101111 01101110 01100110 01100101 01110010 01101001 01110010 00100000 01101111 01110001 00100000 01100101 01110010 01100001 00111111 ",8888,9999,5);
        
        
        System.out.println(f1.obterSaldo());
        System.out.println(e1.calcularSalario());
    }
}
    

