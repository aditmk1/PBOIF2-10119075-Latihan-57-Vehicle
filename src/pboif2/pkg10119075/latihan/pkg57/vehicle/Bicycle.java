/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan.pkg57.vehicle;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan bicycle
 */

public class Bicycle extends Vehicle {
    private int myGearCount;


    public Bicycle(){
        setMyBrand("Trek Bike");
        setMyModel("7.4FX");
        setGearCount(23);

        System.out.println("Bicycle");
        System.out.println("Brand  : "+getMyBrand());
        System.out.println("Model  : "+getMyModel());
        System.out.println("Jumlah Gear : "+getGearCount());
    }
    
    public int getGearCount(){
        return myGearCount;
    }
    
    public void setGearCount(int gearCount){
        this.myGearCount = gearCount;
    }
}

