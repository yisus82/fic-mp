/*****************************************************************************/
/**************************PRACTICA 2 DE MP***********************************/
/***************************REALIZADA POR:************************************/
/****************JOSE ANTONIO PEREIRA SUAREZ (infjps00)***********************/
/**************JESUS ANGEL PEREZ-ROCA FERNANDEZ (infjpf02)********************/
/*****************************************************************************/


public class Candidato{

 private String nombr;
 private String apell;
 private String dir;
 private String telef;
 private String trabajo;
 


 Candidato(String nom,String ap,String direc,String tel,String trab){
   nombr=nom;
   apell=ap;
   dir=direc;
   telef=tel;
   trabajo=trab;
 }

public String nombre(){
  return nombr;
}

public String apellidos(){
  return apell;
}

public String direccion(){
  return dir;
}

public String telefono(){
  return telef;
}  

public String puesto(){
  return trabajo;
}

public String toString(){
 return(nombr+"\t"+apell+"\t"+dir+"\t"+telef+"\t"+trabajo+"\n");
}
}
