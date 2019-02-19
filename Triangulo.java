/*****************************************************************************/
/**************************PRACTICA 1 DE MP***********************************/
/***************************REALIZADA POR:************************************/
/****************JOSE ANTONIO PEREIRA SUAREZ (infjps00)***********************/
/**************JESUS ANGEL PEREZ-ROCA FERNANDEZ (infjpf02)********************/
/*****************************************************************************/


public class Triangulo extends FiguraGeometrica{

    private double base,lado2,lado3,altura;


    Triangulo(double alt,double l1,double l2,double l3){
	altura=alt;
        base=l1;
        lado2=l2;
        lado3=l3;    
 }


    public double Area(){
	return(base*altura/2);
    }

    public double Perimetro(){
        return(base+lado2+lado3);
	    }
}
