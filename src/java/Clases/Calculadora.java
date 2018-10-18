package Clases;

/**
 *
 * @author CB090828
 */
public class Calculadora {
    protected String nombreDeClase;
    private String comentarios;
    
    public Calculadora(){//constructor
        this.nombreDeClase="Calculadora en el Servidor";
        this.comentarios="Ninguno hasta el momento";
    }
    
    public int sumar(int a, int b){
        return a+b;
    }
    
    public int restar(int a, int b){
        return a-b;
    }
    
    public int multiplicar(int a, int b){
        return a*b;
    }
    
    public int dividir(int a, int b){
        return a/b;
    }
    
    public String getNombreDeClase(){
        return this.nombreDeClase;
    }
}
