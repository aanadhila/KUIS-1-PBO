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
public class Main {
    public static void main(String[] args) {
        Mesin ms = new Mesin();
        SepedahMotor sp1 = new SepedahMotor("RX king", "Ducati");
        sp1.nyalakanMesin();
        sp1.setKondisiKopling("0.5");
        sp1.getMerkMesin();
        sp1.getMerkMotor();
        sp1.getKondisiKopling();
        
        
        
    }
}
