/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author ISMAIL
 */
public class Main {
    public static void main(String args []){
        Prediksi bmkg = new Prediksi();
        bmkg.gugur();
        bmkg.hujan();
        bmkg.kemarau();
        bmkg.salju();
        bmkg.semi();
        bmkg.SuhuIni();
        Cuaca jepang = (Cuaca) bmkg;
        jepang.setTemperature(32);
        jepang.setKondisi("Panas");
        System.out.println("Di Jepang saat ini cuacanya dengan kondisi " + jepang.getKondisi()+ " Suhu Temperatur Saat ini mencapai " + jepang.getTemperature());
        
        
    }
}
