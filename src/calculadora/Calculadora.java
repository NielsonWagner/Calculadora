package calculadora;

public class Calculadora {
    
    private String proprietario;
    
    public Calculadora (String nome){
        proprietario = nome;
    }
    
    public double somar (double valor1, double valor2){
        return valor1 + valor2;
    }
    public double subtrair (double valor1, double valor2){
        return valor1 - valor2;
}
    public double multiplicar (double valor1, double valor2){
        return valor1 * valor2;
    }
    public double dividir (double valor1, double valor2){
        return valor1 / valor2;
    }
    public int potencia (int valor1, int valor2){
        int potencia = 1;
        for (int i = 0; i < valor2; i++){
            potencia = potencia * valor1;
        }
        return potencia;
    }
    public boolean ehpar (int valor){
        return valor % 2 == 0;
    }
    public String toString (){
        return "Calculadora de" + proprietario;
    }
}
