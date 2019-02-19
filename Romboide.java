/*****************************************************************************/
/**************************PRACTICA 1 DE MP***********************************/
/***************************REALIZADA POR:************************************/
/****************JOSE ANTONIO PEREIRA SUAREZ (infjps00)***********************/
/**************JESUS ANGEL PEREZ-ROCA FERNANDEZ (infjpf02)********************/
/*****************************************************************************/


public class Romboide extends CuadrilateroParalelogramo{

    private double altura,lado,base;


    Romboide(double b,double l,double a){
	base=b;
        lado=l;
        altura=a; 
   }


    public double Area(){
	return(base*altura);
    }

    public double Perimetro(){
        return(2*(lado+altura));
	    }
}
