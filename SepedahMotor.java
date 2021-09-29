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
public class SepedahMotor extends MotorTrail {

    private Mesin mesin;
    private String merkMotor;
    private boolean kontakMotor = false;

    public SepedahMotor(String merkMotor, String merkMesin) {
        this.merkMotor = merkMotor;
        mesin.setMerk(merkMesin);
    }

    public String getMerkMotor() {
        return merkMotor;
    }

    public void setMerkMotor(String merkMotor) {
        this.merkMotor = merkMotor;
    }

    public String getMerkMesin() {
        return mesin.getMerk();
    }

    public void tambahKecepatanMotor() {
        if (kontakMotor == true) {
            if (mesin.getKecepatan() >= 100) {
            System.out.println("Tidak bisa menambahkan kecepatan karna kecepatan maksimum adalah 100Km/Jam");
            mesin.setKecepatan(100);
            }else{
             mesin.tambahkecepatan(); 
            }
        } else {
            System.out.println("Tidak bisa menambahkan kecepatan karna mesin mati");
        }
    }

    public void KurangiKecepatanMotot() {
        if (kontakMotor == true) {
            if (mesin.getKecepatan() <= 0) {
            System.out.println("Tidak bisa mengurangi kecepatan karna kecepatan minimum adalah 0Km/Jam");
            mesin.setKecepatan(0);
            }else{
             mesin.kurangiKecepatan();
            }
        } else {
            System.out.println("Tidak bisa mengurangi kecepatan karna mesin mati");
        }
    }

    public void nyalakanMesin() {
        kontakMotor = true;
    }

    public void matikanMesin() {
        kontakMotor = false;
        mesin.setKecepatan(0);
    }
}
