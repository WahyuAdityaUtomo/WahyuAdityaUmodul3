/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author User
 */
public class Person {
    private String Nama;
    private int usia;
    //konstruktor
    public Person(String nama,int usia){
        this.Nama = nama;
        this.usia = usia;
        
    }
    //metode 
    public void info ()
    {
        System.out.println("Nama:"+this.Nama);
        System.out.println("usia:"+this.usia);
    }
}
