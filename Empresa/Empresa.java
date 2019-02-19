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


     class Conclusion extends WindowAdapter{
      public void windowClosing(WindowEvent evt){
          System.exit(0);
      }
 
 }

class Empresa extends JFrame {
public static void main(String args[]){

     new Empresa();
}
     
       private Vector ofertas=new Vector();
       private Vector candidatos=new Vector();
       private String nombre;

    public Empresa(){

        JMenu menu_ofertas=new JMenu("Ofertas");
        JMenuItem item_altas=new JMenuItem("Dar de alta");
        menu_ofertas.add(item_altas);
        item_altas.addActionListener(new AltaOfertas(this,ofertas));

        JMenuItem listado_ofertas=new JMenuItem("Listar Ofertas");
        menu_ofertas.add(listado_ofertas);
	listado_ofertas.addActionListener(new ListarOfertas(this,ofertas));
      
        JMenu menu_candidatos=new JMenu("Candidatos");
        JMenuItem item_altas2=new JMenuItem("Dar de alta");
        menu_candidatos.add(item_altas2);
        item_altas2.addActionListener(new AltaCandidatos(this,candidatos));

        JMenuItem listado_cand=new JMenuItem("Listar Candidatos");
        menu_candidatos.add(listado_cand);
         listado_cand.addActionListener(new ListarCandidatos(this,candidatos));

        JMenuBar empresa=new JMenuBar();
        setJMenuBar(empresa);
        empresa.add(menu_ofertas);
        empresa.add(menu_candidatos);
        
        setTitle("EMPRESA SELECCION");
        setSize(2500,2500);
        setVisible(true);
        Conclusion conclusion=new Conclusion();
        addWindowListener(conclusion);
      

    }


 }
 

