package me.alarai.controller;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * */

import me.alarai.model.PelangganModel;
import me.alarai.view.PelangganView;

import javax.swing.*;

public class PelangganController {

    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }

    public void resetForm(PelangganView view){

        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtNoTelp().getText();

        if ((!nama.equals("")) && (!email.equals("")) && (!noTelp.equals(""))){
            model.resetForm();
        }

    }

    public void simpanForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtNoTelp().getText();

        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama masih kosong!");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email masih kosong!");
        }else if(noTelp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "No Telp masih kosong!");
        }else{
            model.simpanForm();
        }
    }
}
