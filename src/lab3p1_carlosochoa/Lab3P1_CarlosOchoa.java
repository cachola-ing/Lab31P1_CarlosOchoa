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
                int variable_n = 0;
                int variable_r = 0;
                while(variable_n <= 0 || variable_r <= 0 || variable_n < variable_r){
                    System.out.println("Ingrese el valor de n: ");
                    variable_n = scanner.nextInt();
                    
                    System.out.println("Ingrese el valor de r: ");
                    variable_r = scanner.nextInt();
                    
                    if(variable_n <= 0 || variable_r <= 0 || variable_n < variable_r){
                        System.out.println("n no puede ser menor que r, y los dos tienen que ser positivos");
                    }
                    
                }
                int Factorial_N = 1;
                int contador = 1;
                
                while (contador <= variable_n){
                    Factorial_N = Factorial_N * contador;
                    contador++;
                }
                int resta = variable_n - variable_r;
                int factorialresta = 1;
                contador = 1;
                
                while(contador <= resta){
                    factorialresta = factorialresta * contador;
                    contador++;
                }
                int resultado = Factorial_N / factorialresta;
                
                System.out.println("Resultado de P(" + variable_n +","+ variable_r +")= " + resultado);
                } else if(opcion_menu == 2){
                    int nro1 = 0;
                    int nro2 = 0;
                    
                    while(nro1 < 1 || nro1 > 12){
                        System.out.println("Ingrese el primer numero(1-12): ");
                        nro1 = scanner.nextInt();
                        
                        if(nro1 < 1 || nro1 > 12){
                            System.out.println("Debe estar entre 1 y 12");
                        }
                    }
                    while(nro2 < 1 || nro2 > 12){
                        System.out.println("Ingrese el segundo numero (1-12): ");
                        nro2 = scanner.nextInt();
                        
                        if(nro2 < 1 || nro2 > 12){
                            System.out.println("Debe estar entre 1 y 12");
                        }
                    }
                    int contador1 = 1;
                    while(contador1 <= 12){
                        int valor1 = nro1 * contador1;
                        int contador2 = 1;
                        boolean valor_comun = false;
                        
                        while(contador2 <= 12){
                            int valor2 = nro2 * contador2;
                            
                            if (valor1 == valor2){
                                valor_comun = true;
                            }
                            contador2++;
                        }
                        if(valor_comun == true){
                            System.out.print(valor1 + "");
                        } else{
                            System.out.print("__");
                        }
                        contador1++;
                    }
                    System.out.println("");
                }  else if(opcion_menu == 3){
                    int valor;
                    System.out.println("Ingrese un numero impar mayor o igual a 7: ");
                    valor = scanner.nextInt();
                    
                    int provisional = valor;
                    
                    while(provisional != 0 && provisional != 1){
                        provisional = provisional - 2;
                    }
                    
                   if (valor < 7 || provisional == 0){
                       System.out.println("Tiene que ser impar y >= 7");
                   } else {
                       int fila = 1;
                       
                       while(fila <= valor){
                           int columna = 1;
                           while(columna <= valor){
                               
                               if(fila == 1 || columna == fila || columna == valor){
                                   System.out.print("*");
                               }else{
                                   System.out.print(" ");
                               }
                               columna++;
                           }
                           System.out.println("");
                           fila++;
                       }
                   }
                } else if (opcion_menu == 0){
                    System.out.println("Saliendi...");
                } else {
                    System.out.println("Opcion no valida"); 
                }
            }
        }
        
    }
    

