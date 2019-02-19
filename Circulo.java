/*****************************************************************************/
/**************************PRACTICA 1 DE MP***********************************/
/***************************REALIZADA POR:************************************/
/****************JOSE ANTONIO PEREIRA SUAREZ (infjps00)***********************/
/**************JESUS ANGEL PEREZ-ROCA FERNANDEZ (infjpf02)********************/
/*****************************************************************************/


public class Circulo extends FiguraGeometrica{

    private double radio;


    Circulo(double r){
	radio=r;
    }


    public double Area(){
	return(Math.PI*radio*radio);
    }

    public double Perimetro(){
        return(2*Math.PI*radio);
	    }
}
