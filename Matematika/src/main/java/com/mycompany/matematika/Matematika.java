/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matematika;

/**
 *
 * @author Daffa
 */
public class Matematika {
    int operasi;
    double hasil;
    void pertambahan (int a, int b){
    operasi = a + b;
    System.out.println("Hasil pertambahan: " + operasi);
    }
    
    void pertambahan (int a, int b, int c){
    operasi = a + b + c;
    System.out.println("Hasil pertambahan: " + operasi);
    }
    
    void pertambahan (double a, double b){
    hasil = a + b;
    System.out.println("Hasil pertambahan (double): " + hasil);
    }
    
    void pertambahan (double a, double b, double c){
    hasil = a + b + c;
    System.out.println("Hasil pertambahan (double): " + hasil);
    }
    
    void pengurangan (int a, int b){
    operasi = a - b;
    System.out.println("Hasil pengurangan: " + operasi);
    }
    
    void pengurangan (int a, int b, int c){
    operasi = a - b - c;
    System.out.println("Hasil pengurangan: " + operasi);
    }
    
    void pengurangan (double a, double b){
    hasil = a - b;
    System.out.println("Hasil pengurangan (double): " + hasil);
    }
    
    void pengurangan (double a, double b, double c){
    hasil = a - b - c;
    System.out.println("Hasil pengurangan (double): " + hasil);
    }

    void perkalian (int a, int b){
    operasi = a * b;
    System.out.println("Hasil perkalian: " + operasi);
    }
    
    void perkalian (int a, int b, int c){
    operasi = a * b;
    System.out.println("Hasil perkalian: " + operasi);
    }
    
    void perkalian (double a, double b){
    hasil = a * b;
    System.out.println("Hasil perkalian(double): " + hasil);
    }
    
    void perkalian (double a, double b, double c){
    hasil = a * b * c;
    System.out.println("Hasil perkalian(double): " + hasil);
    }

    void pembagian (int a, int b){
    operasi = a / b;
    System.out.println("Hasil pembagian: " + operasi);
    }
    
    void pembagian (int a, int b, int c){
    operasi = a / b / c;
    System.out.println("Hasil pembagian: " + operasi);
    }
    
    void pembagian (double a, double b){
    hasil = a / b;
    System.out.println("Hasil pembagian(double): " + hasil);
    }
    
    void pembagian (double a, double b, double c){
    hasil = a / b / c;
    System.out.println("Hasil pembagian(double): " + hasil);
    }

}