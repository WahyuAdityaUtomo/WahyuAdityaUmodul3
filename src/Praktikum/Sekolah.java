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
public class Sekolah {
    String nmSekolah = "";
    String nmJurusan = "";
    
    void cetakSekolah(String namaSekolah){
        nmSekolah = namaSekolah;
        System.out.println("Nama Sekolah "+ nmSekolah);
    }
    void cetakJurusan (String namaJurusan){
        nmJurusan = namaJurusan;
        System.out.println("Nama Jurusan : "+ nmJurusan);
    }
}
