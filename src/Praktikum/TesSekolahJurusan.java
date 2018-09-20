/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Adit
 */
public class TesSekolahJurusan {
    public static void main(String[] args) {
        Jurusan myjurusan = new Jurusan();
        System.out.println("_______________________________");
        myjurusan.cetakSekolah("Smk Telkom Malang");
        myjurusan.cetakGuru("Pak Zakaria");
        myjurusan.cetakJurusan("RPL");
        myjurusan.cetakJurusan(2);
        myjurusan.cetakbnykguru(20);
        System.out.println("_______________________________");
    }
}
