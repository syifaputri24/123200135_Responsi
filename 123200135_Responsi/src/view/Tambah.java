/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import main.Main;
import java.awt.*;
import model.Karyawan1;
/**
 *
 * @author hp
 */
public class Tambah extends JFrame {
    JLabel lJudul = new JLabel("INPUT KARYAWAN");
    
    JLabel lNama = new JLabel("Nama");
   public JTextField tNama = new JTextField(50);
    
    JLabel lUsia = new JLabel("Usia");
   public JTextField tUsia = new JTextField(50);
    
    JLabel lGaji = new JLabel("Gaji");
   public JTextField tGaji = new JTextField(50);
    
    public JButton bSubmit = new JButton("Submit");
    public JButton bReset = new JButton("Reset");
    public JButton bKembali = new JButton("Kembali");
    
    public Tambah(){
        setTitle("Input Karyawan");
        setSize(300, 230);
        setLayout(null);
        
        add(lJudul);
        add(lNama);
        add(tNama);
        add(lUsia);
        add(tUsia);
        add(lGaji);
        add(tGaji);
        add(bSubmit);
        add(bReset);
        add(bKembali);
        
        lJudul.setBounds(15, 5, 200, 20);
        lNama.setBounds(15, 30, 120, 20);
        tNama.setBounds(55, 30, 200, 20);
        lUsia.setBounds(15, 60, 120, 20);
        tUsia.setBounds(55, 60, 200, 20);
        lGaji.setBounds(15, 90, 200, 20);
        tGaji.setBounds(55, 90, 200, 20);
        bSubmit.setBounds(55, 130, 90, 20);
        bSubmit.setBackground(Color.green);
        bSubmit.setForeground(Color.white);
        bReset.setBounds(155, 130, 90, 20);
        bReset.setBackground(Color.red);
        bReset.setForeground(Color.white);
        bKembali.setBounds(15, 165, 250, 20);
        bKembali.setBackground(Color.blue);
        bKembali.setForeground(Color.white);
        
        
        
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public String getNama(){
        return tNama.getText();
    }
    
    public String getUsia(){
        return tUsia.getText();
    }
    
    public String getGaji(){
        return tGaji.getText();
    }
    

}
