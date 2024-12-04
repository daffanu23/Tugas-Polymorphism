/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matematika;

/**
 *
 * @author Daffa
 */
public class MatematikaCanggih extends Matematika {
    void modulus(int a, int b) {
        operasi = a % b;
        System.out.println("Hasil modulus: " + operasi);
    }
    
    void modulus(int a, int b, int c) {
        operasi = a % b % c;
        System.out.println("Hasil modulus: " + operasi);
    }
    
    void modulus(double a, double b) {
        hasil = a % b;
        System.out.println("Hasil modulus(double): " + hasil);
    }
    
    void modulus(double a, double b, double c) {
        hasil = a % b % c;
        System.out.println("Hasil modulus(double): " + hasil);
    }
}