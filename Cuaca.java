/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author ISMAIL
 */
public class Cuaca {
    private int temperature;
    private String kondisi;
    
    public Cuaca(){
            System.out.println("Halo ini dari Konstruktor Cuaca");
    }

    /**
     * @return the suhu
     */
    public void Suhu(){
        System.out.println("Ini suhu dari Cuaca...");
    }

    /**
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the kondisi
     */
    public String getKondisi() {
        return kondisi;
    }

    /**
     * @param kondisi the kondisi to set
     */
    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

}
