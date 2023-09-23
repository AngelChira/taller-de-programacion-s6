package semana06;

import java.util.Scanner;

public class Semana06 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        byte n = 5;
        while(true){            
            System.out.println("Tablas del 1 al 12 de: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            byte opcion = teclado.nextByte();
            if(opcion == 5) {
                System.out.println("Ha finalizado el programa.");
                break;
            } else if (opcion>=1 && opcion<=4) {
                int i = 1, numero = 1, resultado = 0;
                switch (opcion) {
                    case 1:
                        while(numero<=12){
                            System.out.println("\nLa tabla de la suma del numero "+numero);
                            while(i<=12){
                                resultado = i + numero;
                                System.out.println(i+" + "+numero+ " = "+resultado);
                                i = i + 1;
                            }
                            i = 0;
                            numero = numero + 1;
                        }
                        System.out.println("");
                        break;
                    case 2:
                        while(numero<=12){
                            System.out.println("\nLa tabla de la resta del numero "+numero);
                            while(i<=12){
                                resultado = i - numero;
                                System.out.println(i+" - "+numero+ " = "+resultado);
                                i = i + 1;
                            }
                            i = 0;
                            numero = numero + 1;
                        }
                        System.out.println("");
                        break;
                    case 3:
                        while(numero<=12){
                            System.out.println("\nLa tabla de la multiplicación del numero "+numero);
                            while(i<=12){
                                resultado = i * numero;
                                System.out.println(i+" x "+numero+ " = "+resultado);
                                i = i + 1;
                            }
                            i = 0;
                            numero = numero + 1;
                        }
                        System.out.println("");
                        break;
                    case 4:
                        float respuestaDivision, numeroDivision=1, countDivision=0;
                        while(numeroDivision<=12){
                            System.out.println("\nLa tabla de la división del numero "+numeroDivision);
                            while(countDivision<=12){
                                respuestaDivision =(float) (countDivision / numeroDivision);
                                System.out.printf("%.0f / %.0f = %.2f %n", countDivision, numeroDivision, respuestaDivision);
                                countDivision = countDivision + 1;
                            }
                            countDivision = 0;
                            numeroDivision = numeroDivision + 1;
                        }
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Error");
                }  
            } else {
                System.out.println("Error, debe ingresar una opción correcta");
            }
        }        
        
    }
}
