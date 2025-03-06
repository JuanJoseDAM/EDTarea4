/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edtarea4;
import cuentas.CCuenta;
/**
 *
 * @author juanj
 */
public class EDTarea4 {

    public static void main(String[] args) {
       CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
