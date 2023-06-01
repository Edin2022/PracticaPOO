

package practicapoo;


public class CalculadoraEspecial{    
    //Atributos de Clase, pueden ser Publicos, Privados y Protegidos (en herencia)
    
    public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;
    
     
    
    //Constructor de la calse
    public CalculadoraEspecial(String propietario){
        this.tipoCalculadora = "Calculadora Básica";
        this.dimensionPantalla = 10;
        this.numeroDeSerie = "12345abc";
        this.color = "Azul";
        this.nombrePropietario = propietario;
    }
    
    //arriba se modifico
    
    
    //Constructor vacio
    public CalculadoraEspecial(){
        
    }

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

