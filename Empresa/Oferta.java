/*****************************************************************************/
/**************************PRACTICA 2 DE MP***********************************/
/***************************REALIZADA POR:************************************/
/****************JOSE ANTONIO PEREIRA SUAREZ (infjps00)***********************/
/**************JESUS ANGEL PEREZ-ROCA FERNANDEZ (infjpf02)********************/
/*****************************************************************************/


public class Oferta{

 private String nombreEmpresa;
 private String dinero;
 private String trabajo;



 Oferta(String nombr,String sueld,String trab){
   nombreEmpresa=nombr;
   dinero=sueld;
   trabajo=trab;
 }

public String nombre(){
  return nombreEmpresa;
}

public String sueldo(){
  return dinero;
}

public String puesto(){
  return trabajo;
}

public String toString(){
  return(nombreEmpresa+"\t"+dinero+"\t"+trabajo+"\n");
}
}
