/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author AnangHanafi
 */
public class Convert {

    String[] angka = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};

    public String sebut(int x) {
        String bilang = "";
        int y = x / 100;
        if (y > 0) {
            bilang = angka[y] + " Ratus ";
            if (y == 1) {
                bilang = "Seratus ";
            }
            x %= 100;
        } else if (x < 12) {
            bilang += angka[x];
        } else {
            y = x / 10;
            x %= 10;
            if (y == 1) {
                bilang += angka[x] + " Belas";
            } else {
                bilang += angka[y] + " Puluh " + angka[x];
            }
        }

        return bilang;
    }

    public String terbilang(long x) {
        int y;
        String bilang = "";
        String[] satuan = {"", " Ribu ", " Juta ", " Milyar ", " Trilyun "};
        for (int i = 5; i > 0; i--) {
            y = (int) (x / Math.pow(10, i * 3));
            if (y > 0) {
                if (y == 1 && i == 1) {
                    bilang += " Seribu ";
                } else {
                    bilang += sebut(y) + satuan[i];
                }
            }
            x %= Math.pow(10, i * 3);
        }
        bilang += sebut((int) x);
        return bilang;
    }
}
