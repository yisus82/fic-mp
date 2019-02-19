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

public class CancelarCandidato implements ActionListener{

 private Empresa empresa;
 private JTextField nombre;
 private JTextField apellidos;
 private JTextField direccion;
 private JTextField telefono;
 private JTextField puesto;
 
 CancelarCandidato(Empresa emp,JTextField t_nombre,JTextField t_apellidos,JTextField t_direccion,JTextField t_telefono,JTextField t_puesto){
     
         empresa=emp;
         nombre=t_nombre;
         apellidos=t_apellidos;
         direccion=t_direccion;
         telefono=t_telefono;
         puesto=t_puesto;
 }


 public void actionPerformed(ActionEvent evt){

     nombre.setText(" ");
     apellidos.setText(" ");
     direccion.setText(" ");
     telefono.setText(" ");
     puesto.setText(" ");
 }

}
