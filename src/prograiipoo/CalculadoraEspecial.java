
package prograiipoo;

import java.util.Random;

public class CalculadoraEspecial extends Calculadora{    
    //Atributos de Clase, pueden ser Publicos, Privados y Protegidos (en herencia)
    
    
  public CalculadoraEspecial (String tipoCalculadora, String color, int dimensionPantalla, String numeroDeSerie, String nombrePropietario){
        super(tipoCalculadora,color,dimensionPantalla,numeroDeSerie,nombrePropietario);
    }
    
    public void mostrarDatos(){
    System.out.println("Tipo de Calculadora: "+tipoCalculadora+"\nColor: "+color+"\nDimension: "+dimensionPantalla+"x"+dimensionPantalla+"\nNumero de Serie: "+numeroDeSerie+"\nNombre del Propietario: "+nombrePropietario);
    }
    
    //calculadora especial
    public int generarNumeroAleatorio(int limiteSuperior) {
        Random random = new Random();
        return random.nextInt(limiteSuperior);
    }
    
    public double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
    public double calcularLogaritmo(double numero) {
        return Math.log(numero);
    }

    public double calcularSeno(double anguloEnRadianes) {
        return Math.sin(anguloEnRadianes);
    }

    public double calcularCoseno(double anguloEnRadianes) {
        return Math.cos(anguloEnRadianes);
    }
    
    public double calcularTangente(double anguloEnRadianes) {
        return Math.tan(anguloEnRadianes);
    }
    
    public double calcularRaizCubica(double numero) {
        return Math.cbrt(numero);
    }
    
}
    
    
    
    
    /*

public double potencia(double base, double exponente){
    return Math.pow(base, exponente);
}

public double valorAbsoluto(double numero){
    return Math.abs(numero);
}

public int redondeo(double numero){
    return (int) Math.round(numero);
}
public int factorial(int numero){
    int resultado = 1;
    for (int i = 1; i <= numero; i++) {
        resultado *= i;
    }
    return resultado;
}

public double maximo(double primerNumero, double segundoNumero){
    return Math.max(primerNumero, segundoNumero);
}

public double minimo(double primerNumero, double segundoNumero){
    return Math.min(primerNumero, segundoNumero);
}

    }

*/