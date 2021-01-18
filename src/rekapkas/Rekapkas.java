/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekapkas;

/**
 *
 * @author LENOVO
 */
public class Rekapkas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mari merekap kas bulanan");
        System.out.println("=========================");
        input rekap = new input();
        rekap.input();
        rekap.hitung();
        rekap.konversi();
        
        System.out.println(rekap.data());
    }
    
}
