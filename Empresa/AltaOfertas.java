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


class AltaOfertas implements ActionListener{

    private Empresa empresaSeleccion;
    private Vector of;



    AltaOfertas(Empresa empresa,Vector ofertas){

              empresaSeleccion=empresa;
              of=ofertas;
}

public void actionPerformed(ActionEvent evt){
           
           Container cont=empresaSeleccion.getContentPane();
           cont.removeAll();
           JPanel panel_ofertas=new JPanel();     
           panel_ofertas.setLayout(null);
           
           
           JLabel nombre_empresa=new JLabel("Nombre empresa");
           nombre_empresa.setBounds(40,100,160,30);
           panel_ofertas.add(nombre_empresa);
           JLabel sueldo=new JLabel("Sueldo");
           sueldo.setBounds(40,150,60,30);
           panel_ofertas.add(sueldo);
           JLabel puesto=new JLabel("Puesto");
           puesto.setBounds(40,190,60,30);
           panel_ofertas.add(puesto);
           
           JTextField texto_nombre=new JTextField(35);
           texto_nombre.setBounds(170,100,200,35);
           panel_ofertas.add(texto_nombre);
                      
           JTextField texto_sueldo=new JTextField(10);
           texto_sueldo.setBounds(170,150,100,35);
           panel_ofertas.add(texto_sueldo);
           
           JTextField texto_puesto=new JTextField(20);
           texto_puesto.setBounds(170,190,100,35);
           panel_ofertas.add(texto_puesto);
           texto_puesto.setVisible(true);
           
           JButton botonAceptar=new JButton("Aceptar");
           botonAceptar.setBounds(120,300,110,30);
                    
           botonAceptar.addActionListener(new InsertarOferta(empresaSeleccion,texto_nombre,texto_sueldo,texto_puesto,of));
       
           JButton botonCancelar=new JButton("Cancelar");
           botonCancelar.setBounds(250,300,110,30);
           botonCancelar.addActionListener(new CancelarOferta(empresaSeleccion,texto_nombre,texto_sueldo,texto_puesto));
           
           panel_ofertas.add(botonAceptar);
           panel_ofertas.add(botonCancelar);
           
           panel_ofertas.setBounds(0,0,400,400); 
           cont.add(panel_ofertas);
           empresaSeleccion.setVisible(true);           
      
            
}
}

