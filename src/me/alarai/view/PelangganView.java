package me.alarai.view;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * */

import me.alarai.controller.PelangganController;
import me.alarai.event.PelangganListener;
import me.alarai.model.PelangganModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PelangganView extends JFrame implements PelangganListener {
    private JTextField txtNama;
    private JTextField txtEmail;
    private JTextField txtNoTelp;
    private JButton SIMPANButton;
    private JButton RESETButton;
    private JPanel rootPanel;

    private PelangganModel model;
    private PelangganController controller;

    public PelangganView(){
        controller = new PelangganController();
        model = new PelangganModel();

        model.setPelangganListener(this);
        controller.setModel(model);

        add(rootPanel);
        setTitle("BarberShop");
        setSize(400,500);
        SIMPANButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.simpanForm((PelangganView) model.getPelangganListener());
            }
        });
        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.resetForm((PelangganView) model.getPelangganListener());
            }
        });
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtNoTelp() {
        return txtNoTelp;
    }


    @Override
    public void onChange(PelangganModel pelanggan) {
        txtNama.setText(model.getNama());
        txtEmail.setText(model.getEmail());
        txtNoTelp.setText(model.getNoTelp());
    }
}
