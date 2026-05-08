/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_carlosochoa;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Lab3P1_CarlosOchoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion_menu = -1;
        
        while(opcion_menu != 0){
            System.out.println("-----MENU-----");
            System.out.println("1.Permutaciones");
            System.out.println("2.Valores comunes en multiplicacion");
            System.out.println("3.Triangulos Huecos");
            System.out.println("Ingrese 0 para salir");
            System.out.println("Ingrese alguna opcion");
            opcion_menu = scanner.nextInt();
            
            if (opcion_menu == 1){
                int n = 0;
                int r = 0;
                while(n <= 0 || r <= 0 || n < r){
                    System.out.println("Ingrese el valor de n: ");
                    n = scanner.nextInt();
                    
                    System.out.println("Ingrese el valor de r: ");
                    r = scanner.nextInt();
                    
                    if(n <= 0 || r <= 0 || n < r){
                        System.out.println("n no puede ser menor que r, y los dos tienen que ser positivos");
                    }
                    
                }
                int factorialN = 1;
                int contador = 1;
                
                while (contador <= n){
                    factorialN = factorialN * contador;
                    contador++;
                }
                int resta = n - r;
                int factorialresta = 1;
                contador = 1;
                
                while(contador <= resta){
                    factorialresta = factorialresta * contador;
                    contador++;
                }
                int resultado = factorialN / factorialresta;
                
                System.out.println("Resultado de P(" + n +","+ r +")= " + resultado);
                } else if(opcion_menu == 2){
                    int numero1 = 0;
                    int numero2 = 0;
                    
                    while(numero1 < 1 || numero1 > 12){
                        System.out.println("Ingrese el primer numero(1-12): ");
                        numero1 = scanner.nextInt();
                        
                        if(numero1 < 1 || numero1 > 12){
                            System.out.println("Debe estar entre 1 y 12");
                        }
                    }
                    while(numero2 < 1 || numero2 > 12){
                        System.out.println("Ingrese el segundo numero (1-12): ");
                        numero2 = scanner.nextInt();
                        
                        if(numero2 < 1 || numero2 > 12){
                            System.out.println("Debe estar entre 1 y 12");
                        }
                    }
                    int contador1 = 1;
                    while(contador1 <= 12){
                        int valor1 = numero1 * contador1;
                        int contador2 = 1;
                        boolean existe = false;
                        
                        while(contador2 <= 12){
                            int valor2 = numero2 * contador2;
                        }
                    }
                }  
            }
        }
        
    }
    

