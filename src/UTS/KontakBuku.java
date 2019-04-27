/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class KontakBuku {

    ArrayList<Kontak> list = new ArrayList<Kontak>();

    public void SimpanKontak(Kontak kontakbaru) {
        list.add(kontakbaru);
    }

    public Kontak CariKontak(String Nama) {
        Kontak temp = new Kontak();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNama().equals(Nama)) {
                temp = list.get(i);
            }
        }
        return temp;
    }

    public ArrayList<Kontak> ListKontak() {
        return list;
    }

}
