
import java.io.Serializable;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dorel
 */
public class Contact implements Serializable   {

    String nume;
    String prenume;
    String dataNastere;
    String nrTel;

    public Contact(String nume, String prenume, String dataNastere, String nrTel) {

        this.nume = nume;
        this.prenume = prenume;
        this.dataNastere = dataNastere;
        this.nrTel = nrTel;
        // valideazaData(dataNastere);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getTel() {
        return nrTel;
    }

    public String getData() {
        return dataNastere;
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " nascuta pe " + dataNastere + " cu numarul " + nrTel;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Contact)) {
            return false;
        }
        Contact p = (Contact) o;
        return getNume().equalsIgnoreCase(p.getNume()) && getPrenume().equalsIgnoreCase(p.getPrenume()) && getData().equals(p.getData()) && getTel().equals(p.getTel());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nume);
        hash = 97 * hash + Objects.hashCode(this.prenume);
        hash = 97 * hash + Objects.hashCode(this.dataNastere);
        hash = 97 * hash + Objects.hashCode(this.nrTel);
        return hash;
    }

 
}
