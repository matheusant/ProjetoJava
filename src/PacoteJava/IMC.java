package PacoteJava;

import javax.swing.*;

public class IMC {
    public static void main(String[] args) {
        double num1, num2, imc=0;
        String aux ="";
    
        
        aux = JOptionPane.showInputDialog(null, "Entre com seu peso: ", "Peso", JOptionPane.QUESTION_MESSAGE);
        aux = aux.replace(',', '.');
        num1 = Double.parseDouble(aux);
        
        if(num1<0.5){
            JOptionPane.showMessageDialog(null, "Valor Incorreto", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            
        }
        
        aux = JOptionPane.showInputDialog(null, "Entre com sua altura: ", "Altura", JOptionPane.QUESTION_MESSAGE);
        aux = aux.replace(',', '.');
        num2 = Double.parseDouble(aux);
        
        if(num2>0.1){
            
            num2 = num2 * num2;
           
           
            
        }else{
            JOptionPane.showMessageDialog(null, "Valor Incorreto", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        imc = num1 / num2;
        JOptionPane.showMessageDialog(null, imc);
        
                
        if(imc<18.5){
            JOptionPane.showMessageDialog(null, "Classificação: Excesso de Magreza", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
            
        }
        if(imc>=18.5 && imc<25){
    
            JOptionPane.showMessageDialog(null, "Classificação: Peso Normal", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(imc>=25 && imc<30){
    
            JOptionPane.showMessageDialog(null, "Classificação: Excesso de Peso", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(imc>=30 && imc<35){
    
            JOptionPane.showMessageDialog(null, "Classificação: Obesidade (Grau I)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(imc>=35 && imc<=40){
    
            JOptionPane.showMessageDialog(null, "Classificação: Obesidade (Grau II)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(imc>40){
    
            JOptionPane.showMessageDialog(null, "Classificação: Obesidade (Grau III)", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
