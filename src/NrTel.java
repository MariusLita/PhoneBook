/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dorel
 */
public abstract class NrTel {
    String nr;
    NrTel(String n){
        if (n == null ){
            throw new IllegalArgumentException("Numarul nu poate sa lipseasca");
        }
        nr=n;
    }
   public abstract void validareNumar();
    
   public String toString() {
        return nr + ", ";
    }
}
 