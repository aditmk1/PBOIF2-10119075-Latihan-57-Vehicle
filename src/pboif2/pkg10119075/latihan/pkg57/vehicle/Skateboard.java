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
Deskripsi Program : Program ini berisi program untuk menampilkan skateboard
 */

public class Skateboard extends Vehicle {
    private double myBoardLength;

    public Skateboard(){
        setMyBrand("Ally Skate");
        setMyModel("Rocket");
        setBoardLength(54.5);

        System.out.println("Bicycle");
        System.out.println("Brand  : "+getMyBrand());
        System.out.println("Model  : "+getMyModel());
        System.out.println("Jumlah Gear : "+getBoardLength());
    }
   public double getBoardLength(){
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength){
        this.myBoardLength = boardLength;
    }
}
