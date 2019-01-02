package me.alarai.model;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * */

import me.alarai.event.PelangganListener;

import javax.swing.*;

public class PelangganModel {

    private String nama,email,noTelp;

    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }

    protected void fireOnChange(){
        if (pelangganListener != null){
            pelangganListener.onChange(this);
        }
    }

    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
    }

    public void simpanForm(){
        JOptionPane.showMessageDialog(null,"Berhasil disimpan");
        resetForm();
    }
}
