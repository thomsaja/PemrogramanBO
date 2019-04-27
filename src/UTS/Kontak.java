/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Thomas
 */
public class Kontak {

    private String Nama, Alamat, NoHP, Email;

    public Kontak(String Nama, String Alamat, String NoHP, String Email) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.NoHP = NoHP;
        this.Email = Email;
    }

    public Kontak() {

    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNoHP() {
        return NoHP;
    }

    public void setNoHP(String NoHP) {
        this.NoHP = NoHP;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
