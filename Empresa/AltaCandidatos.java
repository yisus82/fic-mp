/*****************************************************************************/
/**************************PRACTICA 2 DE MP***********************************/
/***************************REALIZADA POR:************************************/
/****************JOSE ANTONIO PEREIRA SUAREZ (infjps00)***********************/
/**************JESUS ANGEL PEREZ-ROCA FERNANDEZ (infjpf02)********************/
/*****************************************************************************/


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.Vector;


class AltaCandidatos implements ActionListener{

    public Empresa empresaSeleccion;
    private Vector cand=new Vector();



    AltaCandidatos(Empresa empresa,Vector candidatos){

              empresaSeleccion=empresa;
              cand=candidatos;
}

public void actionPerformed(ActionEvent evt){
           
           Container cont2=empresaSeleccion.getContentPane();
           cont2.removeAll();           
           JPanel panel_candidatos=new JPanel();
           panel_candidatos.setLayout(null);
                       
                      
           JLabel nombre=new JLabel("Nombre");
           nombre.setBounds(40,100,60,30);
           panel_candidatos.add(nombre);
           
           JLabel apellidos=new JLabel("Apellidos");
           apellidos.setBounds(40,140,80,30);
           panel_candidatos.add(apellidos);
           
           JLabel direccion=new JLabel("Dirección");
           direccion.setBounds(40,180,80,30);
           panel_candidatos.add(direccion);
           
           JLabel telefono=new JLabel("Teléfono");
           telefono.setBounds(40,220,80,30);
           panel_candidatos.add(telefono);
           
           JLabel puesto=new JLabel("Puesto");
           puesto.setBounds(40,260,60,30);
           panel_candidatos.add(puesto);

           JTextField texto_nombre=new JTextField(20);
           texto_nombre.setBounds(170,100,100,35);
           panel_candidatos.add(texto_nombre);
                      
           JTextField texto_apellidos=new JTextField(30);
           texto_apellidos.setBounds(170,140,200,35);
           panel_candidatos.add(texto_apellidos);
           
           JTextField texto_direccion=new JTextField(35);
           texto_direccion.setBounds(170,180,250,35);
           panel_candidatos.add(texto_direccion);
           
           JTextField texto_telefono=new JTextField(12);
           texto_telefono.setBounds(170,220,100,35);
           panel_candidatos.add(texto_telefono);

           JTextField texto_puesto=new JTextField(15);
           texto_puesto.setBounds(170,260,100,35);
           panel_candidatos.add(texto_puesto);
           
           JButton botonAceptar=new JButton("Aceptar");
           botonAceptar.setBounds(120,375,110,30);
           botonAceptar.addActionListener(new InsertarCandidato(empresaSeleccion,texto_nombre,texto_apellidos,texto_direccion,texto_telefono,texto_puesto,cand));
           
           JButton botonCancelar=new JButton("Cancelar");
           botonCancelar.setBounds(250,375,110,30);
           botonCancelar.addActionListener(new CancelarCandidato(empresaSeleccion,texto_nombre,texto_apellidos,texto_direccion,texto_telefono,texto_puesto));
           panel_candidatos.add(botonAceptar);
           panel_candidatos.add(botonCancelar);
           
           panel_candidatos.setBounds(0,0,400,400);
           cont2.add(panel_candidatos);
           empresaSeleccion.setVisible(true);           


            
}
}

