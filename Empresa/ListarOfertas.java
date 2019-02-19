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


class ListarOfertas implements ActionListener{
   
    private Empresa empresaSeleccion;
    private Vector of;
    private JList listado;



ListarOfertas(Empresa empresa,Vector ofertas){

      empresaSeleccion=empresa;
      of=ofertas;
}

public void actionPerformed(ActionEvent e){

      listado=new JList(of);
      Container cont=empresaSeleccion.getContentPane();
      cont.removeAll();
      JPanel listar_ofertas=new JPanel();
      listar_ofertas.setLayout(null);

      TextArea l_ofertas=new TextArea("Nombre\tSueldo\tPuesto\n\n",75,60);
      for(int i = 0; i < listado.getModel().getSize(); i++) {
        l_ofertas.append((listado.getModel().getElementAt(i)).toString()); 
      }
      l_ofertas.setBounds(40,70,1000,750);
      listar_ofertas.add(l_ofertas);

      listar_ofertas.setBounds(0,0,400,400);
      cont.add(listar_ofertas);
      empresaSeleccion.setVisible(true);


}

}

