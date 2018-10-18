
package Clases;

/**
 *
 * @author CB090828
 */
public class CalculadoraEspecial extends Calculadora {
    
    public CalculadoraEspecial(){
        //this.comentarios="Calculadora con metodos especializados";
    }
    
    public int potenciar(int a, int b){
        int resultado=a;
        for (int i=1; i<b; i++){
            resultado=resultado*a;
        }
        return resultado;
    }
    
    
    public double sumarDecimales(double a , double b){
        return a + b;
    }
}
