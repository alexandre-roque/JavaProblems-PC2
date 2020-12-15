package dominio;

import java.util.Random;

/**
 *
 * @author Alexandre Roque e Vitor Santana
 */
public class Calculo {
    
    private double num1;
    private double num2;
    private int operador;

    public Calculo() {
        
        Random gerador = new Random();
        this.num1 = gerador.nextInt(101);
        this.num2 = gerador.nextInt(102)+ 1;
        this.operador = gerador.nextInt(4);//
    }
    
    public double calculaOperacao(){
        
        double total = 0.0;
        
        switch(this.operador){
            
            case 0: 
                total = this.num1 + this.num2;
                break;
            case 1:
                total = this.num1 - this.num2;
                break;
            case 2:
                total = this.num1 * this.num2;
                break;
            case 3:
                total = Math.round((this.num1 / this.num2) * 10.0)/10.0;;
                break;
                
            default:
                break;
        }
        
        return total;
               
    }
    

    public String getOperador() {
        
        String operador;
        
        switch(this.operador){
            
            case 0: 
                operador = "+";
                break;
            case 1:
                operador = "-";
                break;
            case 2:
                operador = "*";
                break;
            case 3:
                operador = "/";
                break;
            default:
                operador = "";
                break;
        }
        
        return operador;
    }      

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
   
    
}
