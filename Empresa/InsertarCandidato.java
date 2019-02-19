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

public class InsertarCandidato implements ActionListener{

private Empresa empresa;
private JTextField nombre;
private JTextField apellidos;
private JTextField direccion;
private JTextField telefono;
private JTextField puesto;
private Vector candidatos;

public InsertarCandidato(Empresa empresaSeleccion,JTextField text_nombre,JTextField text_apellidos,JTextField text_direccion,JTextField text_telefono,JTextField text_puesto,Vector candidato){

      empresa=empresaSeleccion;
      nombre=text_nombre;
      apellidos=text_apellidos;
      direccion=text_direccion;
      telefono=text_telefono;
      puesto=text_puesto;
      candidatos=candidato;
      
}

public void actionPerformed(ActionEvent evt){

    
      Candidato candidato = new Candidato(nombre.getText(),apellidos.getText(),direccion.getText(),telefono.getText(),puesto.getText());
      candidatos.addElement(candidato);
      nombre.setText(" ");
      apellidos.setText(" ");
      direccion.setText(" ");
      telefono.setText(" ");
      puesto.setText(" ");
      
     
     
      
    

 /*      for (Iterator i = ofertas.iterator(); i.hasNext(); )
      {
        System.out.println((i.next()).nombre+ "    " + (i.next()).sueldo + "    " + (i.next()).puesto);
      }
*/
      

}
      
}
