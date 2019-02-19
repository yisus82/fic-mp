/*****************************************************************************/
/**************************PRACTICA 1 DE MP***********************************/
/***************************REALIZADA POR:************************************/
/****************JOSE ANTONIO PEREIRA SUAREZ (infjps00)***********************/
/**************JESUS ANGEL PEREZ-ROCA FERNANDEZ (infjpf02)********************/
/*****************************************************************************/


public class Rectangulo extends CuadrilateroParalelogramo{

    private double base,altura;


    Rectangulo(double b,double alt){
	base=b;
        altura=alt;
    }


    public double Area(){
	return(base*altura);
    }

    public double Perimetro(){
        return(2*(base + altura));
	    }
}
