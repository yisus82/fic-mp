/*****************************************************************************/
/**************************PRACTICA 1 DE MP***********************************/
/***************************REALIZADA POR:************************************/
/****************JOSE ANTONIO PEREIRA SUAREZ (infjps00)***********************/
/**************JESUS ANGEL PEREZ-ROCA FERNANDEZ (infjpf02)********************/
/*****************************************************************************/


import java.io.*;



class P1{

  public static void main(String args[]){

     int opcion,opcion2;
     double altura,radio,lado1,lado2,lado3;
     BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
     boolean salir=false,salir2=false;



     do{
      try{

          System.out.println("\n\nMENU PRACTICA 1\n");
          System.out.println("\nSelecciona una opcion");
          System.out.println("\n1. Circulo");
          System.out.println("\n2. Triangulo\n");
          System.out.println("3. Paralelogramos");
          System.out.println("\n4. Salir");

          
          opcion=(new Integer(entrada.readLine())).intValue();

          switch(opcion){
           
             case 1:System.out.println("Ha elegido Circulo\n");
                    System.out.println("Introduzca el valor del radio");
                    radio=new Double(entrada.readLine()).doubleValue();
                    Circulo circulo=new Circulo(radio);
                    System.out.println("\nEl area del circulo es:" + circulo.Area());
                    System.out.println("La longitud del circulo es:" + circulo.Perimetro());
                    break;
             case 2:System.out.println("Ha elegido Triangulo\n");
                    System.out.println("Introduzca el valor de la altura");
                    altura=new Double(entrada.readLine()).doubleValue();
                    System.out.println("Introduzca el valor de la base");
                    lado1=new Double(entrada.readLine()).doubleValue();
                    System.out.println("Introduzca el valor del lado2");
                    lado2=new Double(entrada.readLine()).doubleValue();
                    System.out.println("Introduzca el valor del lado3");
                    lado3=new Double(entrada.readLine()).doubleValue();
                    Triangulo triangulo=new Triangulo(altura,lado1,lado2,lado3);
                    System.out.println("\nEl area del triangulo es:" + triangulo.Area());
                    System.out.println("El perimetro del triangulo es:" + triangulo.Perimetro());
                    break;
             case 3: do{
                     System.out.println("\nSelecciona una opcion");
                     System.out.println("\n1. Cuadrado");
                     System.out.println("\n2. Rectangulo\n");
                     System.out.println("3. Rombo\n");
                     System.out.println("4. Romboide\n");
                     System.out.println("5. Volver al inicio");

                     opcion2=(new Integer(entrada.readLine())).intValue();
                     switch(opcion2){
                        case 1:System.out.println("Ha elegido Cuadrado\n");
                               System.out.println("Introduzca el valor del lado");
                               lado1=new Double(entrada.readLine()).doubleValue();
                               Cuadrado cuadrado=new Cuadrado(lado1);
                               System.out.println("\nEl area del cuadrado es:" + cuadrado.Area());
                               System.out.println("El perimetro del cuadrado es:" + cuadrado.Perimetro());
                               break;            
                        case 2:System.out.println("Ha elegido Rectangulo\n");
                               System.out.println("Introduzca el valor de la base\n");
                               lado1=new Double(entrada.readLine()).doubleValue();
                               System.out.println("Introduzca el valor de la altura");
                               lado2=new Double(entrada.readLine()).doubleValue();
                               Rectangulo rectangulo=new Rectangulo(lado1,lado2);
                               System.out.println("\nEl area del rectangulo es:" + rectangulo.Area());
                               System.out.println("El perimetro del rectangulo es:" + rectangulo.Perimetro());
                               break;           
                        case 3:System.out.println("Ha elegido Rombo\n");
                               System.out.println("Introduzca el valor del lado");
                               lado1=new Double(entrada.readLine()).doubleValue();
                               System.out.println("Introduzca el valor de la altura");
                               lado2=new Double(entrada.readLine()).doubleValue();
                               Rombo rombo=new Rombo(lado1,lado2);
                               System.out.println("\nEl area del rombo es:" + rombo.Area());
                               System.out.println("El perimetro del rombo es:" + rombo.Perimetro());
                               break;
                        case 4:System.out.println("Ha elegido Romboide\n");
                               System.out.println("Introduzca el valor de la base");
                               lado1=new Double(entrada.readLine()).doubleValue();
                               System.out.println("Introduzca el valor del lado");
                               lado2=new Double(entrada.readLine()).doubleValue();
                               System.out.println("Introduzca el valor de la altura");
                               lado3=new Double(entrada.readLine()).doubleValue();
                               Romboide romboide=new Romboide(lado1,lado2,lado3);
                               System.out.println("\nEl area del romboide es:" + romboide.Area());
                               System.out.println("El perimetro del romboide es:" + romboide.Perimetro());
                               break;      
                        case 5:salir2=true;
                      //  default:System.out.println("Opcion no valida");
                              //  continue;
                      }
                    }while (salir2!=true);
                    break;
                  case 4:salir=true;
               
                 
               }
              }catch(Exception e){System.out.println("Opcion no valida");}
             }while (salir!=true);
  }
}  
