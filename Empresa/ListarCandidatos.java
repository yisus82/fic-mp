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


class ListarCandidatos implements ActionListener{
   
    private Empresa empresaSeleccion;
    private Vector cand;
    private JList listado;


ListarCandidatos(Empresa empresa,Vector candidatos){

      empresaSeleccion=empresa;
      cand=candidatos;
}

public void actionPerformed(ActionEvent e){

      listado=new JList(cand);
      Container cont=empresaSeleccion.getContentPane();
      cont.removeAll();
      JPanel listar_candidatos=new JPanel();
      listar_candidatos.setLayout(null);

      TextArea l_candidatos=new
TextArea("Nombre\tApellidos\tDireccion\tTelefono\tPuesto\n\n",75,100);
       for(int i = 0; i < listado.getModel().getSize(); i++) {
          l_candidatos.append((listado.getModel().getElementAt(i)).toString());
      }
      l_candidatos.setBounds(40,70,1000,750);
      listar_candidatos.add(l_candidatos);

      listar_candidatos.setBounds(0,0,400,400);
      cont.add(listar_candidatos);
      empresaSeleccion.setVisible(true);

}

}

