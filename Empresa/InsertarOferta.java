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

public class InsertarOferta implements ActionListener{

private Empresa empresa;
private JTextField nombre;
private JTextField sueldo;
private JTextField puesto;
private Vector ofertas;

public InsertarOferta(Empresa empresaSeleccion,JTextField text_nombre,JTextField text_sueldo,JTextField text_puesto,Vector oferta){

      empresa=empresaSeleccion;
      nombre=text_nombre;
      sueldo=text_sueldo;
      puesto=text_puesto;
      ofertas=oferta;
      
}

public void actionPerformed(ActionEvent evt){

    
      Oferta ofert = new Oferta(nombre.getText(),sueldo.getText(),puesto.getText());
      ofertas.addElement(ofert);
      nombre.setText(" ");
      sueldo.setText(" ");
      puesto.setText(" ");
      
      
     
      

 /*      for (Iterator i = ofertas.iterator(); i.hasNext(); )
      {
        System.out.println((i.next()).nombre+ "    " + (i.next()).sueldo + "    " + (i.next()).puesto);
      }
*/
      

}
      
}
/*List list = new ArrayList();
     // Uses the add method to add
     // each element
     list.add("This is a String");
     list.add(new Short((short)12));
     list.add(new Integer(35));
     
     // Get an iterator for the input list
     // and step through each element within the
     // for statement.
     for (Iterator i = list.iterator(); i.hasNext(); )
      {
        System.out.print(i.next()+ " "); 
      }

*/
