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
public class Jurusan extends Sekolah {
    int jurusan = 0;
    int jmlhguru = 0;
    String Guru;
    
    void cetakJurusan (int jmlhJurusan){
        jurusan = jmlhJurusan;
        System.out.println("Jumlah Jurusan : "+jurusan);
    }
    void cetakGuru (String Guru){
        Guru = Guru;
        System.out.println("Nama Guru : "+Guru);
    }
    void cetakbnykguru(int bnykguru){
        jmlhguru = bnykguru;
        System.out.println("Jumlah Guru : "+jmlhguru);
    }
}
