/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekapkas;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.*;
/**
 *
 * @author LENOVO
 */
public class input {
    String bulan = null;
    int masuk;
    int keluar;
    int total;
    String data = "Selesai";
    Scanner input = new Scanner(System.in);
    
    void hitung() {
        total = masuk - keluar;
    }
    
    void input() {
        System.out.print("Masukkan bulan : ");
        bulan = input.nextLine();
        System.out.print("Total pemasukan : ");
        masuk = input.nextInt();
        System.out.print("Jumlah pengeluaran : ");
        keluar = input.nextInt();
        
    }
    void konversi() {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        System.out.printf("%s %n", kursIndonesia.format(total));
        
    }
    String data() {
        System.out.println("");
        System.out.print("Total uang kas bulan "+bulan+" : ");
        konversi();
        return data;
    }
}
