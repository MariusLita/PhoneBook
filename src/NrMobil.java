/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dorel
 */
public class NrMobil extends NrTel {
    public NrMobil(String nr){
        super(nr);
    }

    @Override
    public void validareNumar() {
        if (nr.startsWith("07")) {
         //   String nrM = nr;
        } else {
            throw new NullPointerException("Numarul nu este mobil");
        }
    }
}
