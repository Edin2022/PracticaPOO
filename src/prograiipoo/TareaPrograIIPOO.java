
package prograiipoo;

import javax.swing.JFrame;
//import java.util.Scanner;

public class TareaPrograIIPOO extends JFrame{
    
     @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        CalculadoraInterfaz interfaz = new CalculadoraInterfaz();
       interfaz.setVisible(true);
       interfaz.setLocationRelativeTo(null);
       
        }
}
    
      
        
        
  /*   Scanner sn = new Scanner(System.in);
       Calculadora calculadora = new Calculadora("JP");
       CalculadoraEspecial CalculadoraEspecial = new CalculadoraEspecial();
       
 
       boolean salir = false;
       int opcion; 
       
       do{
           System.out.println("");
           System.out.println("=======================");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Raiz Cuadrada");
           System.out.println("6. Verificar numero Primo");
              System.out.println("7. Verificar es potecnia");
              System.out.println("8. Verificar es ValorAbsoluto");
              System.out.println("9. Verificar es redondeo");
              System.out.println("10. Verificar es factorial");
              System.out.println("11. Verificar es maximo");
              System.out.println("12. Verificar es minimo");
           System.out.println("13. Salir");
           System.out.println("Selecciona una opcion");
           System.out.println("=======================");
           opcion = sn.nextInt();
            switch(opcion){
                case 1:
                   System.out.println("El resultado de la suma es = " + calculadora.sumar(10, 5));
                   break;
                case 2:
                   System.out.println("El resultado de la resta es = " +calculadora.restar(10, 5));
                   break;
                case 3:
                   System.out.println("El resultado de la multiplicacion es = " +calculadora.multiplicar(10, 5));
                   break;
                case 4:
                    System.out.println("El resultado de la division es = " +calculadora.dividir(10, 5));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " +calculadora.raizCuadrada(16));
                    break;
                case 6:
                    System.out.println("El resultado de primo es = " +calculadora.esPrimo(11));
                    break;
                case 7:
                    System.out.println("El resultado de potencia es = " + CalculadoraEspecial.potencia(50,57));
                    break;   
                case 8:
                    System.out.println("El resultado de valor Absoluto es = " +CalculadoraEspecial.valorAbsoluto(11));
                    break;
                case 9:
                    System.out.println("El resultado de redondeo es = " +CalculadoraEspecial.redondeo(11));
                    break;
                case 10:
                    System.out.println("El resultado de factorial es  = " +CalculadoraEspecial.factorial(11));
                    
                case 11:
                    System.out.println("El resultado de maximos es = " +CalculadoraEspecial.maximo(11,8));
                    break;
                    
                case 12:
                    System.out.println("El resultado de minimo es = " +CalculadoraEspecial.minimo(11,8));
                    break;
                    
                    
                case 13:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 7");
            }
       }
        while(!salir);   
        
    }
}
*/