/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopagina412;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author sebas
 */
public class Calculos {
    static String calcularLogaritmoNeperiano(double valor) {
        try {
         if (valor < 0) {
            JOptionPane.showMessageDialog(null,"El valor debe ser un número positivo para calcular el logaritmo","Error", JOptionPane.ERROR_MESSAGE);
            String f=" ";
            return f;
            }
        else{
            double resultado = Math.log(valor);
            return String.valueOf(resultado);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"El valor debe ser numérico para calcular el logaritmo","Error", JOptionPane.ERROR_MESSAGE);
            String f=" ";
            return f;
        }
    }
    static double calcularRaiz(double valor) {
        try {
            if (valor < 0) {
                JOptionPane.showMessageDialog(null,"El valor debe ser un número positivo para calcular la raíz cuadrada","Error", JOptionPane.ERROR_MESSAGE);
                double f=-1;
                return f;
            }
            else{
                double resultado = Math.sqrt(valor);
                return resultado;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"El valor debe ser numérico para calcular la raíz cuadrada","Error", JOptionPane.ERROR_MESSAGE);
            double f=-1;
            return f;
        }

}

}