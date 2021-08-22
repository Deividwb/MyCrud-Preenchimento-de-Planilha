package br.com.dwb.dao;

import br.com.dwb.infra.ConnectionFactory;
import br.com.dwb.model.Ciudad;
import br.com.dwb.model.Relleno_Planillas;

import javax.swing.*;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import java.awt.event.*;
import java.sql.*;

public class Relleno_Planilla extends ConexaoDAO {
    private JPanel Relleno_Planilla;
    private JPanel Foto;
    private JTextField textTelefono;
    private JTextField textNombre;
    private JTextField textDireccion;
    private JTextField textStatus;
    private JComboBox comboBoxCiudad;
    private JList list_Planilha;
    private JLabel Label_Nombre;
    private JLabel Label_Telefono;
    private JLabel Label_Direccion;
    private JLabel Label_Status;
    private JLabel Label_Ciudad;
    private JButton btnLimpiar;
    private JButton btnBuscar;
    private JButton btnDelete;
    private JButton btnActualizar;
    private JButton btnSave;

    public Relleno_Planilla() {
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConexaoDAO dao = new ConexaoDAO();
                Relleno_Planillas relleno_planillas = new Relleno_Planillas();

                String geraNombre = textNombre.getText();
                relleno_planillas.setNombre(geraNombre);
                String geraTelefono = textTelefono.getText();
                relleno_planillas.setTelefono(geraTelefono);
                String geraDireccion = textDireccion.getText();
                relleno_planillas.setDireccion(geraDireccion);
                String gerarCiudad = comboBoxCiudad.getSelectedItem().toString();
                relleno_planillas.setCiudad(Ciudad.valueOf(gerarCiudad));
                String geraStatus = textStatus.getText();
                relleno_planillas.setStatus(geraStatus);

                dao.save(relleno_planillas);
            }
        });
        comboBoxCiudad.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                drenarComboBox();
                llenarComboEnum();
            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {
            }

            public void llenarComboEnum() {
                for (Ciudad ciudad : Ciudad.values()) {
                    comboBoxCiudad.addItem(ciudad);
                }
            }

            public void drenarComboBox() {
                for (Ciudad ciudad : Ciudad.values()) {
                    comboBoxCiudad.removeItem(ciudad);
                }
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNombre.setText("");
                textTelefono.setText("");
                textDireccion.setText("");
                textStatus.setText("");
                comboBoxCiudad.setSelectedItem(null);
            }
        });
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Relleno_Planilla");
        frame.setContentPane(new Relleno_Planilla().Relleno_Planilla);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
