/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author ISMAIL
 */
public class Prediksi extends Cuaca implements Kemarau, Hujan, Gugur, Semi, Salju {

    
    public void Prediksi(int temperatur, String kondisi){
        super.setTemperature(temperatur);
        super.setKondisi(kondisi);
    }
    
    public void SuhuIni(){
        this.Suhu();
        super.Suhu();
    }
    
    @Override
    public void Suhu(){
        System.out.println("Ini Suhu dari Prediksi...");
    }
    
    @Override
    public void kemarau() {
        System.out.println("Saya musim kemarau...");
    }

    @Override
    public void hujan() {
        System.out.println("Saya musim hujan...");
    }

    @Override
    public void gugur() {
        System.out.println("Saya musim gugur...");
    }

    @Override
    public void semi() {
        System.out.println("Saya musim semi...");
    }

    @Override
    public void salju() {
        System.out.println("Saya musim salju...");
    }
}
