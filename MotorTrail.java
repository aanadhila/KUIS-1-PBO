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
public class MotorTrail {
    private String kondisiKopling;

    public String getKondisiKopling() {
        return kondisiKopling;
    }

    public void setKondisiKopling(String kondisiKopling) {
        if (kondisiKopling == "1") {
            this.kondisiKopling = "PENUH";
        }else if(kondisiKopling == "0.5"){
            this.kondisiKopling = "SETENGAH";          
        }else{
            this.kondisiKopling = "NONE";
        }
    }
    
}
