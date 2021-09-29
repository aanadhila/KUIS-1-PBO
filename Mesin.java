/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KUIS1;

/**
 *
 * @author HP
 */
public class Mesin {
    private String merk;
    private double kecepatan;

    public Mesin() {
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    public void tambahkecepatan(){
            kecepatan += 5;
            if (kecepatan > 100) {
                kecepatan = 100;
            }
    }
    public void kurangiKecepatan(){
        kecepatan -= 5;
        if(kecepatan <= 0){
            kecepatan = 0;
        }
    }
}
