/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.util.Scanner;

/**
 *
 * @author D1350
 */
public class Main {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        Textos total = new Textos();
        Textos album1 = new Textos();
        Textos digito = new Textos();
        
        System.out.println(total.discografia);
        
        System.out.println("Album desejado listado acima: ");
        digito.digitar = sc.nextInt();
        
        if(digito.digitar == 1){
            System.out.println(album1.primeiro);
        }
        
    }
    
}
