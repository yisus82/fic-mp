/*****************************************************************************/
/**************************PRACTICA 1 DE MP***********************************/
/***************************REALIZADA POR:************************************/
/****************JOSE ANTONIO PEREIRA SUAREZ (infjps00)***********************/
/**************JESUS ANGEL PEREZ-ROCA FERNANDEZ (infjpf02)********************/
/*****************************************************************************/


public class Rombo extends CuadrilateroParalelogramo{

    private double altura,lado;


    Rombo(double l1,double l2){
	altura=l2;
        lado=l1;
    }


    public double Area(){
	return(lado*altura);
    }

    public double Perimetro(){
        return(4*lado);
	    }
}
