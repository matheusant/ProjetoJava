package PacoteJava;

import javax.swing.*;

public class JanelaMultiplicacao {

    public static void main(String[] args) {
        double num1, num2, resul;
        String aux = "";

        aux = JOptionPane.showInputDialog(null, "Entre com o primeiro número: ");
        num1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Entre com o segundo número: ");
        num2 = Double.parseDouble(aux);

        resul = MetodoMultiplicar.multiplicarValor(num1, num2);

        JOptionPane.showMessageDialog(null, "O resultado é: " + resul);

    }

}
