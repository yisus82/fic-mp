/*****************************************************************************/
/**************************PRACTICA 1 DE MP***********************************/
/***************************REALIZADA POR:************************************/
/****************JOSE ANTONIO PEREIRA SUAREZ (infjps00)***********************/
/**************JESUS ANGEL PEREZ-ROCA FERNANDEZ (infjpf02)********************/
/*****************************************************************************/


public class Cuadrado extends CuadrilateroParalelogramo{

    private double lado;


    Cuadrado(double l){
	lado=l;
    }


    public double Area(){
	return(lado*lado);
    }

    public double Perimetro(){
        return(4*lado);
	    }
}
