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

public class CancelarOferta implements ActionListener{

 private Empresa empresa;
 private JTextField nombre;
 private JTextField sueldo;
 private JTextField puesto;


 CancelarOferta(Empresa emp,JTextField t_nombre,JTextField t_sueldo,JTextField t_puesto){
     
         empresa=emp;
         nombre=t_nombre;
         sueldo=t_sueldo;
         puesto=t_puesto;
 }


 public void actionPerformed(ActionEvent evt){

     nombre.setText(" ");
     sueldo.setText(" ");
     puesto.setText(" ");
     

 }

}
