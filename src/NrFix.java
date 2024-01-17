
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dorel
 */
public class NrFix extends NrTel {

    public NrFix(String nr) {
        super(nr);
    }

    @Override
    public void validareNumar() {
        if (nr.startsWith("02") || nr.startsWith("03")) {
          //  String nrF = nr;
        } else {
            throw new NullPointerException("Numarul nu este fix");
        }
    }
}
