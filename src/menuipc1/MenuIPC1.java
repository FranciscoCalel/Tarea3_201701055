/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuipc1;
import java.util.Scanner;
/**
 *
 * @author franc
 */
public class MenuIPC1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {}
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("1. Usuario");
            System.out.println("2. Contador de Digitos");
            System.out.println("3. Tres numero mayor a menor");
            System.out.println("4. Calcular Promedio");
            System.out.println("5. Salir");
            System.out.println("Selecciona un numero");
            opcion = scan.nextInt();
            
            switch(opcion){
                case 1:
                    usuarios();
                break;
                case 2:
                    contadordedigitos();
                break;
                case 3:
                    tresnumerosdemayoramenor();
                break;
                case 4:
                    calcularpromedio();
                break;
                case 5:
                    salir();
                break;
                default:
                break;
                
            }
        }
        
    }
    

