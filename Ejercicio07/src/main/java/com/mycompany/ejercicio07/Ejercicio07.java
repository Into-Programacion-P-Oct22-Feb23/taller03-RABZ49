/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio07;

/**
 *
 * @author roberto
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 9;
        int var5 = 10;
        int var6 = 1;
        int var7 = 100;
        int var8 = 25;
        int var9 = 100;
        double resultado = ((Math.sqrt(var1) + var2 / var3));
        boolean resultadof = resultado == var4;
        boolean var10 = var5 > var6;
        boolean resultadofa = resultadof || var10;
        double resultadofo = var7 / var8;
        boolean resultadofu = resultadofo > Math.sqrt(var9);
        boolean resultadofi = resultadofa && resultadofu;
        System.out.print(resultadofi);
    }
}
