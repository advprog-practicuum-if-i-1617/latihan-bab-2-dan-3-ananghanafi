/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author ridho
 */
public class Main {

    public static void main(String[] args) {
        Convert konversi = new Convert();
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        String angka = in.next();
        long b = Long.parseLong(angka);
        String c = konversi.terbilang(b);
        System.out.println("Konversi = " + c);
    }


}
